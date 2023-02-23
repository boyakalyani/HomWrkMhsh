//package com.example.homwrkmhsh
//
//import android.content.Intent
//import android.content.Intent.ACTION_VIEW
//import android.net.Uri
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import com.example.homwrkmhsh.R.id.btn1_id as btn1_id1
//
//
//class MainActivity2 : AppCompatActivity() {
//lateinit var btn:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        setContentView(R.layout.activity_main2)
//        super.onCreate(savedInstanceState)
//        btn=findViewById(R.id.edt2_id)
//        btn.setOnClickListener(){
//                var explisitintent=Intent(this,MainActivity::class.java)
//            startActivity(explisitintent)
//            }
//        }
//    }



package com.example.homeworkmhs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homwrkmhsh.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}