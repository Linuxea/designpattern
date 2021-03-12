package decorator

class LoggerUserServiceDecorator(private val userService: UserService) : AbstractUserServiceDecorator(userService) {

    override fun save(name: String, age: Int) {
        println("保存用户信息前的记录")
        this.userService.save(name, age)
        println("保存用户信息后的记录")
    }
}