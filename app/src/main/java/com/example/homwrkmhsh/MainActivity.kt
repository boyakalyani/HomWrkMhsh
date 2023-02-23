package com.example.homeworkmhs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.homwrkmhsh.MainActivity2
import com.example.homwrkmhsh.R

class MainActivity : AppCompatActivity() {
    lateinit var btnrey:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnrey=findViewById(R.id.btn1_id)
        btnrey.setOnClickListener(){
            var explicist_intent=Intent(this, MainActivity2::class.java)
            startActivity(explicist_intent)
        }
    }
}
//            var implicit_intent= Intent(Intent.ACTION_VIEW,Uri.parse("https://www.javatpoint.com/kotlin-android-explicit-intent"))
//                    startActivity(implicit_intent)
