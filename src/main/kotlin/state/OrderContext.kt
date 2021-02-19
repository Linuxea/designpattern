package state

import state.impl.EjectState
import state.impl.OverState
import state.impl.PayState
import state.impl.ServiceState

class OrderContext {

    private val payState: OrderState = PayState(this)
    private val ejectState: OrderState = EjectState(this)
    private val serviceState: OrderState = ServiceState(this)
    private val overState: OrderState = OverState(this)

    var currentState: OrderState = payState

    /**
     * 创建订单
     */
    fun create() {
        currentState.create();
    }


    /**
     * 拒绝订单
     */
    fun eject() {
        currentState.eject()
        currentState = ejectState
    }


    /**
     * 服务
     */
    fun service() {
        currentState.service()
        currentState = serviceState
    }

    /**
     * 结束
     */
    fun over() {
        currentState.over()
        currentState = overState
    }


}