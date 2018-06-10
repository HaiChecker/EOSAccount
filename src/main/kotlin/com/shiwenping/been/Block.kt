package com.shiwenping.been


data class Block(
    val timestamp: String,
    val producer: String,
    val confirmed: Int,
    val previous: String,
    val transaction_mroot: String,
    val action_mroot: String,
    val schedule_version: Int,
    val new_producers: Any,
    val header_extensions: List<Any>,
    val producer_signature: String,
    val transactions: List<Any>,
    val block_extensions: List<Any>,
    val id: String,
    val block_num: Int,
    val ref_block_prefix: Int
)