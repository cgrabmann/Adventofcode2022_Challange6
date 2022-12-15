package dev.grabmann.adventofcode.challange6

import kotlin.io.path.Path
import kotlin.io.path.readLines

fun main() {
    val file = Path("input.txt")
    val line = file.readLines().first()
    val firstMarkerIndex =  line.windowed(14, step = 1, partialWindows = false) {
        it.toSet().size == 14
    }.indexOfFirst { it }
    println(14 + firstMarkerIndex)
}
