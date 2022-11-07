package company.a.b.c.kata.twofightersonewinner;

public class TwoFightersOneWinner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        return firstAttacker.equals(fighter1.name) ? determine(fighter1, fighter2) : determine(fighter2, fighter1);
    }

    private static String determine(final Fighter attacker, final Fighter attackkee) {

        while (attackkee.health > 0 && attacker.health > 0) {
            attackkee.health = attackkee.health - attacker.damagePerAttack;
            if (attackkee.health <= 0) {
                return attacker.name;
            }
            attacker.health = attacker.health - attackkee.damagePerAttack;
            if (attacker.health <= 0) {
                return attackkee.name;
            }
        }

        return attacker.health <= 0 ? attacker.name : attackkee.name;
    }
}