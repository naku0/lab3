package se.itmo.ru.heroes;
import se.itmo.ru.abstracts.*;
import se.itmo.ru.enums.How;
import se.itmo.ru.interfaces.*;
public class Malysh extends Person{
    public Malysh(String name){
        super(name);
    }

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
