package oop_00000113329_MikaelGeraldiusGunawan.week08

fun main() {
    var nama: String? = null;

    try {
        println("Hi $nama")
        println("Panjang huruf ${ nama!!.length }")
    } catch (e: NullPointerException) {
        println("ada error exception, ${e.message}")
    }

    val mixedData: List<Any?> = listOf(1, "Budi", 10, "Online", null)
    for(item in mixedData) {
        val string = item as? String;
        if(string != null) {
            println(string)
        }
    }
}
