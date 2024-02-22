import java.util.*;

public class Card implements Comparable<Card> {
    private String suit; // Chất của quân bài: Hearts, Diamonds, Clubs, Spades
    private int rank; // Cấp độ của quân bài: 2-10, J, Q, K, A

    // Constructor
    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter
    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    // Comparable interface implementation for sorting cards
    @Override
    public int compareTo(Card other) {
        if (this.rank != other.rank) {
            return this.rank - other.rank; // Ưu tiên sắp xếp theo rank
        } else {
            return this.suit.compareTo(other.suit); // Nếu rank bằng nhau, sắp xếp theo suit
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';
    }
}

