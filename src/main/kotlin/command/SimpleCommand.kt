package command

/**
 * 简单的命令 invoker
 */
class SimpleCommandInvoker {

    /**
     * 持有命令的接口，不知道具体的命令实现
     * command 是可变的，可以替换为不同的实现
     */
    lateinit var command: Command

    /**
     * 执行
     */
    fun invoke() {
        // 间接调用 command execute 方法
        this.command.execute()
    }

}