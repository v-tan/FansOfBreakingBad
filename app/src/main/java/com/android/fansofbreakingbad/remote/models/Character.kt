package com.android.fansofbreakingbad.remote.models

typealias Characters = ArrayList<Character>

data class Character (
    val charID: Long,
    val name: String,
    val birthday: String,
    val occupation: List<String>,
    val img: String,
    val status: LifeStatus,
    val nickname: String,
    val appearance: List<Long>,
    val portrayed: String,
    val category: String,
)

enum class LifeStatus {
    Alive,
    Deceased,
    PresumedDead,
    Unknown
}
