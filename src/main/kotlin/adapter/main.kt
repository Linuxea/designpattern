package adapter

fun main() {
    val taiQiDog: Dog = TaiQiDog()
    taiQiDog.wang()

    // 狗狗不够，猪猪来凑
    val pig2DogAdapter: Dog = Pig2DogAdapter(PeiQiPig())
    pig2DogAdapter.wang()
}