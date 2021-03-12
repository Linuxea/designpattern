package strategy


fun main() {
    val duck: Duck = MallardDuck()
    duck.swim()
    duck.display()
    duck.performFly()

    // 更改飞行行为
    duck.flyBehavior = FlyNoWay()
    duck.performFly()
}