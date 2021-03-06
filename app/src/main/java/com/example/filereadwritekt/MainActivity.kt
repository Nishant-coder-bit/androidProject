package com.example.filereadwritekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWrite.setOnClickListener{
            val dataDir=ContextCompat.getDataDir(this);
            val myFile= File(dataDir,"file.txt");
            myFile.writeText(editText.text.toString());
        }
        btnRead.setOnClickListener {
            val dataDir=ContextCompat.getDataDir(this);
            val myFile= File(dataDir,"file.txt");
            textView.text=myFile.readText();
        }

    }
}


