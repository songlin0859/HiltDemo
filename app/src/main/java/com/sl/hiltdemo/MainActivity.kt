package com.sl.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sl.hiltdemo.data.User
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user: User
    @Inject
    lateinit var retrofit: Retrofit
    @Inject
    lateinit var retrofit1: Retrofit
    @Inject
    lateinit var okHttpClient: OkHttpClient
    @Inject
    lateinit var okHttpClient1: OkHttpClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //textView.text = user.name
        textView.text = "retrofit === retrofit1 :${retrofit === retrofit1} and okHttpClient === okHttpClient1 : ${okHttpClient === okHttpClient1}"
    }
}