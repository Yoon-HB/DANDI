package com.example.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practice.databinding.ActivityLogBinding

class set_timeActivity : AppCompatActivity() {
    lateinit var binding: ActivityLogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val itemList = listOf("알림음 선택", "기본음1", "기본음2", "기본음3")

    }

}
