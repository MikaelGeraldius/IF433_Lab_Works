package oop_00000113329_MikaelGeraldiusGunawan.week07

fun processEvent(event: BattleState) {
    val uiMessage = when (event) {
        is BattleState.MonsterEncounter -> "Encounter ${event.monsterName}"
        is BattleState.LootDropped -> "LootDropped Name = ${event.item.name}, Rarity = ${event.item.rarity}"
        is BattleState.GameOver -> "GameOver because ${event.reason}"
        is BattleState.SafeZone -> "Safe Zone"
    }
}