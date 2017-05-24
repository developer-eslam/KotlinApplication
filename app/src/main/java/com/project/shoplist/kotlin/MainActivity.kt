package com.project.shoplist.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var txtdisplay : TextView ?=null

    var btnshow : Button ? = null

    var txtinsertname:EditText ? = null
    var txtinsertage:EditText ? = null

    var strname : String ?=null

    var strage : String ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtdisplay  = findViewById(R.id.txtDisplay) as TextView?

        btnshow = findViewById(R.id.btnshow) as Button?

        txtinsertname = findViewById(R.id.txtenteryourname)as EditText?

        txtinsertage = findViewById(R.id.txtenteryourage)as EditText?

        btnshow?.setOnClickListener {



            strname = txtinsertname!!.text.toString()

            strage = txtinsertage!!.text.toString()

            var intent : Intent = Intent(this,Main2Activity::class.java)
            intent.putExtra("username",strname)
            intent.putExtra("userage",strage)

            startActivity(intent)



        }



    }
}
