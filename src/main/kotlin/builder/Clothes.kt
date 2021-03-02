package builder

class Clothes {

    private val size: Int
    private val color: String

    private var money: Double = 0.toDouble()
    private var material: String? = null


    constructor(size: Int, color: String) {
        this.size = size
        this.color = color
    }

    private constructor(builder: Builder) : this(builder.size, builder.color) {
        this.money = builder.money
        this.material = builder.material
    }

    class Builder(val size: Int, val color: String) {


        var money: Double = 0.toDouble()
        var material: String? = null

        fun money(money: Double): Builder {
            this.money = money
            return this
        }

        fun material(material: String): Builder {
            this.material = material
            return this
        }

        fun build(): Clothes {
            return Clothes(builder = this)
        }

    }

    override fun toString(): String {
        return "Clothes(size=$size, color='$color', money=$money, material=$material)"
    }


}


