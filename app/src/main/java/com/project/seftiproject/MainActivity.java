package com.project.seftiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText MskNama,MskNPM,TbTtl,MskAgama,inputFklts,inputprodi;
    private Button btnGetData;
    String Namamu,NPMmu,Ttl,agamaMu,FakultasMu,ProdiMu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MskNama    = (EditText) findViewById(R.id.isiNama);
        MskNPM     = (EditText) findViewById(R.id.isiNPM);
        TbTtl      = (EditText) findViewById(R.id.isiTtl);
        MskAgama    = (EditText) findViewById(R.id.isiAgama);
        inputFklts = (EditText) findViewById(R.id.isiFakultas);
        inputprodi    = (EditText) findViewById(R.id.isiProdi);
        btnGetData  = (Button) findViewById(R.id.btndata);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Namamu       = MskNama.getText().toString();
                NPMmu        = MskNPM .getText().toString();
                Ttl          = TbTtl.getText().toString();
                agamaMu      = MskAgama.getText().toString();
                FakultasMu   = inputFklts.getText().toString();
                ProdiMu      = inputprodi.getText().toString();

                Intent go = new Intent(MainActivity.this,hasil.class);
                go.putExtra("Nama",Namamu);
                go.putExtra("Npm",NPMmu);
                go.putExtra("Ttl",Ttl);
                go.putExtra("Agama",agamaMu);
                go.putExtra("Fakultas",FakultasMu);
                go.putExtra("Prodi",ProdiMu);
                startActivity(go);

                finish();
            }
        });

    }
}