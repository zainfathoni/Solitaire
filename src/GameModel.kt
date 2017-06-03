class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPile = arrayOf(
        FoundationPile(clubs),
        FoundationPile(diamonds),
        FoundationPile(hearts),
        FoundationPile(spades)
    )
}