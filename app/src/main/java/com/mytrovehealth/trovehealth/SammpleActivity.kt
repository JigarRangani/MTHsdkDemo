package com.mytrovehealth.trovehealth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mytrovehealth.trovehealth.databinding.ActivitySampleBinding
import com.mytrovehealth.trovehealthcore.MyTroveHealth

class SammpleActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySampleBinding

    var myTroveHealth = MyTroveHealth()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myTroveHealth.initialize(this)
        binding.tvLaunch.setOnClickListener {
            myTroveHealth.launchIdentityVerification()
        }
    }
}