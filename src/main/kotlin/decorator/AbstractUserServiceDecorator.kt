package decorator

abstract class AbstractUserServiceDecorator(private val userService: UserService) : UserService {

    abstract override fun save(name: String, age: Int)

}