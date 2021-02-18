package adapter

class Pig2DogAdapter(private val pig: Pig) : Dog {

    override fun wang() {
        this.pig.heng()
    }
}