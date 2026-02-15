package oop_00000113329_MikaelGeraldiusGunawan.week02

class Hero (
    val name: String,
    var baseDamage: Int,
    var hp: Int = 100
) {
    init {
        println("Hero $name is created")
        println("HP        : $hp")
        println("BaseDamage: $baseDamage")
    }

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