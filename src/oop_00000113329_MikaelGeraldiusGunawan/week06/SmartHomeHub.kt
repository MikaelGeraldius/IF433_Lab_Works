package oop_00000113329_MikaelGeraldiusGunawan.week06

class SmartHomeHub () {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (i in devices) {
            when (i) {
                is Switchable -> {
                    i.turnOff()
                }
            }
        }
    }

    fun activateSecurityMode() {
        for (i in devices) {
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