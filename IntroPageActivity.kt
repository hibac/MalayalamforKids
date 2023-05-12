package com.malayalamforkids

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class IntroPageActivity : AppCompatActivity() {

 override fun onCreate(savedInstanceState: Bundle?) {      
 super.onCreate(savedInstanceState)
 setContentView(R.layout.intro_page)

  
val intro = findViewById(R.id.intro_click_me) as ImageView
intro.setOnClickListener { 

Toast.makeText(this@IntroPageActivity, "clicked", Toast.LENGTH_SHORT).show()

 val intent = Intent(this, MainPageActivity::class.java)
 startActivity(intent)

        }



}

    }
