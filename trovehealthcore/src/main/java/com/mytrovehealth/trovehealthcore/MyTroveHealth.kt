package com.mytrovehealth.trovehealthcore

import android.content.Context
import android.content.Intent

class MyTroveHealth {

    var mContext:Context?= null

    fun initialize( context: Context){
        mContext = context
    }


    fun launchIdentityVerification(){
        mContext?.let { context ->
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }
}