
/**
 * Created by katie on 1/26/16.
 */
public class ThingContainer {
    ColorfulThing[] allThings;
    int currentPosition = 0;
    //constructor for ThingContainer which takes an int argument as its size
    public ThingContainer(int size) {
        allThings = new ColorfulThing[size];
    }
    //constructor which takes an array of colorful things
    ThingContainer(ColorfulThing[] allThings) {
        this(allThings.length);
        //for each to add each item into the container
        for (ColorfulThing thing : allThings) {
            if (thing != null) {
                this.add(thing);
            }
        }
    }
    //add specific colorful things in the order they are received
    void add(ColorfulThing thing) {

        if (currentPosition == allThings.length) {
            System.out.println("ThingContainer is full.");
        } else {
            allThings[currentPosition] = thing;
            if (currentPosition - 1 != allThings.length) {
                currentPosition++;
            }
        }

    }
    //first instance of remove: takes color value, remove matching thing of that color and return it
    ColorfulThing remove(Color color) {
        ColorfulThing thisThing;

        for (int i = 0; i < currentPosition; i++) {
            //checks for a colorful thing that matches the given color
            if (color == allThings[i].getColor()) {
                thisThing = allThings[i];
                deleteThing(i);
                return thisThing;
            }
        }
        //returns null if no matching thing is found
        return null;

    }
    //second instance of remove: accepts a colorful thing object
    ColorfulThing remove(ColorfulThing thisThing) {
        return remove(thisThing.getColor());
    }

    //prints out all the things in the array
    void printThings() {
        System.out.println("Current things: ");
        for (int j = 0; j < allThings.length; j++) {
            if (allThings[j] != null) {

                System.out.print(" " + allThings[j].getColor());
            }
        }

    }
    //removes & returns the last element
    ColorfulThing pop() {
        if (currentPosition > 0) {
            ColorfulThing thing = allThings[currentPosition - 1];
            deleteThing(currentPosition - 1);
            return thing;
        }
        return null;

    }

    void deleteThing(int i) {
        for(int j = i+1; j<allThings.length;j++){
            allThings[j-1] = allThings[j];
        }
        allThings[allThings.length - 1] = null;
        currentPosition--;
    }
}

