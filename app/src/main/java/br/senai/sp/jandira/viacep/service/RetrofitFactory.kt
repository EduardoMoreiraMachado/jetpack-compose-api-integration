package br.senai.sp.jandira.viacep.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitFactory {

    val url = "https://viacep.com.br/ws/"

    val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun retrofitService(): CepRetrofitService {

        return retrofitFactory.create(CepRetrofitService::class.java)

    }

}