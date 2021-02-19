package state

fun main() {

    val orderContext = OrderContext()
    orderContext.create()
//    orderContext.eject()
    orderContext.service()
    orderContext.over()

}