package observer

/**
 * 成绩 top 榜单
 */
class ScoreTopList(override val observers: MutableList<Observer>) : Subject {

    constructor() : this(mutableListOf<Observer>())

    override fun register(observer: Observer) {
        println("添加注册者 $observer")
        this.observers.add(observer)
    }

    override fun unregister(observer: Observer) {
        println("移除注册者 $observer")
        this.observers.remove(observer)
    }

    override fun notifyObservers(observerData: ObserverData) {
        println("通知观察者列表")
        this.observers.forEach { it.update(observerData) }
    }
}