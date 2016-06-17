import java.util.ArrayList;
/**
 * Classe que define os atributos da categoria fisico:
 *  Nome;
 *  Pontos;
 *  O nome é definido em tempo de execução recebendo no construtor qual nome o atributo terá 
 *  em uma lista já estabelecida.
 *  0 = carisma;
 *  1 = manipulação;
 *  2 = aparencia.
 *  constate publica que armazena a quantidade de atributos diferentes baseados no nome.
 */
public class Social {
	private String name;
	private int value;
	
	private final int MAX_POINTS = 5;
	public static final int SIZE = 3;

	/**
     * Construtor:
     * instancia o objeto atributo e gera a lista de atributos
     * @param index: indice do nome do atributo.
     * 0 = carisma
     * 1 = manipulação.
     * 2 = aparencia.
     */
    public Social(int index) {
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
     * @return o valor dos pontos do atributo.
     */
    public int getValue() {
        return this.value;
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
     * Popula a lista de atributos social.
     * @param index: recebe a posição do nome do atributo.
     * 0 = carisma
     * 1 = manipulação.
     * 2 = aparencia.
     */
    private void setAttributeName(int index) { 
        /*
         * a variável i seleciona a posição do nome do atributo
         * de forma dinâmica caso adicionar mais um elemento, só adicionar
         * a lista de String mais um elemento.
         */
        String[] names = {"Carisma"," Manipulação", "Aparência"};
        this.name = names[index];
    }
}
