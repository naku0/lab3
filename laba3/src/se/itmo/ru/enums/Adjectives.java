package se.itmo.ru.enums;
public enum Adjectives {
    LAST(" последний "),
    TRIPLE("тройной "),
    SUGARY(" приторного ")
    ;
    private String name;
    Adjectives(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
