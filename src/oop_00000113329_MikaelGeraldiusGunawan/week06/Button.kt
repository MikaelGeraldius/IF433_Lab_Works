package oop_00000113329_MikaelGeraldiusGunawan.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}