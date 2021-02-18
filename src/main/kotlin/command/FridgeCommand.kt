package command

class FridgeCommand : Command {

    var fridge: Fridge = Fridge()

    override fun execute() {
        this.fridge.on()
    }
}