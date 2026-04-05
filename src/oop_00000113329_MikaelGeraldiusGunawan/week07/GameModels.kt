package oop_00000113329_MikaelGeraldiusGunawan.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(60),
    UNCOMMON(25),
    RARE(10),
    EPIC(4),
    LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)

