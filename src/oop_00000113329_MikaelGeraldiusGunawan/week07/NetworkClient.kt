package oop_00000113329_MikaelGeraldiusGunawan.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}