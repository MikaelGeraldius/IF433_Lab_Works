package oop_00000113329_MikaelGeraldiusGunawan.week02

class Hero (
    val name: String,
    var hp: Int,
    var baseDamage: Int = 100
) {
    fun attack(targetName: String) {
        println("$name attacked $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp <= 0) {
            hp = 0
        }
        println("$name hp: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}