package oop_00000113329_MikaelGeraldiusGunawan.week01

fun main() {

    val gameTitle: String = "Mobile Legends"
    val price: Int = 50000
    val userNote: String? = null

    printReceipt(title = gameTitle, finalPrice = calculateDiscount(price), userNote)
}

fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        price - (price * 0.20).toInt()
    }
    else {
        price - (price * 0.10).toInt()
    }
}

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    val displayNote:String = note ?: "Tidak ada catatan"
    println("Harga $title setelah diskon adalah $finalPrice dan note: $displayNote")
}