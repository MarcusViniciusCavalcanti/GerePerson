import java.util.ArrayList;
/**
 * 
 */
public class Expertise {
    private String name;
    private int value;
    
    private final int MAX_POINTS = 5;
    public static int SIZE = 10;

    /**
     * Construtor:
     * Inicializa a habilidade pedindo qual nome será dado e instancia a variável 
     * da instância value com 1.
     * @param index: qual nome será setado para este objeto.
     * 0 = "Empatia com animais";
     * 1 = "Arqueirismo";
     * 2 = "Artesanato"; 
     * 3 = "Etiqueta";
     * 4 = "Herborismo"; 
     * 5 = "Armas brancas",
     * 6 = "Música";
     * 7 = "Cavalgar";
     * 8 = "Furtividade" e; 
     * 9 = "Sobrevivência".
     */
    public Expertise(int index) {
        toSkillName(index);
        this.value = 0;
    }

    /**
     * @return O nome do habilidade.
     */
    public String getNameSkill() {
        return this.name;
    }
    
    /**
     * @return devolve o valor de pontos que o habilidade tem.
     */
    public int getValue() {
        return this.value;
    }

     /**
     * Adiciona 1 ponto ao habilidade em um máximo de 3 pontos.
     * @return Valida a adição dos pontos false não o atributo chegou ao máximo
     * de 5, true foi adicionado.
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
     * Define o nome do habilidade baseado em uma lista pré-definida
     * @param index: qual nome será setado para este objeto.
     * 0 = "Empatia com animais";
     * 1 = "Arqueirismo";
     * 2 = "Artesanato"; 
     * 3 = "Etiqueta";
     * 4 = "Herborismo"; 
     * 5 = "Armas brancas",
     * 6 = "Música";
     * 7 = "Cavalgar";
     * 8 = "Furtividade" e; 
     * 9 = "Sobrevivência".
     */
    private void toSkillName(int index) {
        /*
         * a variável i seleciona a posição do nome da habilidade
         * de forma dinâmica caso adicionar mais um elemento, só adicionar
         * a lista de String mais um elemento.
         */
        String[] names = {
        "Empatia com animais", "Arqueirismo",
        "Artesanato", "Etiqueta",
        "Herborismo", "Armas brancas",
        "Música", "Cavalgar",
        "Furtividade", "Sobrevivência"
        };
        this.name = names[index];
    }
}
