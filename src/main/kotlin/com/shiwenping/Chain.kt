package com.shiwenping

import com.google.gson.Gson
import com.shiwenping.been.Block
import com.shiwenping.been.Info
import com.squareup.okhttp.MediaType
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import com.squareup.okhttp.RequestBody

class Chain(val url:String) {
    val get_info = "/v1/chain/get_info"
    val get_block = "/v1/chain/get_block"
    fun getInfo():Info
    {
        val res = OkHttpClient()
                .newCall(Request.Builder()
                        .url("$url$get_info")
                        .get()
                        .build()).execute()
        return getObject(res.body().string(),Info::class.java)
    }

    fun getBlock(block_num_or_id:Int): Block
    {
        val map = mapOf(Pair("block_num_or_id",block_num_or_id.toString()))
        val res = OkHttpClient()
                .newCall(Request.Builder()
                        .url("$url$get_block")
                        .post(body(getString(map)))
                        .build()).execute()
        return getObject(res.body().string(),Block::class.java)
    }

    fun <T> getObject(value: String, cls: Class<T>): T {
        return Gson().fromJson<T>(value, cls)
    }

    fun getString(value:Any):String{
        return Gson().toJson(value)
    }

    fun body(data:String): RequestBody
    {
        return RequestBody.create(MediaType.parse("json/application"),data)
    }
}