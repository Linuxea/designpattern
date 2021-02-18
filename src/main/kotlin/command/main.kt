package command

fun main() {

    val simpleCommand = SimpleCommand()
    simpleCommand.command = LightOnCommand()
    simpleCommand.pressButton()

    simpleCommand.command = FridgeCommand()
    simpleCommand.pressButton()

}