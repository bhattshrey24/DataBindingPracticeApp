package com.example.databindingpracticeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingpracticeapp.databinding.ActivityMainBinding
import com.example.databindingpracticeapp.model.News

// From this vid : https://www.youtube.com/watch?v=9lCIocQ76CI&t=4s
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
                this,
        R.layout.activity_main
        ) // This is used in place of "setContentView(R.layout.activity_main)" when using data binding

        val myNews = News("My Title.... ", "My Subtitle......")
        binding.news = myNews //This news variable is the variable
        // that we defined in the activity_main.xml. And this
        // is how we provide data to the variables of data binding
    }
}