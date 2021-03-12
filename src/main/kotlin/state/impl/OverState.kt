package state.impl

import state.OrderContext
import state.OrderState

class OverState(private val orderContext: OrderContext) : OrderState {

    override fun create() {
        println("结束不可创建")
    }

    override fun eject() {
        println("结束不可退款")
    }

    override fun service() {
        println("结束不可服务")
    }

    override fun over() {
        println("已经结束不可再结束")
    }
}