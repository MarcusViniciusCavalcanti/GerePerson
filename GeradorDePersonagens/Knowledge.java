

public enum Knowledge {
    INSTRUCTION(0, 0, "Instrução"),
    POPULAR_KNOWLEDGE(1, 0, "Sabedoria Popular"),
    INVESTIGATION(2, 0, "Investigação"),
    JUSTICE(3, 0, "Direito"),
    LINGUISTICS(4, 0, "Linguistica"),
    OCCULTISM(5, 0, "Ocultismo"),
    MEDICNE(6, 0, "Medicina"),
    POLICE(7, 0, "Policia"),
    SCIENCE(8, 0, "Ciência"),
    SENESCALIA(9, 0, "Senecália");

    private int knowledge;
    private int value;
    private final String NAME;

    Knowledge(int knowledge, int value, String name) {
        this.NAME = name;
        this.knowledge = knowledge;
        skillPoints(value);
    }

    public int getKnowledge() {
        return this.knowledge;
    }

    public String knowledgeName() {
        return this.NAME;
    }

    public int pontsValue() {
        return this.value;
    }

    public void skillPoints(int value) {
        this.value = value;
    }

}
