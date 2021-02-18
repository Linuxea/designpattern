package command

class LightOnCommand : Command {

    var light: Light = Light()

    override fun execute() {
        this.light.on()
    }
}