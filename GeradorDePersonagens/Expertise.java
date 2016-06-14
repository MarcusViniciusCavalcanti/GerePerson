
/**
 * Write a description of class Expertise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Expertise extends Skill {

    //Constantes com os nomes dos Talentos
    private final String EXPERTISE_01 = "Empatia com animais";
    private final String EXPERTISE_02 = "Arqueirismo";
    private final String EXPERTISE_03 = "Artesanato";
    private final String EXPERTISE_04 = "Etiqueta";
    private final String EXPERTISE_05 = "Herborismo";
    private final String EXPERTISE_06 = "Armas brancas";
    private final String EXPERTISE_07 = "Música";
    private final String EXPERTISE_08 = "Cavalgar";
    private final String EXPERTISE_09 = "Furtividade";
    private final String EXPERTISE_10 = "Sobrevivência";
   
    /**
     * Construtor:
     * Inicializa valor inicial da classe super (Skill) gera possíbilidade de inicializar
     * valores iniciais diferentes de zero para as Perícias.
     * @param value: Espera valores inteiros para os atributos de Perícias.
     */
    public Expertise(int value) {
        super(value);
    }
    
    /**
     * Retornar o nome do Primeiro Perícias.
     */
    public String getExpertiseName01() {
        return this.EXPERTISE_01;
    }
    
    /**
     * Retornar o nome do segundo Perícias.
     */
    public String getExpertiseName02() {
        return this.EXPERTISE_02;
    }
    
    /**
     * Retornar o nome do terceiro Perícias.
     */
    public String getExpertiseName03() {
        return this.EXPERTISE_03;
    }
    
    /**
     * Retornar o nome do quarto Perícias.
     */
    public String getExpertiseName04() {
        return this.EXPERTISE_04;
    }
    
    /**
     * Retornar o nome do quinto Perícias.
     */
    public String getExpertiseName05() {
        return this.EXPERTISE_05;
    }
    
    /**
     * Retornar o nome do sexto Perícias.
     */
    public String getExpertiseName06() {
        return this.EXPERTISE_06;
    }
    
    /**
     * Retornar o nome do sétimo Perícias.
     */
    public String getExpertiseName07() {
        return this.EXPERTISE_07;
    }
    
    /**
     * Retornar o nome do oitavo Perícias.
     */
    public String getExpertiseName08() {
        return this.EXPERTISE_08;
    }
    
    /**
     * Retornar o nome do nono Perícias.
     */
    public String getExpertiseName09() {
        return this.EXPERTISE_09;
    }
    
    /**
     * Retornar o nome do décimo Perícias.
     */
    public String getExpertiseName10() {
        return this.EXPERTISE_10;
    }
    
    /**
     * Retorna uma matriz de String unidimensional com o nome de todas
     * as Habilidades de Perícia.
     */
    public String[] getListname() {
        String[] name;
        name = new String[10];
        
        name[0] = this.EXPERTISE_01;
        name[1] = this.EXPERTISE_02;
        name[2] = this.EXPERTISE_03;
        name[3] = this.EXPERTISE_04;
        name[4] = this.EXPERTISE_05;
        name[5] = this.EXPERTISE_06;
        name[6] = this.EXPERTISE_07;
        name[7] = this.EXPERTISE_08;
        name[8] = this.EXPERTISE_09;
        name[9] = this.EXPERTISE_10;
        
        return name;
    }
}
