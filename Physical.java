import java.util.ArrayList;

public class Physical {
    private ArrayList<Attribute> physical;
	private String[] names = {"Força", "Destreza", "Vigor"};

	/**
     * Construtor:
     * instancia o objeto atributo e gera a lista de atributos
     */
	public Physical() {
        physical = new ArrayList<>();
        creatListAttribute();
    }

     /**
     * Retorna o nome do atributo.
     * @param asAttribute: espera um valor inteiro da posição do elemento
     * na lista.
     */
    public String getNameAttribute(int asAttribute) {
        return this.physical.get(asAttribute).getName();
    }
    
    /**
     * Adiciona pontos ao atributo
     */
    public void addPoints(int value, int asAttribute) {
        this.physical.get(asAttribute).addValue(value);
	}

	/**
	 * Popula a lista de atributos fisico.
	 */
	private void creatListAttribute() { 
	    /*
	     * a variável i seleciona a posição do nome do atributo
	     * de forma dinâmica caso adicionar mais um elemento, só adicionar
	     * a lista de String mais um elemento.
	     */
	    for(int i = 0; i < names.length;i++) {
	        Attribute attribute = new Attribute(names[i]);
	        this.physical.add(attribute);
	    }
	}
}
