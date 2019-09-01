package com.example.kalkulator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.Buffer;
import java.nio.IntBuffer;

public class MainActivity extends AppCompatActivity {

    private Button satu;
    private Button dua;
    private Button tiga;
    private Button empat;
    private Button lima;
    private Button enam;
    private Button tujuh;
    private Button delapan;
    private Button sembilan;
    private Button nol;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private Button sama;

    private EditText soal;

    private final char pertambahan = '+';
    private final char pengurangan = '-';
    private final char perkalian = '*';
    private final char pembagian = '/';

    String hasil = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIView();
        klikManja();



    }

    private void klikManja(){
        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "0");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "1");
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "2");
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "3");
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "4");
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "5");
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "6");
            }
        });
        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "7");
            }
        });
        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "8");
            }
        });
        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "9");
            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "+");
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "-");
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "*");
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soal.setText(soal.getText().toString() + "/");
            }
        });
        sama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String soal_string = soal.getText().toString();
                String angkaku = "0";
                String angka = "0";
                double number = 0;
                double numberku = 0;
                String hasilku = "0";
                int b = 0;
                for (int i=0; i< soal_string.length();i ++){
                    char operasi = soal_string.charAt(i);
                    if (operasi == '+' || operasi == '-' ||operasi == '*'||operasi == '/'){
                        int j;
                        for (j= i +1 ; j <soal_string.length(); j++ ){
                            char bilangan = soal_string.charAt(j);
                            if (bilangan == '+'||bilangan == '-'||bilangan == '*'||bilangan == '/'){

                            } else {
                                angka = angka + String.valueOf(bilangan);
                            }
                        }
                        if(b==0){

                        }else{
                            angkaku = hasilku;
                        }
                        b++;

                        i = j-1;
                        number = Double.parseDouble(angka);
                        numberku = Double.parseDouble(angkaku);
                        if(b==0){
                            if (operasi == '+'){
                                hasilku = String.valueOf((Double.parseDouble(hasilku) + (numberku+number)));
                            }else if (operasi == '-'){
                                hasilku = String.valueOf((Double.parseDouble(hasilku) + (numberku-number)));
                            }else if (operasi == '*'){
                                hasilku = String.valueOf((Double.parseDouble(hasilku) + (numberku*number)));
                            }else if (operasi == '/'){
                                hasilku = String.valueOf((Double.parseDouble(hasilku) + (numberku/number)));
                            }
                        }else{
                            if (operasi == '+'){
                                hasilku = String.valueOf(numberku+number);
                            }else if (operasi == '-'){
                                hasilku = String.valueOf(numberku-number);
                            }else if (operasi == '*'){
                                hasilku = String.valueOf(numberku*number);
                            }else if (operasi == '/'){
                                hasilku = String.valueOf(numberku/number);
                            }

                        }
                        number = 0;
                        numberku = 0;
                        angkaku = "0";
                        angka = "0";
                    }else{
                        angkaku= angkaku+ String.valueOf(soal_string.charAt(i));
                        System.out.println(angkaku);
                    }
                }

                soal.setText(hasilku);
                hasil = "";
            }
        });

    }

    private void initbtn(final Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil = hasil + btn.getText().toString();
                EditText hasilnya =  findViewById(R.id.et_1);

                StringBuffer sb = new StringBuffer(hasil);
                sb.delete(hasil.length()-2,hasil.length());
                hasilnya.setText(hasil);
            }
        });
    }

    private void setupUIView(){
        satu = findViewById(R.id.btn_1);
        dua = findViewById(R.id.btn_2);
        tiga = findViewById(R.id.btn_3);
        empat = findViewById(R.id.btn_4);
        lima = findViewById(R.id.btn_5);
        enam = findViewById(R.id.btn_6);
        tujuh = findViewById(R.id.btn_7);
        delapan = findViewById(R.id.btn_8);
        sembilan = findViewById(R.id.btn_9);
        nol = findViewById(R.id.btn_0);
        tambah = findViewById(R.id.btn_tambah);
        kurang = findViewById(R.id.btn_kurang);
        kali = findViewById(R.id.btn_kali);
        bagi = findViewById(R.id.btn_bagi);
        sama = findViewById(R.id.btn_sama);
        soal = findViewById(R.id.et_1);







    }

    public void clear(View view) {
        soal.setText("");

    }
}
