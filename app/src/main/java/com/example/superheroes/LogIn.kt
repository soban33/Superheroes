package com.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        setSupportActionBar(mainToolbar)
        title = "Log In"

        val validId = "01234"
        val validPass = arrayOf("marvel","dc")


        loginbutton.setOnClickListener(){

            val id = yourid.text.toString()
            val pass = yourpass.text.toString()

           if (validId==id && validPass.contains(pass)) {
               val intent = Intent(this, MainActivity::class.java)
               intent.putExtra("title",pass)
               startActivity(intent)
               finish()
           }else{
               //do nothing
           }
        }
    }
}