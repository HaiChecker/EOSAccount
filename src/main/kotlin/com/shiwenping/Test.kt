package com.shiwenping

import java.text.SimpleDateFormat
import java.util.*

/**
 * https://eosnodes.privex.io/
 * https://steemit.com/@eosnewyork
 * https://developers.eos.io/eosio-nodeos/reference#get_info
 * https://www.cnblogs.com/yuanfangyuan/p/9069460.html
 */
fun main(args: Array<String>) {
    val simpleData = SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS")
    val chain = Chain("https://api.eosuk.io")
    System.out.println("get_info")
    val info = chain.getInfo()
    System.out.println("get_block:${info.head_block_num}")
    val block = chain.getBlock(info.head_block_num)
    val data = Date(simpleData.parse(block.timestamp).time + (60 * 60 * 1000))
    val block_num = block.block_num
    val ref_block_prefix = block.ref_block_prefix

}