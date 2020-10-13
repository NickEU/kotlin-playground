package otherStuff

import kotlin.math.hypot

operator fun DoubleArray.component6(): Double = get(5)

fun perimeter(vararg coordinates: Double): Double {
    val inputIsTriangle = coordinates.size == 6
    val (x1, y1, x2, y2, x3, y3) = coordinates
    val x4 = if (inputIsTriangle) x1 else coordinates[6]
    val y4 = if (inputIsTriangle) y1 else coordinates[7]
    return hypot(x2 - x1, y2 - y1) + hypot(x3 - x2, y3 - y2) +
            hypot(x4 - x3, y4 - y3) + hypot(x4 - x1, y4 - y1)
}
