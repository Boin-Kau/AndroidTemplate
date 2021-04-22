package com.example.forsh.config

import android.app.Application
import android.content.SharedPreferences
import android.util.Log
import java.util.concurrent.TimeUnit

class ApplicationClass : Application() {

    // 실 서버
    // var BASE_URL = ""

    // 테스트 서버
    // var BASE_URL = ""


    // 코틀린의 전역변수 문법
    companion object {

        lateinit var instance: ApplicationClass
            private set

        // 만들어져있는 SharedPreferences 를 사용해야합니다. 재생성하지 않도록 유념해주세요
        lateinit var sSharedPreferences: SharedPreferences

        // JWT Token Header 키 값
//        val X_ACCESS_TOKEN = "X-ACCESS-TOKEN"

        // Retrofit 인스턴스, 앱 실행시 한번만 생성하여 사용합니다.
//        lateinit var sRetrofit: Retrofit
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        sSharedPreferences =
            applicationContext.getSharedPreferences(
                applicationContext.packageName,
                MODE_PRIVATE
            )

        // 레트로핏 인스턴스 생성
//        initRetrofitInstance()
    }


    // 연결타임아웃시간 5초
//    private fun initRetrofitInstance() {
//        val client: OkHttpClient = OkHttpClient.Builder()
//            .readTimeout(5000, TimeUnit.MILLISECONDS)
//            .connectTimeout(5000, TimeUnit.MILLISECONDS)
//            .addInterceptor(HttpLoggingInterceptor { message: String ->
//                Log.d(
//                    "network_info",
//                    message
//                )
//            }.setLevel(HttpLoggingInterceptor.Level.BODY)) // API Response 로그 작성용
//            .addNetworkInterceptor(XAccessTokenInterceptor())
//            .build()
//
//        sRetrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .client(client)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
}