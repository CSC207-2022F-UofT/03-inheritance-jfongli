/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag{
    int numberOfStraps; // I need to declare any new paremeter right after the headline
    /**
     * Creates a new CrossBodyBag with the given color and
     * capacity.
     *
     * @param color  the color of the bag
     * @param capacity the capacity of the bag
     * @param numberOfStraps the number of straps
     */


    public CrossbodyBag(String color, int capacity, int numberOfStraps){
        /**
         * This is how we call the parent's constructor
         * The Python equivalent is super().__init__(...)
         */
        super(color, capacity);
        this.numberOfStraps = numberOfStraps; // Why is this not working?
    }

    public int getNumberOfStraps(){
        return numberOfStraps;
    }

    public void enhance() {
        // Still trying to figure this out
        super.increaseCapacity(2);
    }

    @Override
    public String toString() {
        return this.color + " Crossbody Bag with " + this.numberOfStraps + " straps (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

}
