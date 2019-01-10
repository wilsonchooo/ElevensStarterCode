package Activity4;

/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */

public class Card {
    public String rank;
    public String suit;
    public int pointValue;

    public Card (String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank()
    {
        return this.rank;
    }
    public String getSuit()
    {
        return this.suit;
    }
    public int getPointValue()
    {
        return this.pointValue;
    }

    public boolean equals(Card othercard)
    {
        if (pointValue == othercard.pointValue )
            return true;

        else return false;
    }


   public boolean matches(Card otherCard) {
        return otherCard.suit.equals(this.suit)
                && otherCard.rank.equals(this.rank)
                && otherCard.pointValue == this.pointValue;
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}

