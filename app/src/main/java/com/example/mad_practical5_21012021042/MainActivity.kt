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
        val btncall:Button=findViewById(R.id.button2)
        val calltxt:EditText=findViewById(R.id.editTextText2)
        btncall.setOnClickListener{
            opencall(calltxt.text.toString())
        }
        val callLog:Button=findViewById(R.id.button3)
        callLog.setOnClickListener{
            opencallLog()
        }
        val gallery:Button=findViewById(R.id.button4)
        callLog.setOnClickListener {
            opengalary()
        }
        val camera:Button=findViewById(R.id.button5)
        callLog.setOnClickListener{
            opencamera()
        }
        val Alarm:Button=findViewById(R.id.button6)
        callLog.setOnClickListener{
            openAlarm()
        }
    }
    fun openbrowser(url: String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also{
            startActivity(it)
        }
    }
    fun opencall(num:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$no")).also{
            startActivity(it)
        }
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
