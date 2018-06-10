package com.shiwenping.been


data class signTransaction(
    val ref_block_num: Int,
    val ref_block_prefix: Long,
    val expiration: String,
    val actions: List<Action>,
    val signatures: List<Any>
)

data class Action(
    val account: String,
    val name: String,
    val authorization: List<Authorization>,
    val data: String
)

data class Authorization(
    val actor: String,
    val permission: String
)