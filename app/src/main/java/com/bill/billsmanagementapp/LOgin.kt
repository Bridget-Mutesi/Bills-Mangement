package com.bill.billsmanagementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bill.billsmanagementapp.databinding.ActivityLoginBinding

class LOgin : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}