package net.agusharyanto.belajararray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"Mango","Banana","Guava"};
    int[] prices = {15000, 20000, 10000};
    TextView textViewFruit;
    Spinner spinnerFruit;
    String nama = "Zainal Arifin";
    int jumlah = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewFruit = (TextView) findViewById(R.id.textViewFruit);
        spinnerFruit = (Spinner) findViewById(R.id.spinnerFruit);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, fruits);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinnerFruit.setAdapter(spinnerArrayAdapter);
        spinnerFruit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplication(), "position :"+position+" id:"+id,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });
        printFruit();
        //printNama();
    }

    private void printNama() {
        String snama = "";
        for (int i=0; i<jumlah; i++){
            snama= snama+nama+"\n";
        }
        textViewFruit.setText(snama);

    }

    private void printFruit() {
        String buah="";
        for (int i=0; i<fruits.length; i++){
            buah = buah+fruits[i] +"-"+prices[i]+"\n";
        }
        textViewFruit.setText(buah);
    }
}
