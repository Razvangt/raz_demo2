package com.example.raz_demo2.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.raz_demo2.R
import com.example.raz_demo2.databinding.ActivityMainBinding
import com.example.raz_demo2.ui.viewmodel.AdviceViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val adviceViewModel : AdviceViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        adviceViewModel.adviceModel.observe(this, Observer {
            binding.texto.text = it?.slip?.advice
        })
        binding.button.setOnClickListener {
            adviceViewModel.randomAdvice()
        }
    }
}