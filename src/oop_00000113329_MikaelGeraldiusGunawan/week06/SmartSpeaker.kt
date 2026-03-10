package oop_00000113329_MikaelGeraldiusGunawan.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Smart speaker $name turned on")
    }

    override fun turnOff() {
        println("Smart speaker $name turned off")
    }

    fun playMusic(song : String) {
        println("Memutar lagu $song dari Spotify")
    }
}