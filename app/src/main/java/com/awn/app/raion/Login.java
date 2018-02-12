package com.awn.app.raion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText edtNim, edtPass;
    Button btnLogin;
    Boolean cek;
    String nims;
    int now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtNim = (EditText) findViewById(R.id.edtUser);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    //identifikasi fakultas
    public String fak() {
        String fakultas;
        int total = 0;
        nims = edtNim.getText().toString();
        String[] nima = nims.split("");

        if (nima.length == 16) {
            if (nima[4].equalsIgnoreCase("1")) {
                int empat = Integer.parseInt(nima[5]);
                total = empat + 10;
            } else if (nima[4].equalsIgnoreCase("0")) {
                total = Integer.parseInt(nima[5]);
            } else {
                total = -1;
            }
        } else total = -1;

        int a = Integer.parseInt(nima[1]);
        int b = Integer.parseInt(nima[2]);
        int tahun = (a*10) + b;
        now = 17 - tahun;

        if (total == 1) {
            fakultas = "Hukum";
        } else if (total == 2) {
            fakultas = "Ekonomi dan Bisnis";
        } else if (total == 3) {
            fakultas = "Ilmu Administrasi";
        } else if (total == 4) {
            fakultas = "Pertanian";
        } else if (total == 5) {
            fakultas = "Peternakan";
        } else if (total == 6) {
            fakultas = "Teknik";
        } else if (total == 7) {
            fakultas = "Kedokteran";
        } else if (total == 8) {
            fakultas = "Perikanan dan Ilmu Kelautan";
        } else if (total == 9) {
            fakultas = "Matematika dan Ilmu Pengetahuan Alam";
        } else if (total == 10) {
            fakultas = "Teknologi Pertanian";
        } else if (total == 11) {
            fakultas = "Ilmu Sosial dan Ilmu Politik";
        } else if (total == 12) {
            fakultas = "Ilmu Budaya";
        } else if (total == 13) {
            fakultas = "Kedokteran Hewan";
        } else if (total == 14) {
            fakultas = "Kedokteran Gigi";
        } else if (total == 15) {
            fakultas = "Ilmu Komputer";
        } else {
            fakultas = "Salah";
        }

        if (!fakultas.equalsIgnoreCase("Salah")) {
            return fakultas;
        } else return null;
    }

    //Cek Kolom
    public void isChecked() {
        cek = true;
        if (edtNim.getText().length() == 0) {
            cek = false;
            edtNim.setError("Isi NIM");
        } else if (edtPass.getText().length() == 0) {
            cek = false;
            edtPass.setError("Isi Password");
        }
    }

    //proses Login
    public void Login(View view) {
        isChecked();
        if (cek) {
            String pass;
            pass = edtPass.getText().toString();
            if (fak() != null && pass.equalsIgnoreCase("admin")) {
                //Toast.makeText(this, nims + fak() + now, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, ContainerActivity.class);
                intent.putExtra("fakultas", fak());
                intent.putExtra("nim", nims);
                intent.putExtra("tahun", now);
                startActivity(intent);
                finish();
            } else if (fak() == null) {
                Toast.makeText(this, "NIM Tidak Terdaftar", Toast.LENGTH_SHORT).show();
            } else if (!pass.equalsIgnoreCase("admin")) {
                Toast.makeText(this, "Password Salah", Toast.LENGTH_SHORT).show();
            }
        }
    }
}