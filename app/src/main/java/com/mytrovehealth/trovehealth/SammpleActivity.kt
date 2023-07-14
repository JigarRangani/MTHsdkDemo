package com.mytrovehealth.trovehealth

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mytrovehealth.trovehealth.databinding.ActivitySampleBinding
import com.mytrovehealth.trovehealthcore.MyTroveHealth
import java.io.IOException

class SammpleActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySampleBinding

    var myTroveHealth = MyTroveHealth()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myTroveHealth.initialize(this)
        binding.btnSubmit.setOnClickListener {
            myTroveHealth.checkCognitoToken(this)
//            getCountryCode(this)
        }
    }

    fun getCountryCode(context: Context): PatientDataSample{
        val startTime = System.currentTimeMillis()
        lateinit var jsonString: String
        try {
            jsonString = context.assets.open("sample2.json")
                .bufferedReader()
                .use { it.readText() }
        } catch (ioException: IOException) {
//            AppLogger.d(ioException)
        }

        val listCountryType = object : TypeToken<PatientDataSample>() {}.type

        val dataModel:PatientDataSample = Gson().fromJson(jsonString, listCountryType)

        val endTime = System.currentTimeMillis()
        val executionTime = endTime - startTime

        println("Execution time: $executionTime milliseconds")
        return dataModel
    }
}