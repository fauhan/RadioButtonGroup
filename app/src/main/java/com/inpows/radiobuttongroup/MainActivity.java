package com.inpows.radiobuttongroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean jawaban = false;
    RadioButton j1;
    RadioButton j2;
    RadioButton j3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup list_opsi = findViewById(R.id.opsi);
        j1 = findViewById(R.id.j1);
        j2 = findViewById(R.id.j2);
        j3 = findViewById(R.id.j3);

        list_opsi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id){
                    case R.id.j1:
                        jawaban = true;
                        break;
                    case R.id.j2:
                        jawaban = false;
                        break;
                    case R.id.j3:
                        jawaban = false;
                        break;
                }
            }
        });

        Button jawab = findViewById(R.id.jawab);
        jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Cara1();
                Cara2();
            }
        });

        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list_opsi.clearCheck();
            }
        });
    }

    private void Cara2() {
        if (j1.isChecked()) {
            ShowToast("Jawaban Kamu Benar.");
        } else if (j2.isChecked()) {
            ShowToast("Jawaban Kamu Tidak Tepat.");
        } else {
            ShowToast("Jawaban Kamu Tidak Tepat.");
        }
    }

    private void Cara1() {
        if (!jawaban) {
            ShowToast("Jawaban Kamu Tidak Tepat.");
        } else {
            ShowToast("Jawaban Kamu Benar.");
        }
    }

    private void ShowToast(String message) {
        Toast.makeText(getApplication(), message, Toast.LENGTH_SHORT).show();
    }
}
