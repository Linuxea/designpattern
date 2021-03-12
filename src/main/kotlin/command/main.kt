package command

/**
 * 模拟一个 client
 */
fun main() {

    // instantiate invoker
    val simpleCommand = SimpleCommandInvoker()
    // 实例化一个灯，操作同一个对象
    val light = Light()
    // 设置命令
    simpleCommand.command = LightOnCommand(light)
    simpleCommand.invoke()

    // 实例化一个冰箱，操作同一个对象
    val fridge = Fridge()
    // 切换命令的实现
    simpleCommand.command = FridgeCommand(fridge)
    simpleCommand.invoke()

}