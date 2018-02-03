package com.inpows.radiobuttongroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean jawaban = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup list_opsi = findViewById(R.id.opsi);
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
                if (jawaban != true) {
                    Toast.makeText(getApplication(), "Jawaban Kamu Tidak Tepat.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplication(), "Jawaban Kamu Benar", Toast.LENGTH_SHORT).show();
                }
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
}
