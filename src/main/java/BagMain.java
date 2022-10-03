/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {
    /**
     * TODO: Implement this method
     * Enhance each of the bags in bags. If double_enhance_handbags is
     * True, then enhance any HandBags a second time.
     *
     * This method should work for *all* Bags! We will test this method
     * on new Bag types (and HandBag subclasses)!
     */
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        // TODO: Implement this.
        // Plan: Iterate through the array, and enhance once.
        // If the Bag[i] is a Handbag and double_enhance_handbags == true, then enhance once again.
        for (int i = 0; i < bags.length; i++){
            bags[i].enhance();
            if (bags[i] instanceof HandBag && double_enhance_handbags) {
                bags[i].enhance();
            }
        }
    }

    /**
     * TODO: Implement this method
     * Return the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag should not be included
     * in the count!
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        // TODO: Implement this.
        int straps_so_far = 0;
        // Idea: Iterate through the array with a for-loop. Check with an if-statement
        // if its a CrossbodyBag. If true, then add bags[i].getNumberOfStraps to the count.
        for (int i = 0; i < bags.length; i++) {
            if (bags[i] instanceof CrossbodyBag) {
                straps_so_far = straps_so_far + ((CrossbodyBag) bags[i]).getNumberOfStraps();
            }
        }
        return straps_so_far;
    }
}