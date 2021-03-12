package factory

import factory.impl.ShapeFactory

fun main() {

    ShapeFactory.shape("rectangle").draw()
    ShapeFactory.shape("circle").draw()
    ShapeFactory.shape("square").draw()

}