package strategy

class FlyNoWay : FlyBehavior {

    override fun fly() {
        println("本老鸭不会飞")
    }
}