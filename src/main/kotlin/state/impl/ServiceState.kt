package state.impl

import state.OrderContext
import state.OrderState

class ServiceState(private val orderContext: OrderContext) : OrderState {

    override fun create() {
        println("服务中不可创建")
    }

    override fun eject() {
        println("服务中不可退款")
    }

    override fun service() {
        println("服务 ...")
    }

    override fun over() {
        println("结束订单")
    }
}