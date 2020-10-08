package com.ananta.pendapatantoko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val pendapatanLogic=PendapatanLogic();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inialisasi variable
        val hari1 = edtHP.text;
        val hari2 = edtHS.text;

        btnHitung.setOnClickListener(){
            if(edtHP.text.toString().isEmpty()){
                edtHP.setError("Harus diisi!!");
            }else if(edtHS.text.toString().isEmpty()){
                edtHS.setError("Harus diisi!");
            }
            edtHasil.text="Hasil Pendapatan = ${
                pendapatanLogic.hitungPendapatan(
                    hari1.toString().toDouble(), 
                    hari2.toString().toDouble()
                )}"
        }
        btnKeluar.setOnClickListener(){
            finish()
            System.exit(0)
        }
    }
}