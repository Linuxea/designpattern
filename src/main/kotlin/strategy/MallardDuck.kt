package strategy

class MallardDuck(override var flyBehavior: FlyBehavior) : Duck {

    constructor() : this(FlyWithWings())

    override fun display() {
        println("我是绿头鸭子")
    }
}