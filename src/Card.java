
public class Card {
private int value; // numeric value of the card (2-14)
private String name; // name of the card (e.g., "Ace of Hearts")


// Constructor to initialize card value and name
public Card(int value, String name) {
this.value = value; // set card value
this.name = name; // set card name
}


// Getter for value
public int getValue() {
return value; // return card value
}


// Setter for value
public void setValue(int value) {
this.value = value; // update card value
}


// Getter for name
public String getName() {
return name; // return card name
}


// Setter for name
public void setName(String name) {
this.name = name; // update card name
}


// Describe method prints card information
public void describe() {
System.out.println(name + " (Value: " + value + ")"); // output card details
}
}
