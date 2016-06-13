
public enum Social {

    CHARISMA(0, 1, "Carisma"),
    MANIPULATION(1, 1, "Manipulação"),
    APPEARANCE(2, 1, "Aparência");

    private int index;
    private int value;
    private final String NAME;

    Social(int index, int value, String name) {
        this.index = index;
        this.NAME = name;
        attrPonts(value);
    }
        
    public String getAttrName() {
        return this.NAME;
    }

    public int getAttr() {
        return this.index;
    }

    public int getPontsValue() {
        return this.value;
    }

    public void attrPonts(int value) {
        this.value = value;
    }
}
