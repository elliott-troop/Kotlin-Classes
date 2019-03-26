class Player(var name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {
    fun show() {
        println("""
            $name
            $lives
            $level
            $score
        """.trimIndent())
    }
}