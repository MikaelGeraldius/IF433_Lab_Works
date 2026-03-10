package oop_00000113329_MikaelGeraldiusGunawan.week06

fun main() {
    val lamp = SmartLamp("1","RuangTamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3","Ezvix Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}