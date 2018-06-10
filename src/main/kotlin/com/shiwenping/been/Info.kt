package com.shiwenping.been


data class Info(
    val server_version: String,
    val chain_id: String,
    val head_block_num: Int,
    val last_irreversible_block_num: Int,
    val last_irreversible_block_id: String,
    val head_block_id: String,
    val head_block_time: String,
    val head_block_producer: String,
    val virtual_block_cpu_limit: Int,
    val virtual_block_net_limit: Int,
    val block_cpu_limit: Int,
    val block_net_limit: Int
)