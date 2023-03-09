package company.a.b.c.streams.cars;

import java.util.List;

public class CarStream {

    public static List<Car> speedHigherThen200(List<Car> inputList) {
        return inputList.stream()
                .filter(e -> e.getTopSpeed() > 200)
                .toList();
    }

    public static List<Car> fiveDoorsRadioButNoAirco(List<Car> carList) {
        return carList.stream()
                .filter(e -> e.getOptions()
                        .isRadio())
                .filter(e -> !e.getOptions()
                        .isAirconditioning())
                .filter(e -> e.getDoors() > 4)
                .toList();

    }

}


