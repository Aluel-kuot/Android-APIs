package com.example.adalabapis

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("/products")
    fun getProducts():Call<ProductResponse>
}