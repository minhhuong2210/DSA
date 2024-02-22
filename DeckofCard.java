public class DeckOfCards {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Tạo bộ bài
        for (String suit : suits) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new Card(suit, rank));
            }
        }

        // Trộn bộ bài
        Collections.shuffle(deck);
        System.out.println("Bộ bài sau khi trộn: ");
        deck.forEach(card -> System.out.println(card.toString()));

        // Sắp xếp bộ bài sử dụng Comparable
        Collections.sort(deck);
        System.out.println("\nBộ bài sau khi sắp xếp (Comparable): ");
        deck.forEach(card -> System.out.println(card.toString()));

        // Sắp xếp bộ bài sử dụng Comparator
        Collections.sort(deck, new CompareCard());
        System.out.println("\nBộ bài sau khi sắp xếp (Comparator): ");
        deck.forEach(card -> System.out.println(card.toString()));
    }
}
