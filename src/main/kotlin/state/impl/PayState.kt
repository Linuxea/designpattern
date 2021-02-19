package state.impl

import state.OrderContext
import state.OrderState

class PayState (private val orderContext: OrderContext) : OrderState {


    override fun create() {
        println("已经支付无需要再创建")
    }

    override fun eject() {
        println("申请退款成功")
    }

    override fun service() {
        println("待服务")
    }

    override fun over() {
        println("还没有开始")
    }
}