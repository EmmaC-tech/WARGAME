
import java.util.ArrayList; // import for ArrayList
import java.util.Collections; // import for shuffle
import java.util.List; // import for List


public class Deck {
private List<Card> cards; // list that stores all cards in the deck


// Constructor to create all 52 cards when deck is made
public Deck() {
cards = new ArrayList<>(); // initialize card list


// Arrays to hold suit and rank names
String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};


// Nested loop creates every card by combining suit and rank
for (String suit : suits) { // loop through suits
for (int i = 0; i < ranks.length; i++) { // loop through ranks
cards.add(new Card(i + 2, ranks[i] + " of " + suit)); // add each card to deck
}
}
}


// Shuffle cards using built-in method
public void shuffle() {
Collections.shuffle(cards); // randomize card order
}


// Draw method removes top card and returns it
public Card draw() {
return cards.remove(0); // remove and return first card
}
}
