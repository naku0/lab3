package se.itmo.ru.mainstory;

import se.itmo.ru.abstracts.Person;
import se.itmo.ru.abstracts.ReasonOfArgue;
import se.itmo.ru.enums.HealthCondition;

public class Story {

    public static void story(Person sick, Person good, ReasonOfArgue reasonOfArgue) {
        Person person1;
        Person person2;
        if ((sick.getCondition() == HealthCondition.GOOD) && (good.getCondition() == HealthCondition.SICK)) {
            person1 = good;
            person2 = sick;
        } else {
            person1 = sick;
            person2 = good;
        }
        person1.setTemperature(40);
        person1.continued();
        person1.chew("");
        System.out.print(" и,");
        person1.swallow("");
        person1.layed("");
        person1.gasped("");
        System.out.println(": ");

        System.out.print("Честное слово, теперь и ");
        person2.was();
        person2.trick("");
        System.out.print(". ");
        person2.trust("");
        System.out.println(", что у");

        person1.dropTemperature("");

        person2.wantedToLose();
        reasonOfArgue.remain();
        System.out.print("и ");
        person2.willGetPrize(reasonOfArgue, person1);
    }
}