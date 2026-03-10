package oop_00000113329_MikaelGeraldiusGunawan.week06

class SmartHomeHub () {
    val device = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {

    }

    fun turnOffAllSwitches() {
        for (i in device) {
            when (i) {
                is Switchable -> {
                    i.turnOff()
                }
            }
        }
    }

    fun activateSecurityMode() {
        for (i in device) {
            when (i) {
                is Recordable -> {
                    i.startRecord()
                }
                is SmartSpeaker -> {
                    i.playMusic("Sirine Peringatan")
                }
            }
        }
    }
}