package oop_00000113329_MikaelGeraldiusGunawan.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Encounter ${event.monsterName}")
        is BattleState.LootDropped -> println("LootDropped Name = ${event.item.name}, Damage = ${event.item.damage}, Rarity = ${event.item.rarity}")
        is BattleState.GameOver -> println("GameOver because ${event.reason}")
        is BattleState.SafeZone -> println("Safe Zone")
    }
}