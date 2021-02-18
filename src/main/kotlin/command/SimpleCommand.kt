package command

class SimpleCommand {

    lateinit var command: Command

    fun pressButton() {
        this.command.execute()
    }

}