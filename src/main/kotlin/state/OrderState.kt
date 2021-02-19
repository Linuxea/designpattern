package state

interface OrderState {

    /**
     * 创建支付订单
     */
    fun create()


    /**
     * 订单退款
     */
    fun eject();


    /**
     * 服务
     */
    fun service()

    /**
     * 结束
     */
    fun over()

}