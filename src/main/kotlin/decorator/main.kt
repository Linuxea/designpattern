package decorator

fun main() {

    val userService: UserService = UserServiceImpl()
    val loggerUserServiceDecorator: UserService = LoggerUserServiceDecorator(userService)
    val timeUserServiceDecorator: UserService = TimeUserServiceDecorator(loggerUserServiceDecorator)
    timeUserServiceDecorator.save("linuxea", 10)

}