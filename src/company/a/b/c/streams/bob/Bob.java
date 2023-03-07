package company.a.b.c.streams.bob;

public class Bob {

    public static int enough(int cap, int on, int wait){

        int numberOfSeat=cap-on;
        return numberOfSeat>wait?0:wait-numberOfSeat;

    }
}
