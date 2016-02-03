import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by katie on 1/28/16.
 */
public class ThingContainerSpec {
    ThingContainer testContainer = new ThingContainer(2);

    @Test
    public void testingThing() {
        testContainer.add(new ColorfulThing(Color.BLUE));
        testContainer.pop();


    }

}
