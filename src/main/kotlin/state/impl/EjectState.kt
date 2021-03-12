package state.impl

import state.OrderContext
import state.OrderState

class EjectState(private val orderContext: OrderContext) : OrderState {

    override fun create() {
        println("退款不能创建")
    }


    override fun eject() {
        println("不可重复退款")
    }

    override fun service() {
        println("退款不可服务了")
    }

    override fun over() {
        println("退款不能结束")
    }
}