package tech.antibytes.lib

fun christmasTree(height: Int): List<String>{
    var padding = ""
    var leaf = "#"
    val trunk = "|"

    val paddings = mutableListOf<String>()
    val leafs = mutableListOf<String>()

    for (row in 0 until height) {
        paddings.add(padding)
        leafs.add(leaf)

        leaf += "##"
        padding += "_"
    }

    paddings.reverse()

    return leafs.mapIndexed { index, leaf ->
        "${paddings[index]}$leaf${paddings[index]}"
    } + "${paddings[0]}$trunk${paddings[0]}" + "${paddings[0]}$trunk${paddings[0]}"
}