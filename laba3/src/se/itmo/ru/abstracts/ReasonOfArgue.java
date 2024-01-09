package se.itmo.ru.abstracts;
import se.itmo.ru.interfaces.ObjectActions;
import java.util.Objects;

abstract public class ReasonOfArgue implements ObjectActions {
    private String owner;
    private String name;
    public ReasonOfArgue(String name){
        this.name = name;
    }
    public void remain(){
        System.out.println("Осталась ещё одна " + name + ", ");
    }
    @Override
    public void whoIsOwner(Person person1, Person person2) {
        if (person1.isWin()){
            this.owner = person2.toString();
            person1.setWin(false);
        }
        else{
            this.owner = person1.toString();
            person2.setWin(false);
        }
    }
    public String getOwner(){
        return this.owner;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ReasonOfArgue that = (ReasonOfArgue) object;
        return Objects.equals(owner, that.owner) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, name);
    }
}
