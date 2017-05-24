package com.project.shoplist.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Main2Activity : AppCompatActivity() {


    var txtdisplayname : TextView?=null

    var txtdisplayage : TextView ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        txtdisplayname = findViewById(R.id.txtdisplayourname)as TextView?

        txtdisplayage = findViewById(R.id.txtdisplayourage)as TextView?

       var  intent : Intent = getIntent()

            var nameuser: String = intent.getStringExtra("username")

            var ageuser: String = intent.getStringExtra("userage")

            txtdisplayname?.setText(nameuser)

            txtdisplayage?.setText(ageuser)





    }
}
