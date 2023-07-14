package com.mytrovehealth.trovehealthcore

import android.content.Context
import android.content.Intent
import android.util.Log
import com.mytrovehealth.di.repositoryModule
import com.mytrovehealth.di.viewModelModule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.io.IOException


class MyTroveHealth {

    var mContext: Context? = null

    fun initialize(context: Context) {
        mContext = context

        GlobalContext.startKoin {
            androidContext(context)
            androidLogger(Level.NONE)
            modules(listOf(repositoryModule, viewModelModule))
        }
    }


    fun launchIdentityVerification() {
        mContext?.let { context ->
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }


    fun checkCognitoToken(context: Context) {
        val client = OkHttpClient()

        GlobalScope.launch(Dispatchers.IO) {
            val requestBody: RequestBody = FormBody.Builder()
                .add("grant_type", "client_credentials")
                .add("client_id", "4pgntkgkfhv7l1art94rnlkjoo")
                .add("client_secret", "2dgqgvbdocc9r0svpinpgrlsj92fq2in7se46v047c9rtv5arep")
                .build()

            val request: Request = Request.Builder()
                .url("https://ccdaparser-dev.auth.us-east-1.amazoncognito.com/oauth2/token")
                .post(requestBody)
                .build()

            try {
                // Execute the request
                val response = client.newCall(request).execute()

                // Parse the response
                val responseBody = response.body!!.string()
                // Extract the access token from the response JSON
                val accessToken = JSONObject(responseBody).getString("access_token")

                Log.e("sdk", "token = $accessToken")
                // Use the access token for further API calls
                // ...
            } catch (e: IOException) {
                e.printStackTrace()
            } catch (e: JSONException) {
                e.printStackTrace()
            }

        }
    }
}