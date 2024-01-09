package se.itmo.ru.interfaces;

import se.itmo.ru.abstracts.Person;

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
        void willGetPrize(String what, Person opponent);
        void dropTemperature(String why);
}
