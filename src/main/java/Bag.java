/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    String color;
    int numberOfContents;
    int capacity;
    String[] contents;



    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String color, int capacity) {
        this.capacity = capacity;
        this.color = color;
        this.contents = new String[capacity];
    }


    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
    public String getColor() {
        return color;
    }
    public int getNumberOfContents() {
        int contents_so_far = 0;
        for (int i = 0; contents[i] != null; i++) {
                 contents_so_far += 1;

        } // make a check that number of contents == actual number of contents
        numberOfContents = contents_so_far;
        return numberOfContents;
    }
    public int getCapacity() {
        return capacity;
    }


    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    public String setColor(String color) {
        this.color = color;
        return color;
    }





    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    public Boolean addItem(String item){
        int number_of_contents = getNumberOfContents();
        int current_capacity = getCapacity();
        if (number_of_contents < current_capacity) {
            for (int i = 0; i < current_capacity; i++) {
                if (contents[i] == null) {
                    contents[i] = item;
                    return true;
                }
            }

        }
        return false;
    }



    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return a string of the last item added to the bag. return null if there are no items.
     */
    public String popItem() {
        // Goal: Return the last item added to the Bag. The item should be removed from "contents".
        // Modify "numberOfContents" accordingly
        String[] new_contents = new String[capacity];
        for (int i = 0; i <= numberOfContents - 1; i++) {
            new_contents[i] = contents[i];
        }
        String popped_item = contents[numberOfContents];
        contents = new_contents;
        return popped_item;


        }



    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity = this.capacity + n;
        String[] new_bag = new String[capacity - 1];
        for (int i = 0; i <= numberOfContents - 1; i++) {
            new_bag[i] = contents[i];
        }
        contents = new_bag;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return details of bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}