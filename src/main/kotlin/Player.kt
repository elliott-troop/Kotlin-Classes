class Player(var name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1)

    fun show() {
        println("""
            name:$name
            lives:$lives
            level:$level
            score:$score
            weapon of choice:${weapon.name}
            damage of weapon:${weapon.damageInflicted}
        """.trimIndent())
    }
}