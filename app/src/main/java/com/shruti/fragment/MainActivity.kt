package com.shruti.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.shruti.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityinterface: Activityinterface
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)
        binding.btactivity.setOnClickListener {
            activityinterface.changeFragmentText()

        }
    }
    fun changeText (){
        System.out.println("Changed from activity")
        binding.tvhello.setText("changed from fragment")
    }
}