

public enum Physical {

    FORCE(0, 1, "Força"),
    DEXTERITY(1, 1, "Dextreza"),
    VIGOR(2, 1, "Vigor");
    
    private int index;
    private int value;
    private String NAME;

    Physical(int index, int value, String name) {
        this.index = index;
        this.NAME = name;
        attrPonts(value);
        
        // forca = new Habilidade("Forca", 0, 1);
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
