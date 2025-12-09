public class Card implements Comparable<Card> {
    private String name;
    private String suit;
    

    private static final String[] NAMES_ORDER = {
        "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };
    
    private static final String[] SUITS_ORDER = {
        "Hearts", "Clubs", "Diamonds", "Spades"
    };
    
    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        return name + " of " + suit;
    }
    
    @Override
    public int compareTo(Card other) {
      
        int suitCompare = getSuitOrder(this.suit) - getSuitOrder(other.suit);
        
       
        if (suitCompare != 0) {
            return suitCompare;
        }
        
        
        return getNameOrder(this.name) - getNameOrder(other.name);
    }
    
    private int getSuitOrder(String suit) {
        for (int i = 0; i < SUITS_ORDER.length; i++) {
            if (SUITS_ORDER[i].equals(suit)) {
                return i;
            }
        }
        return -1; // Not found
    }
    
    private int getNameOrder(String name) {
        for (int i = 0; i < NAMES_ORDER.length; i++) {
            if (NAMES_ORDER[i].equals(name)) {
                return i;
            }
        }
        return -1; // Not found
    }
}