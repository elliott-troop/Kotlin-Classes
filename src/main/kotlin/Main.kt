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
    val chestArmor = Loot("Chest Armor", LootType.ARMOR, 80.0)
    val rubyRing = Loot("Ruby Ring", LootType.RING, 500.0)
    val emeraldRing = Loot("Emerald Ring", LootType.RING, 250.0)

    player1.getLoot(redPotion)
    player1.getLoot(emeraldRing)
    player2.getLoot(chestArmor)
    player2.getLoot(rubyRing)

    player1.showInventory()
    player2.showInventory()

    println("\nBoth players are forced to drop an item due to a spell!\n")

    player1.dropLoot(emeraldRing)
    player2.dropLoot(chestArmor)

    player1.showInventory()
    player2.showInventory()
}