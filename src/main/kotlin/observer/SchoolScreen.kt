package observer

/**
 * 学校公屏
 */
class SchoolScreen : Observer {

    override fun update(observerData: ObserverData) {
        println("学校公屏收到通知 $observerData")
    }
}