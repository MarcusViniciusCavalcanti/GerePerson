
/**
 * 
 */
public class Talent extends Skill {

    /* 
     * Constantes com os nomes dos Talentos
     * A utilização dos atributos em constantes basea-se no princípio
     * da manutenabilidade, mais fácil para alterar os nomes das mesmas, 
     * caso haja a necessidade disto.
     */
    private final String TALENT_01 = "Representação";
    private final String TALENT_02 = "Prontidão";
    private final String TALENT_03 = "Esportes";
    private final String TALENT_04 = "Briga";
    private final String TALENT_05 = "Esquiva";
    private final String TALENT_06 = "Empatia";
    private final String TALENT_07 = "Intimidação";
    private final String TALENT_08 = "Crime";
    private final String TALENT_09 = "Liderança";
    private final String TALENT_10 = "Lábia";
   
    /**
     * Construtor:
     * Inicializa valor inicial da classe super (Skill) gera possíbilidade de inicializar
     * valores iniciais diferentes de zero para as Talentos.
     * @param value: Espera valores inteiros para os atributos de talento.
     */
    public Talent(int value) {
        super(value);
    }
    
    /**
     * Retornar o nome do Primeiro talento.
     */
    public String getTalentName01() {
        return this.TALENT_01;
    }
    
    /**
     * Retornar o nome do segundo talento.
     */
    public String getTalentName02() {
        return this.TALENT_02;
    }
    
    /**
     * Retornar o nome do terceiro talento.
     */
    public String getTalentName03() {
        return this.TALENT_03;
    }
    
    /**
     * Retornar o nome do quarto talento.
     */
    public String getTalentName04() {
        return this.TALENT_04;
    }
    
    /**
     * Retornar o nome do quinto talento.
     */
    public String getTalentName05() {
        return this.TALENT_05;
    }
    
    /**
     * Retornar o nome do sexto talento.
     */
    public String getTalentName06() {
        return this.TALENT_06;
    }
    
    /**
     * Retornar o nome do sétimo talento.
     */
    public String getTalentName07() {
        return this.TALENT_07;
    }
    
    /**
     * Retornar o nome do oitavo talento.
     */
    public String getTalentName08() {
        return this.TALENT_08;
    }
    
    /**
     * Retornar o nome do nono talento.
     */
    public String getTalentName09() {
        return this.TALENT_09;
    }
    
    /**
     * Retornar o nome do décimo talento.
     */
    public String getTalentName10() {
        return this.TALENT_10;
    }
    
    /**
     * Retorna uma matriz de String unidimensional com o nome de todas
     * as Habilidades de Perícia.
     */
    public String[] getListname() {
        String[] name;
        name = new String[10];
        
        name[0] = this.TALENT_01;
        name[1] = this.TALENT_01;
        name[2] = this.TALENT_03;
        name[3] = this.TALENT_04;
        name[4] = this.TALENT_05;
        name[5] = this.TALENT_06;
        name[6] = this.TALENT_07;
        name[7] = this.TALENT_08;
        name[8] = this.TALENT_09;
        name[9] = this.TALENT_10;
        
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
