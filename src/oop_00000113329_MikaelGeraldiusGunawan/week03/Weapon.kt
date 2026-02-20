package oop_00000113329_MikaelGeraldiusGunawan.week03

class Weapon (var name: String) {
    var damage: Int = 0
        set(value) {
            if(value < 0){
                println("damage cannot be negative")
            } else if (value > 1000) {
                println("damage too high setting to 1000")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return if (damage > 800){
                "Legendary"
            } else if (damage in 501.. 800){
                "Epic"
            } else {
                "Common"
            }
        }
}