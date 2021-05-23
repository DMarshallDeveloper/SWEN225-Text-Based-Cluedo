package Cluedo;
import Cluedo.Items.Item;

/**
 * This class defines the cards in the game.
 * A card may be a character, a weapon, or a room card.
 */
public class Card {
    /**
     * The item that is represented by the card.
     */
    Item item;

    /**
     * Construct the Card using its Item
     * @param item the item the card represents
     */
    public Card(Item item) {
        this.item = item;
    }

    /**
     * Get the item of the card.
     * @return the item that the card represents.
     */
    public Item getItem() {
        return item;
    }

    /**
     * Get the name of the card
     * @return name of the character, weapon, or room.
     */
    public String getName(){
        return item.getName();
    }

}