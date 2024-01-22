package com.example.dwi_androidbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var namaEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var NISEdit: EditText
    private lateinit var submitBtn: Button

    private val Name_KEY: String = "nama"
    private val Class_KEY: String = "kelas"
    private val NIS_KEY: String = "NIS"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        NISEdit = findViewById(R.id.NISEdit)
        submitBtn = findViewById(R.id.submitBtn)

        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(Name_KEY, namaEdit.text.toString())
            intent.putExtra(Class_KEY, kelasEdit.text.toString())
            intent.putExtra(NIS_KEY, NISEdit.text.toString())
            startActivity(intent)
        }
    }
}