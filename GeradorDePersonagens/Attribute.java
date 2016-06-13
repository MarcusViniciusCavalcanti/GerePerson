

public class Attribute {

    private Physical[] physical;
    private Social[] social;
    private Mental[] mental;
    private int position;

    /**
     * Construtor.
     */
    public Attribute(int position, String attribute) {
        this.position = position;
        createList(attribute);
    }

    /**
     * Método que vai retonar o nome do atributo
     * @param asAttribute: qual atributo quer retonar o nome. 
     */
    public String getName(String asAttribute) {
        switch ( asAttribute ) {
            case "physical":
                return this.physical[this.position].getAttrName();
            case "social":
                return this.social[this.position].getAttrName();
            case "mental":
                return this.mental[this.position].getAttrName();
            default:
                return null;
        }
    }

    /**
     * Retorna o valor do atributo
     * @param asAttribute: qual atribute quer retonar o valor.
     */
    public int getValue(String asAttribute) {
        return 0;
    }

    /**
     * Adiciona o valor do atributo.
     * @param value: valor;
     * @param asAttribute: qual atributo.
     */
    public void addValue(int value, String asAttribute) {
       
    }
    
    /**
     * Retorna o tamanho da lista.
     */
    public static int size(String attribute) {
        switch( attribute ) {
            case "physical":
                Physical[] physical = Physical.values();
                return physical.length;
            case "social":
                Social[] social = Social.values();
                return social.length;
            case "mental":
                Mental[] mental = Mental.values();
                return mental.length;
            default:
                return 0;
        }
    }
    
    /**
     * Método que vai verificar qual lista criar.
     */
    private void createList(String attribute) {
        switch( attribute ) {
            case "physical":
                this.physical = Physical.values();
                break;
            case "social":
                this.social = Social.values();
                break;
            case "mental":
                this.mental = Mental.values();
                break;
            default:
                break;
        }
    }
}
