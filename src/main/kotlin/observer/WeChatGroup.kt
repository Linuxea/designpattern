package observer

/**
 * 家长聊天组
 */
class WeChatGroup : Observer {

    override fun update(observerData: ObserverData) {
        println("家长聊天组收到 $observerData")
    }
}