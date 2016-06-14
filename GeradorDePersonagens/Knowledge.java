
/**
 * Write a description of class Knowledge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knowledge extends Skill {

    /* 
     * Constantes com os nomes dos Talentos
     * A utilização dos atributos em constantes basea-se no princípio
     * da manutenabilidade, mais fácil para alterar os nomes das mesmas, 
     * caso haja a necessidade disto.
     */
    private final String KNOWLEDGE_01 = "Representação";
    private final String KNOWLEDGE_02 = "Prontidão";
    private final String KNOWLEDGE_03 = "Esportes";
    private final String KNOWLEDGE_04 = "Briga";
    private final String KNOWLEDGE_05 = "Esquiva";
    private final String KNOWLEDGE_06 = "Empatia";
    private final String KNOWLEDGE_07 = "Intimidação";
    private final String KNOWLEDGE_08 = "Crime";
    private final String KNOWLEDGE_09 = "Liderança";
    private final String KNOWLEDGE_10 = "Lábia";
   
    /**
     * Construtor:
     * Inicializa valor inicial da classe super (Skill) gera possíbilidade de inicializar
     * valores iniciais diferentes de zero para as Conhecimento.
     * @param value: Espera valores inteiros para os atributos de Conhecimento.
     */
    public Knowledge(int value) {
        super(value);
    }
    
    /**
     * Retornar o nome do Primeiro talento.
     */
    public String getKnowledgeName01() {
        return this.KNOWLEDGE_01;
    }
    
    /**
     * Retornar o nome do segundo talento.
     */
    public String getKnowledgeName02() {
        return this.KNOWLEDGE_02;
    }
    
    /**
     * Retornar o nome do terceiro talento.
     */
    public String getKnowledgeName03() {
        return this.KNOWLEDGE_03;
    }
    
    /**
     * Retornar o nome do quarto talento.
     */
    public String getKnowledgeName04() {
        return this.KNOWLEDGE_04;
    }
    
    /**
     * Retornar o nome do quinto talento.
     */
    public String getKnowledgeName05() {
        return this.KNOWLEDGE_05;
    }
    
    /**
     * Retornar o nome do sexto talento.
     */
    public String getKnowledgeName06() {
        return this.KNOWLEDGE_06;
    }
    
    /**
     * Retornar o nome do sétimo talento.
     */
    public String getKnowledgeName07() {
        return this.KNOWLEDGE_07;
    }
    
    /**
     * Retornar o nome do oitavo talento.
     */
    public String getKnowledgeName08() {
        return this.KNOWLEDGE_08;
    }
    
    /**
     * Retornar o nome do nono talento.
     */
    public String getKnowledgeName09() {
        return this.KNOWLEDGE_09;
    }
    
    /**
     * Retornar o nome do décimo talento.
     */
    public String getKnowledgeName10() {
        return this.KNOWLEDGE_10;
    }
    
    /**
     * Retorna uma matriz de String unidimensional com o nome de todas
     * as Habilidades de Perícia.
     */
    public String[] getListname() {
        String[] name;
        name = new String[10];
        
        name[0] = this.KNOWLEDGE_01;
        name[1] = this.KNOWLEDGE_01;
        name[2] = this.KNOWLEDGE_03;
        name[3] = this.KNOWLEDGE_04;
        name[4] = this.KNOWLEDGE_05;
        name[5] = this.KNOWLEDGE_06;
        name[6] = this.KNOWLEDGE_07;
        name[7] = this.KNOWLEDGE_08;
        name[8] = this.KNOWLEDGE_09;
        name[9] = this.KNOWLEDGE_10;
        
        return name;
    }
    
    /**
     * Retornar o tamanho da lista de habilidades.
     * Necessário para alguns métodos.
     */
    public static int size() {
        int leng;
        leng = 10;
        
        return leng;
    }
}
