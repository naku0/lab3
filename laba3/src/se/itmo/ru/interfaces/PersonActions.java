package se.itmo.ru.interfaces;

import se.itmo.ru.abstracts.Person;
import se.itmo.ru.abstracts.ReasonOfArgue;

public interface PersonActions {
    void chew(String how);

    void swallow(String what);

    void continued();

    void layed(String location);

    void gasped(String how);

    void usePowder(double amount);

    void trick(String how);

    void was();

    void trust(String what);

    void wantedToLose();

    void willGetPrize(ReasonOfArgue reasonOfArgue, Person opponent);

    void dropTemperature(String why);
}
