package observer

interface Subject {

    /**
     * 观察者列表
     */
    val observers: List<Observer>

    /**
     * 注册观察者
     */
    fun register(observer: Observer)

    /**
     * 注销观察者
     */
    fun unregister(observer: Observer)

    /**
     * 通知观察者
     */
    fun notifyObservers(observerData: ObserverData)

}