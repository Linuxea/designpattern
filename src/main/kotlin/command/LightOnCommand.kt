package command

/**
 * 具体的灯光命令
 */
class LightOnCommand(private val electricDevice: ElectricDevice) : Command {

    override fun execute() {
        this.electricDevice.on()
    }
}