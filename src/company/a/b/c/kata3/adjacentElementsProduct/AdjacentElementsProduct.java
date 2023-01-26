package company.a.b.c.kata3.adjacentElementsProduct;

import java.util.Arrays;

public class AdjacentElementsProduct {

    public int adjacentElementsProduct(int[] array) {

        Arrays.sort(array);
        return array[array.length-1] * array[array.length-2];

        //todo misunderstood: return 2 aangrenzende getallen waar de som het grootst mogelijk is
    }

}
