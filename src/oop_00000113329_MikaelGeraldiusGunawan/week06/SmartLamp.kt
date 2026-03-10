package oop_00000113329_MikaelGeraldiusGunawan.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lamp $name turned on")
    }

    override fun turnOff() {
        println("Lamp $name turned off")
    }

}