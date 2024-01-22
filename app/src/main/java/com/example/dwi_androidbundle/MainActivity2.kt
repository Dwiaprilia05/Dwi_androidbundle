package com.example.dwi_androidbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var namaView: TextView
    private lateinit var kelasView: TextView
    private lateinit var NISView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        namaView = findViewById(R.id.namaView)
        kelasView = findViewById(R.id.kelasView)
        NISView = findViewById(R.id.NISView)

        val extras = intent.extras
        namaView.text = extras?.getString("nama")
        kelasView.text = extras?.getString("kelas")
        NISView.text = extras?.getString("NIS")

    }
    }
