package net.agusharyanto.belajararray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"Mango","Banana","Guava"};
    int[] values = {15000, 20000, 10000, 40000};
    TextView textViewFruit;
    String nama = "Zainal Arifin";
    int jumlah = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewFruit = (TextView) findViewById(R.id.textViewFruit);
       // printFruit();
        printNama();
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
            buah = buah+fruits[i]+"\n";
        }
        textViewFruit.setText(buah);
    }
}
