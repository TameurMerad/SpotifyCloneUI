package com.example.spotifyuiclone

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.spotifyuiclone.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_SpotifyUIClone)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT




//        val signup : Button = findViewById(R.id.button)
        val phoneNum = findViewById<Button>(R.id.button2)
        val google = findViewById<Button>(R.id.button3)
        val facebook = findViewById<Button>(R.id.button4)


        binding.button.setOnClickListener(){
//            Toast.makeText(this, "u clicked on sign up", Toast.LENGTH_SHORT).show()
            var homrP = Intent(this ,HomePage::class.java)
            startActivity(homrP)
        }

//        signup.setOnClickListener(){
//            Toast.makeText(this, "u clicked on sign up", Toast.LENGTH_SHORT).show()
//        }


        phoneNum.setOnClickListener(){
            Toast.makeText(this, "u clicked on continue with number", Toast.LENGTH_SHORT).show()
        }
        google.setOnClickListener(){
            Toast.makeText(this, "u clicked on continue with google", Toast.LENGTH_SHORT).show()
        }
        facebook.setOnClickListener(){
            Toast.makeText(this, "u clicked on continue with facebook", Toast.LENGTH_SHORT).show()
        }




    }
}