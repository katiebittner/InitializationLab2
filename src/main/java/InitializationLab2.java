/**
 * Created by katie on 1/28/16.
 */
public class InitializationLab2 {
    public static void main(String[] args) {
        ThingContainer thing1 = new ThingContainer(3);
        ThingContainer thing2 = new ThingContainer(3);
        ThingContainer thing3 = new ThingContainer(3);


        for (int i = 0; i < 3; i++) {
            thing1.add(new ColorfulThing(Color.randomThing()));
            thing2.add(new ColorfulThing(Color.randomThing()));
            thing3.add(new ColorfulThing(Color.randomThing()));
        }
        thing1.printThings();
        System.out.println();
        thing2.printThings();
        System.out.println();
        thing3.printThings();
        System.out.println();
        System.out.println("Pop! " + thing1.pop().getColor());
        System.out.println("Pop! " + thing2.pop().getColor());
        System.out.println("Pop! " + thing3.pop().getColor());
        thing1.add(new ColorfulThing(Color.BLUE));
        System.out.println();
        thing1.printThings();
    }
}