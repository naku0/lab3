package se.itmo.ru.enums;
public enum How {
    ENERGETICLY("энергично"),
    HARD("тяжело"),
    ALITTLE("немножко"),
    SINFUL("грех"),
    COMPLETELY("совершенно");
    private String name;
    How(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

