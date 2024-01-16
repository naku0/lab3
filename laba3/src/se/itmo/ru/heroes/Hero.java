package se.itmo.ru.heroes;

import se.itmo.ru.abstracts.Person;
import se.itmo.ru.enums.*;

public class Hero extends Person {
    public Hero(String name, HealthCondition condition) {
        super(name, condition);
    }

    @Override
    public void chew(String how) {
        how = How.ENERGETICLY.getName();
        super.chew(how);
    }

    @Override
    public void swallow(String what) {
        what = (Adjectives.LAST.getName() + "кусок,");
        super.swallow(what);
    }

    @Override
    public void layed(String location) {
        location = " на подушку";
        super.layed(location);
    }

    @Override
    public void gasped(String how) {
        how = How.HARD.getName();
        super.gasped(how);
    }

    @Override
    public void dropTemperature(String why) {
        why = (Adjectives.TRIPLE.getName() + "порции" + Adjectives.SUGARY.getName() + "порошка");
        super.dropTemperature(why);
    }

    //dsds
    @Override
    public void trick(String how) {
        how = (How.ALITTLE.getName());
        super.trick(how);
    }

    @Override
    public void trust(String how) {
        how = How.COMPLETELY.getName();
        super.trust(how);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
