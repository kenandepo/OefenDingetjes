package company.a.b.c.streams.cars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CarStreamTest {

    final Car opel = new Car(3, 4, 150, "Opel", new Options(false, false, "Android"));

    final Car Volkswagen = new Car(5, 5, 220, "Volkswagen", new Options(true, true, "IoS"));

    final Car Volvo = new Car(5, 5, 240, "Volvo", new Options(false, true, "VolVoDroid"));

    final List<Car> input = List.of(opel, Volkswagen, Volvo);

    @Test
    void test() {
        final List<Car> result = CarStream.speedHigherThen200(input);
        assertEquals(2, result.size());
    }

    @Test
    void fiveDoorsRadioButNoAirco() {
        final List<Car> cars = CarStream.fiveDoorsRadioButNoAirco(input);
        assertEquals(cars.size(), 1);
        assertEquals(cars.get(0)
                .getModel(), Volvo.getModel());
    }

}
