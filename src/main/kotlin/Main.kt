fun main(args: Array<String>) {
    val player1 = Player("John Doe", 4, 8)
    val player2 = Player("Jane Doe", 2, 5, 1000)

    var weapon: Weapon = Weapon("Sword", 14)

    player2.weapon = weapon
    player1.weapon = weapon

    player1.show()
    player2.show()

    player2.weapon = Weapon("Spear", 15)

    println("Upgrading ${player2.name}'s weapon! ")
    player1.show()
    player2.show()
}