package oop_00000113329_MikaelGeraldiusGunawan.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        startRecord()
        println("SmartCCTV $name turned on")
    }

    override fun turnOff() {
        println("SmartCCTV $name turned off")
    }

    override fun startRecord() {
        println("SmartCCTV $name starting record")
    }
}