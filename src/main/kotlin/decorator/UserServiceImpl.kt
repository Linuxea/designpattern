package decorator

class UserServiceImpl : UserService {

    override fun save(name: String, age: Int) {
        println("保存用户成功")
    }
}