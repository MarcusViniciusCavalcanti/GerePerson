 

import java.util.ArrayList;
/**
 * 
 */
public class Mental {
	private String name;
	private int value;

	private final int MAX_POINTS = 5;
	public static final int SIZE = 3;

	/**
     * Construtor:
     * instancia o objeto atributo e gera a lista de atributos
     * @param index: indice do nome do atributo.
     * 0 = percepção.
     * 1 = inteligência.
     * 2 = raciocínio.
     */
    public Mental(int index) {
        setAttributeName(index);
        this.value = 1;
    }

     /**
     * @return o nome do atributo.
     */
    public String getNameAttribute() {
        return this.name;
    }
    
    /**
     * Adiciona pontos ao atributo
     * @return se os pontos foram adicionados true para adicionado false para não
     * caso o atributo já tenha o valor máximo de 5
     */
    public boolean addPoints() {
        /*
         * Caso quantidade de pontos estourar
         * retorna false, entretanto menor que 5 adicona um ponto e
         * retonar verdadeiro para o método que o invocou.
         */
        
        if(this.value < MAX_POINTS) {
            this.value++;
            return true;
        }
        
        return false;
    }

    /**
     * Retorna os valores dos pontos
     */
    public int getValue() {
        return this.value;
    }
    
    /**
     * Popula a lista de atributos mentais.
     * @param index: recebe a posição do nome do atributo.
     */
    private void setAttributeName(int index) { 
        /*
         * a variável i seleciona a posição do nome do atributo
         * de forma dinâmica caso adicionar mais um elemento, só adicionar
         * a lista de String mais um elemento.
         */
        String[] names = {"Percepção", "Inteligência", "Raciocínio"};
        this.name = names[index];
    }
}
