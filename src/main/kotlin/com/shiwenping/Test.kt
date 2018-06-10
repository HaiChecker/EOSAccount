package com.shiwenping

fun main(args: Array<String>) {
    val chain = Chain("https://api.eosuk.io")
    val info = chain.getInfo()
    System.out.println(info.head_block_num)
}