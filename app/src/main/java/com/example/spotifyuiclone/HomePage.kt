package com.example.spotifyuiclone

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.constraint.ConstraintSet
import android.support.v4.app.ActivityCompat
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.spotifyuiclone.databinding.ActivityMainBinding
import java.util.jar.Manifest

class HomePage : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
//        requestPerm()
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE )!=
            PackageManager.PERMISSION_GRANTED){ ActivityCompat.requestPermissions(this,
            arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE), 0) }

        var click1 = findViewById<View>(R.id.artist_lay).setOnClickListener(){
            Toast.makeText(this,"siliiina",Toast.LENGTH_SHORT).show()
        }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT






    }

//    private fun hasForgroundLocationPerm() =
//        ActivityCompat.checkSelfPermission(
//            this,
//            android.Manifest.permission.ACCESS_COARSE_LOCATION
//        ) == PackageManager.PERMISSION_GRANTED



//    private fun hasWritePerm() =
//        ActivityCompat.checkSelfPermission(
//            this,
//            android.Manifest.permission.WRITE_EXTERNAL_STORAGE
//        ) == PackageManager.PERMISSION_GRANTED

//    private fun requestPerm() {
//        val unGranted = mutableListOf<String>()
//        if (!hasForgroundLocationPerm()) {
//            unGranted.add(android.Manifest.permission.ACCESS_COARSE_LOCATION)
//
//        }
//        if (!hasWritePerm()) {
//            unGranted.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
//        }
//        if (unGranted.isNotEmpty()) {
//            ActivityCompat.requestPermissions(this, unGranted.toTypedArray(), 0)
//        }


    }
