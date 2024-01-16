package se.itmo.ru.interfaces.argue;

import se.itmo.ru.abstracts.Person;
import se.itmo.ru.abstracts.ReasonOfArgue;

public interface CompleteArgue {
    void completeArgue(ReasonOfArgue reason, int amount);
}
