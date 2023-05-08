package com.romans.appforunityintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.romans.appforunityintegration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var threadFlag = true
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView (it.root) }

        binding.button2Btn.setOnClickListener {
            threadFlag = !threadFlag
            startTread()
        }
    }


    private fun startTread() {
        Thread {
            while (threadFlag) {
                System.err.println("Tread")
                //TODO делать что-то из библиотеки
                Thread.sleep(1000)
            }
        }.start()
    }
}