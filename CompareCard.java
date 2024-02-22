class CompareCard implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        // Sử dụng compareTo từ lớp Card để so sánh
        return card1.compareTo(card2);
    }
}