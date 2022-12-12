package company.a.b.c.rankup.user;

public class User {

    private int rank;
    private Activities activities;


    public User(Activities activities) {
        this.rank = -8;
        this.activities = activities;
    }
}

class Activities {
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private int rank;
}