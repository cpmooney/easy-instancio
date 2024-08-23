import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThingTest {

    @Test
    void toJSON() {
        Thing thing = EasyInstancio.of(Thing.class)
                                   .set("color", "blue")
                                   .set("shape", "square")
                                   .create();

        String result = thing.toJSON();

        assertEquals("{ \"shape\": \"square\", \"color\": \"blue\" }", result);
    }
}