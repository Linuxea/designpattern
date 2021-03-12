package adapter

/**
 * 铁制品接口
 */
interface IronMade {

    /**
     * 击打
     */
    fun hit()

}

/**
 * 雷神之锤
 */
class ThunderHammer : IronMade {

    override fun hit() {
        // 雷神索尔绝招
        println("thor hammers you")
    }

}

/**
 * 棉制品接口
 */
interface CottonMade {

    /**
     * 击打
     */
    fun throwAway()

}

/**
 * 枕头
 */
class Pillow : CottonMade {

    override fun throwAway() {
        println("枕头大战")
    }

}


/**
 * 铁制器适配器,包装了棉制品
 */
class IronMadeAdapter(private val cottonMade: CottonMade) : IronMade {

    override fun hit() {
        // 用扔棉花代表铁的敲打
        this.cottonMade.throwAway()
    }

}

/**
 * 铁器的战斗
 */
class IronBattle(private val adapter: IronMade) : IronMade {

    override fun hit() {
        adapter.hit()
    }

}


fun main() {
    // 粉碎了不能用了
//    val thunderHammer: IronMade = ThunderHammer()
    // 试试这个吧
    val adapter: IronMade = IronMadeAdapter(Pillow())
    val ironBattle = IronBattle(adapter)
    ironBattle.hit()
}

