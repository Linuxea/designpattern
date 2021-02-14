package strategy

interface Duck {

    var flyBehavior: FlyBehavior

    fun swim() {
        println("鸭子都会游泳")
    }

    fun display()

    fun performFly() {
        this.flyBehavior.fly()
    }

}