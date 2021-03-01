package com.smartdev.trainingkotlin

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_CalLength.setOnClickListener {
            if(et_volume.text.isNotEmpty() && et_lebar.text.isNotEmpty() && et_tinggi.text.isNotEmpty()){
                var lebar = Integer.valueOf(et_lebar.text.toString())
                var tinggi = Integer.valueOf(et_tinggi.text.toString())
                var volume = Integer.valueOf(et_volume.text.toString())
                var hasil = volume / tinggi / lebar

                (et_panjang as TextView).text = hasil.toString()
            }
            else{
                Toast.makeText(this, "ada kolom yang kosong", Toast.LENGTH_SHORT).show()
            }

        }

        btn_CalHeight.setOnClickListener{
            if (et_volume.text.isNotEmpty() && et_lebar.text.isNotEmpty() && et_panjang.text.isNotEmpty() ){
                var panjang = Integer.valueOf(et_panjang.text.toString())
                var lebar = Integer.valueOf(et_lebar.text.toString())
                var volume = Integer.valueOf(et_volume.text.toString())
                var hasil = volume / panjang / lebar

                (et_tinggi as TextView).text = hasil.toString()
            }else{
                Toast.makeText(this, "ada kolom yang kosong", Toast.LENGTH_SHORT).show()
            }

        }
        btn_CalWidth.setOnClickListener{
            if (et_volume.text.isNotEmpty() && et_panjang.text.isNotEmpty() && et_tinggi.text.isNotEmpty()){
                var panjang = Integer.valueOf(et_panjang.text.toString())
                var tinggi = Integer.valueOf(et_tinggi.text.toString())
                var volume = Integer.valueOf(et_volume.text.toString())
                val hasil = volume / panjang / tinggi

                (et_lebar as TextView).text = hasil.toString()
            }else{
                Toast.makeText(this, "ada kolom yang kosong", Toast.LENGTH_SHORT).show()
            }

        }

        btn_CalVolume.setOnClickListener {
            if (et_panjang.text.isNotEmpty() && et_tinggi.text.isNotEmpty() && et_lebar.text.isNotEmpty()){
                var panjang = Integer.valueOf(et_panjang.text.toString())
                var lebar = Integer.valueOf(et_lebar.text.toString())
                var tinggi = Integer.valueOf(et_tinggi.text.toString())
                var hasil = panjang * lebar * tinggi

                (et_volume as TextView).text = hasil.toString()
            }else{
                Toast.makeText(this, "ada kolom yang kosong",Toast.LENGTH_SHORT).show()
            }

        }

    }
}