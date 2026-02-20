package oop_00000113329_MikaelGeraldiusGunawan.week03

class Player(var username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount < 0){
            println("Amount tidak boleh negatif")
        } else {
            val currlevel = level
            xp += amount
            if (level > currlevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}