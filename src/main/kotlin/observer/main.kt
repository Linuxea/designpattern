package observer

fun main() {
    val schoolScreen: Observer = SchoolScreen()
    val weChatGroup: Observer = WeChatGroup()
    val scoreTopList = ScoreTopList()
    scoreTopList.register(schoolScreen)
    scoreTopList.register(weChatGroup)
    scoreTopList.notifyObservers(ObserverData(100))
}