package se.itmo.ru;

import se.itmo.ru.abstracts.ReasonOfArgue;
import se.itmo.ru.enums.HealthCondition;
import se.itmo.ru.heroes.*;
import se.itmo.ru.UsableObj.*;
import se.itmo.ru.mainstory.Story;

public class Main {
    public static void main(String[] args) {
        Hero karlson = new Hero("Карлсон", HealthCondition.SICK);
        Hero malysh = new Hero("Малыш", HealthCondition.GOOD);
        Argue newArgue = new Argue(karlson, malysh);
        Chocolate chocolate = new Chocolate("шоколадка");
        Story.story(karlson, malysh, chocolate);
        System.out.println("_____________");
        newArgue.completeArgue(chocolate, 2);
        System.out.println(chocolate.hashCode());
    }
}
/*Карлсон продолжал энергично работать челюстями и, проглотив последний кусок, откинулся на подушку и тяжело вздохнул:
Честное слово, теперь и Малышу было не грех немножко схитрить. Он, конечно, совершенно не верил,
что у Карлсона упадет температура даже и от тройной порции "приторного порошка",
но ведь ему так хотелось на этот раз проспорить! Осталась еще одна шоколадка,
и он ее получит, если Карлсон выиграет спор.
*/