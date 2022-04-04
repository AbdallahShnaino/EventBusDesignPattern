package com.example.eventbusproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.eventbus.Bus.EventBus
import com.example.eventbus.Clients.A
import com.example.eventbusproject.Clients.A_Activity
import com.example.eventbusproject.Clients.B_Activity
import com.example.eventbusproject.Clients.C_Activity
import com.example.eventbusproject.Messages.CustomMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var activityA = findViewById<Button>(R.id.a_activityBtn)
        var activityB = findViewById<Button>(R.id.b_activityBtn)
        var activityC = findViewById<Button>(R.id.c_activityBtn)


        activityA.setOnClickListener {
            var intent = Intent(this , A_Activity::class.java)
            startActivity(intent)
        }
        activityB.setOnClickListener {
            var intent = Intent(this , B_Activity::class.java)
            startActivity(intent)
        }
        activityC.setOnClickListener {
            var intent = Intent(this , C_Activity::class.java)
            startActivity(intent)
        }
        /*
        *    var a = A()
           var bus = EventBus.getBusInstance()
           bus.setSubscribers(a)
           var message = CustomMessage()
           message.setMessageSender(a)
           message.messageBody = "Hello World"
           a.sendToOther(message)
        * */
    }
}