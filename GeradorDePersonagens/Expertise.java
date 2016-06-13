
public enum Expertise {
    EXPERTISE_ANIMAL(0, 0, "Perícia com animais"),
    ARCHERY(1, 0, "Arqueirismo"),
    HANDICRAFT(2, 0, "Artesanato"),
    FORMALITY(3, 0, "Formalidade"),
    HERBAMLISM(4, 0, "Herbalismo"),
    WEAPON(5, 0, "Armas brancas"),
    MUSIC(6, 0, "Música"),
    HORRSE_RIDING(7, 0, "Cavalgar"),
    STEALTH(8, 0, "Furtividade"),
    SURVIVAL(9, 0, "Sobrevivência");

    private int expertise;
    private int value;
    private final String NAME;

    Expertise(int expertise, int value, String name) {
        this.NAME = name;
        this.expertise = expertise;
        skillPoints(value);
    }

    public int getExpertise() {
        return this.expertise;
    }

    public String expertiseName() {
        return this.NAME;
    }

    public int pontsValue() {
        return this.value;
    }

    public void skillPoints(int value) {
        this.value = value;
    }

}
