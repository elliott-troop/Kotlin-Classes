class Weapon(val name: String = "Fist", var damageInflicted: Int = 1) {

    override fun toString(): String {
        return "$name inflicts $damageInflicted points of damage"
    }
}