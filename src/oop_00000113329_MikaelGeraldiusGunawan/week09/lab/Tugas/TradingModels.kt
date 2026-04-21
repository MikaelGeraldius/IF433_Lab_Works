package oop_00000113329_MikaelGeraldiusGunawan.week09.lab.Tugas

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)