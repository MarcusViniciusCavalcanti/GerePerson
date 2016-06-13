

public class Skill {

    private Talent[] talent;
    private Expertise[] expertise;
    private Knowledge[] knowledge;
    private int position;

    /**
     * Construtor.
     */
    public Skill(int position, String asSkill) {
        this.position = position;
        createList(asSkill);
    }

    /**
     * Retorna o nome da habilidade.
     * @param asSkill: qual habilidade quer retonar.
     */
    public String getName(String asSkill) {
        switch ( asSkill ) {
            case "talent":
                return this.talent[this.position].talentName();
            case "expertise":
                return this.expertise[this.position].expertiseName();
            case "knowledge":
                return this.knowledge[this.position].knowledgeName();
            default:
                return null;
        }
    }

    /**
     * Retorna o valor da habilidade.
     * @param asSkill: qual habilidade quer retonar o valor.
     */
    public int getValue(String asSkill) {
        switch ( asSkill ) {
            case "talent":
                return this.talent[this.position].pontsValue();
            case "expertise":
                return this.expertise[this.position].pontsValue();
            case "knowledge":
                return this.knowledge[this.position].pontsValue();
            default:
                return 0;
        }
    }

    /**
     * Adiciona valor na habilidade.
     * @param value: o valor.
     * @param asSkill: qual habilidade se deseja adicionar.
     */
    public void addValue(int value, String asSkill) {
        
    }

    /**
     * Retorna a quantidade de habilidades.
     */
    public static int size(String asSkill) {
        switch( asSkill ) {
            case "talent":
                Talent[] talent = Talent.values();
                return talent.length;
            case "expertise":
                Expertise[] expertise = Expertise.values();
                return expertise.length;
            case "knowledge":
                Knowledge[] knowledge = Knowledge.values();
                return knowledge.length;
            default:
                return 0;
        }
    }
    
    /**
     * Método que verifica qual lista se deseja criar.
     */
    private void createList(String asSkill) {
        switch ( asSkill ) {
            case "talent":
                this.talent = Talent.values();
                break;
            case "expertise":
                this.expertise = Expertise.values();
                break;
            case "knowledge":
                this.knowledge =Knowledge.values();
                break;
            default:
                break;
        }
   }
}
