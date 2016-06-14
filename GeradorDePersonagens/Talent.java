

public enum Talent {

    EPRESENTION(0, 0, "Representação"),
    EADINESS(1, 0, "Prontidão"),
    SPORT(2, 0, "Esporte"),
    FIGHT(3, 0, "Briga"),
    FLEE(4, 0, "Esquiva"),
    EMPATHY(5, 0, "Empátia"),
    INTIMIDATION(6, 0, "Intimidação"),
    CRIME(7, 0, "Crime"),
    LEARDERSHIP(8, 0, "Liderança"),
    CHIN(9, 0, "Lábia");

    private int talent;
    private int value;
    private final String NAME;

    Talent(int talent, int value, String name) {
        this.NAME = name;
        this.talent = talent;
        skillPoints(value);
    }

    public int getTalent() {
        return this.talent; 
    }

    public String talentName() {
        return this.NAME;
    }

    public int pontsValue() {
        return this.value;
    }

    public void skillPoints(int value) {
        this.value = value;
    }

}
