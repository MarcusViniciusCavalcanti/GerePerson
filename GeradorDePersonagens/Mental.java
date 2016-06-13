
public enum Mental {

    PERCEPTION(0, 1, "Percepção"),
    INTELLIGENCE(1, 1, "Inteligencia"),
    REASONING(2, 1, "Raciocínio");

    private int index;
    private int value;
    private final String NAME;

    Mental(int index, int value, String name) {
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
