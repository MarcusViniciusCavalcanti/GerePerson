import java.util.ArrayList;

/**
 * 
 */
public class Physical {
    private String name;
    private int value;
    public static final int SIZE = 3;
    
    /**
     * Construtor:
     * instancia o objeto atributo e gera a lista de atributos
     */
    public Physical(int index) {
        setAttributeName(index);
        this.value = 1;
    }

     /**
     * Retorna o nome do atributo.
     */
    public String getNameAttribute() {
        return this.name;
    }
    
    /**
     * Adiciona pontos ao atributo
     */
    public boolean addPoints() {
        /*
         * Caso quantidade de pontos estourar
         * retorna false, entretanto menor que 5 adicona um ponto e
         * retonar verdadeiro para o método que o invocou.
         */
        
        if(this.value < 5) {
            this.value++;
            return true;
        }
        
        return false;
    }

    /**
     * Popula a lista de atributos fisico.
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
