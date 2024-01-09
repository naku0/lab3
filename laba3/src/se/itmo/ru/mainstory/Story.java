package se.itmo.ru.mainstory;
import se.itmo.ru.abstracts.Person;
import se.itmo.ru.abstracts.ReasonOfArgue;

public class Story {

    public static void story(Person person1, Person person2, ReasonOfArgue reasonOfArgue){
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
        person2.willGetPrize(reasonOfArgue.toString(), person1);
    }
}