package oop_00000113329_MikaelGeraldiusGunawan.week01

fun main() {

    val gameTitle: String = "Mobile Legends"
    val price: Int = 50000

}

fun calculateDiscoun(price: Int): Int {
    if (price > 500000) {
        return price - (price * 0.20).toInt()
    }
    else {
        return price - (price * 0.10).toInt()
    }
}