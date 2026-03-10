package oop_00000113329_MikaelGeraldiusGunawan.week06

interface SmartDevice {
    val id : String
    val name: String
}

interface Switchable {
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable {
    abstract fun record()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}