package template

abstract class Cook {

    fun cook() {
        this.wash()
        this.addOil()
        this.cooking()
        this.addSalt()
        this.over()
    }

    fun wash() {
        println("洗一洗")
    }

    abstract fun cooking()

    fun addOil() {
        println("加点油")
    }

    fun addSalt() {
        println("加点盐")
    }

    fun over() {
        println("搞定")
    }

}