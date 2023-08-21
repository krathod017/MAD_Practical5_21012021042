package com.example.mad_practical5_21012021042

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnbrowse:Button=findViewById(R.id.btnbrowse)
        val browsetxt:EditText=findViewById(R.id.editTextText)
        btnbrowse.setOnClickListener {
            openbrowser(browsetxt.text.toString())
        }

    }
    fun openbrowser(url: String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also{
            startActivity(it)

        }

    }
    fun opencall(num:String){

    }
    fun opencallLog(){
         Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also{
             startActivity(it)
         }
    }
    fun opengalary(){
         Intent(Intent.ACTION_VIEW).setType("image/*").also {
             startActivity(it)
         }
    }
    fun opencamera(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
            startActivity(it)
        }
    }
    fun openAlarm(){
         Intent(AlarmClock.ACTION_SHOW_ALARMS).also {
             startActivity(it)
         }
    }
}
