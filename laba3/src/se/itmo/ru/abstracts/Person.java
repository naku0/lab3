package se.itmo.ru.abstracts;

import se.itmo.ru.enums.HealthCondition;
import se.itmo.ru.enums.How;
import se.itmo.ru.interfaces.PersonActions;

import java.util.Objects;

abstract public class Person implements PersonActions {
    private final String name;
    private double temperature;
    private boolean win;
    private HealthCondition condition;

    public Person(String name, HealthCondition condition) {
        this.name = name;
        this.temperature = 36.6;
        this.win = false;
        this.condition = condition;
    }

    @Override
    public void chew(String how) {
        System.out.print(how + " работать челюстями");
    }

    @Override
    public void continued() {
        System.out.print(name + " продолжил ");
    }

    @Override
    public void swallow(String what) {
        System.out.print(" проглотив" + what);
    }

    @Override
    public void layed(String location) {
        System.out.print(" откинулся" + location + " и ");
    }

    @Override
    public void gasped(String how) {
        System.out.print(how + " вздохнул");
    }

    @Override
    public void usePowder(double amount) {
        this.setTemperature(temperature - amount * 1.5);
    }

    @Override
    public void trick(String how) {
        System.out.print(" не грех " + how + " схитрить");
    }

    @Override
    public void was() {
        System.out.print(getName() + " было");
    }

    @Override
    public void trust(String how) {
        System.out.print(this.name + ", конечно, " + how + " не верил");
    }

    @Override
    public void wantedToLose() {
        System.out.print(name + " так хотел на этот раз проспорить! ");
    }

    @Override
    public void willGetPrize(ReasonOfArgue reasonOfArgue, Person opponent) {
        if (!(this.win)) {
            System.out.println(name + " получит " + reasonOfArgue.toString() + ", если " + opponent.toString() + " выиграет спор.");
        } else {
            System.out.println(name + " не получит " + reasonOfArgue.toString());
        }
    }

    @Override
    public void dropTemperature(String why) {
        if (why.isEmpty()) {
            why = "от лекарства";
        }
        System.out.println(name + " упадет температура даже и от " + why + ", ");
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double amount) {
        this.temperature = amount;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public HealthCondition getCondition() {
        return condition;
    }

    public void setCondition(HealthCondition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(temperature, person.temperature) == 0 && win == person.win && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, temperature);
    }

}
