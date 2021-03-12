package factory.impl

import factory.Shape

class ShapeFactory {

    companion object {
        fun shape(name: String): Shape {
            return when (name.toLowerCase()) {
                "rectangle" -> Rectangle()
                "circle" -> Circle()
                "square" -> Square()
                else -> throw Exception("非法 shape")
            }
        }
    }

}