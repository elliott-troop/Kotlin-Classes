fun main(args: Array<String>) {
    val player1 = Player("John Doe", 4, 8)
    val player2 = Player("Jane Doe", 2, 5, 1000)

    var weapon = Weapon("Sword", 14)

    player2.weapon = weapon
    player1.weapon = weapon

    println(player1)
    println(player2)

    player2.weapon = Weapon("Spear", 15)

    println("Upgrading ${player2.name}'s weapon! ")
    println(player1)
    println(player2)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    player1.inventory.add(redPotion)
}