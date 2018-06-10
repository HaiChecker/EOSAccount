package com.shiwenping

import com.google.gson.Gson
import com.shiwenping.been.Info
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request

class Chain(val url:String) {
     val get_info = "/v1/chain/get_info"
    fun getInfo():Info
    {
        val res = OkHttpClient()
                .newCall(Request.Builder()
                        .url("$url$get_info")
                        .get()
                        .build()).execute()
        return Gson().fromJson(res.body().string(),Info::class.java)
    }


}