package se.itmo.ru.UsableObj;
import se.itmo.ru.abstracts.*;
import se.itmo.ru.interfaces.argue.CompleteArgue;
import se.itmo.ru.interfaces.argue.WinAnArgue;

import java.util.Objects;
import java.util.Scanner;

public class Argue implements WinAnArgue, CompleteArgue {
    private Person person1;
    private Person person2;
    public Argue(Person person1, Person person2){
        this.person1 = person1;
        this.person2 = person2;
    }
    @Override
    public String winAnArgue() {
        if (person1.getTemperature() >= 35 && person1.getTemperature() <= 37){
            person1.setWin(true);
         return person1 + " выиграл спор";
        } else {
            person2.setWin(true);
            return person2 + " выиграл спор";
        }
    }

    @Override
    public void completeArgue(ReasonOfArgue reason) {

        System.out.print("Введите количество порошка для "+ person1.toString() + ": ");
        Scanner sc = new Scanner(System.in);
        person1.usePowder(sc.nextInt());
        System.out.println(this.winAnArgue());
        reason.whoIsOwner(person1, person2);
        System.out.println(reason.getOwner() + " получил " + reason.getName());
        System.out.println("Температура " + person1.getName() + ": " + person1.getTemperature());
    }

    @Override
    public String toString() {
        return "Argue{" +
                "person1=" + person1 +
                ", person2=" + person2 +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Argue argue = (Argue) object;
        return Objects.equals(person1, argue.person1) && Objects.equals(person2, argue.person2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person1, person2);
    }
}
