package decorator

class TimeUserServiceDecorator(private val userService: UserService) : AbstractUserServiceDecorator(userService) {


    override fun save(name: String, age: Int) {
        println("现在时间是 ${System.currentTimeMillis()}")
        this.userService.save(name, age)
        println("现在时间是 ${System.currentTimeMillis()}")
    }
}