package company.a.b.c.kata.cuboidvolumes;

public class CuboidVolumes {

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int volumeFirstCuboid = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int volumeSecondCuboid = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];



        return volumeFirstCuboid - volumeSecondCuboid < 0 ? volumeSecondCuboid - volumeFirstCuboid : volumeFirstCuboid - volumeSecondCuboid;
    }
}