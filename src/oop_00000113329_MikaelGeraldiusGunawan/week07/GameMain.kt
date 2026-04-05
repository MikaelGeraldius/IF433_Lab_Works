package oop_00000113329_MikaelGeraldiusGunawan.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("${ItemRarity.LEGENDARY.dropChance}")
    val starter = Weapon.forgeStarterSword()
    println(starter.item)
}