package company.a.b.c.kata.clock;

public class Clock {

    public static int Past(int h, int m, int s) {
        int seconds = s * 1000;
        int minute = m * 1000 * 60;
        int hour = h * 60 * 60 * 1000;
        return seconds + minute + hour;

    }
}

//other solution     return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();