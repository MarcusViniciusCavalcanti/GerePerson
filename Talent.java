import java.util.ArrayList;
/**
 * Classe das habilidades de categoria talentos.
 * recebe o valor e instancia o nome da habilidade baseando em uma lista pré-definida 
 * 0 = "Representação";
 * 1 = "Prontidão";
 * 2 = "Esportes"; 
 * 3 = "Briga";
 * 4 = "Esquiva"; 
 * 5 = "Empatia",
 * 6 = "Intimidação";
 * 7 = "Crime";
 * 8 = "Liderança" e; 
 * 9 = "Lábia".
 * 
 * @author (Matheus Mazepa e Vinicius Cavalcanti) 
 * @version (19.06.2016)
 */
public class Talent { 
    private String name;
    private int value;
    
    private final int MAX_POINTS = 5;
    public static int SIZE = 10;

    /**
     * Construtor:
     * Inicializa a habilidade pedindo qual nome será dado e instancia a variável 
     * da instância value com 0.
     * @param index: qual nome será setado para este objeto.
     * 0 = "Representação";
     * 1 = "Prontidão";
     * 2 = "Esportes"; 
     * 3 = "Briga";
     * 4 = "Esquiva"; 
     * 5 = "Empatia",
     * 6 = "Intimidação";
     * 7 = "Crime";
     * 8 = "Liderança" e; 
     * 9 = "Lábia".
     */
    public Talent(int index) {
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
     * 0 = "Representação";
     * 1 = "Prontidão";
     * 2 = "Esportes"; 
     * 3 = "Briga";
     * 4 = "Esquiva"; 
     * 5 = "Empatia",
     * 6 = "Intimidação";
     * 7 = "Crime";
     * 8 = "Liderança" e; 
     * 9 = "Lábia".
     */
    private void toSkillName(int index) {
        /*
         * a variável i seleciona a posição do nome da habilidade
         * de forma dinâmica caso adicionar mais um elemento, só adicionar
         * a lista de String mais um elemento.
         */
        String[] names = {
        "Representação", "Prontidão",
        "Esportes", "Briga",
        "Esquiva", "Empatia",
        "Intimidação", "Crime",
        "Liderança  ", "Lábia"
        };
        this.name = names[index];
    }
}
