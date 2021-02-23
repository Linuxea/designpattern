package command

/**
 * 具体的冰箱命令
 */
class FridgeCommand(private val electricDevice: ElectricDevice) : Command {

    override fun execute() {
        this.electricDevice.on()
    }
}