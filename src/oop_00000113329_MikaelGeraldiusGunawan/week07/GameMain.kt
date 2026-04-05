package oop_00000113329_MikaelGeraldiusGunawan.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("${ItemRarity.LEGENDARY.dropChance}")
    val starter = Weapon.forgeStarterSword()
    println(starter.item)

    val upgrade = starter.item.copy(damage = starter.item.damage + 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgrade))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}