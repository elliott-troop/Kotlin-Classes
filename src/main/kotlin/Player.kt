class Player(var name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1)
    var inventory = ArrayList<Loot>()

    fun show() {
        println("""
            name:$name
            lives:$lives
            level:$level
            score:$score
            weapon of choice:${weapon.name}
            damage of weapon:${weapon.damageInflicted}
        """)
    }

    override fun toString(): String {
        return ("""
        name:$name
        lives:$lives
        level:$level
        score:$score
        weapon of choice:${weapon}
    """)
    }

    fun showInventory() {
        println("$name's Inventory:")
        for(item in inventory) println(item)
        println("=============================")
    }
}