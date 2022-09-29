package company.a.b.c.kata.traficlight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {

    @Test
    public void update_light() {
        assertEquals("green", TrafficLight.updateLight("red"));
        assertEquals("yellow", TrafficLight.updateLight("green"));
        assertEquals("red", TrafficLight.updateLight("yellow"));
    }
}
