import java.util.ArrayList;
/**
 * Classe que define os atributos da categoria fisico:
 *  Nome;
 *  Pontos;
 *  O nome é definido em tempo de execução recebendo no construtor qual nome o atributo terá 
 *  em uma lista já estabelecida.
 *  0 = Força;
 *  1 = Destreza;
 *  2 = Vigor.
 *  constate publica que armazena a quantidade de atributos diferentes baseados no nome.
 */
public class Physical {
    private String name;
    private int value;
    
    private final int MAX_POINTS = 5;
    public static final int SIZE = 3;
    
    /**
     * Construtor:
     * instancia o objeto atributo e gera a lista de atributos.
     * Todos os atributos tem valor inicial de 1 ponto.
     * @param: index da lista de nomes que o objeto pode ter.
     */
    public Physical(int index) {
        setAttributeName(index);
        this.value = 1;
    }

    /**
     * @return: nome do atributo.
     */
    public String getNameAttribute() {
        return this.name;
    }
    
    /**
<<<<<<< HEAD
     * Valor das quantidade de pontos que o atributo tem.
     * @return: quantidade de pontos.
=======
     * Retorna os valores dos pontos
>>>>>>> 4f6b32ef351645ee7935e39a20e0c07fa763395c
     */
    public int getValue() {
        return this.value;
    }
    
    /**
     * Adiciona pontos ao atributo
     * @return : retorna se a quantidade de pontos ultrapassou o limite pré-estabelecido.
     * verdadeiro para sim, e não adiciona mais nenhum ponto, false para não e adiciona o ponto
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
     * Popula a lista de atributos fisico.
     * @param: posição do nome na Array de nomes. 
     *  0 = Força;
     *  1 = Destreza;
     *  2 = Vigor.
     */
    private void setAttributeName(int index) { 
        /*
         * a variável i seleciona a posição do nome do atributo
         * de forma dinâmica caso adicionar mais um elemento, só adicionar
         * a lista de String mais um elemento.
         */
        String[] names = {"Força", "Destreza", "Vigor"};
        this.name = names[index];
    }
}
