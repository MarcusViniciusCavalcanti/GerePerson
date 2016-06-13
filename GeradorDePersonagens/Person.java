import java.util.ArrayList;
import java.util.Random;

/**
 * SuperClasse responsável por receber os atributos genericos dos personagens.
 */
public class Person {

    //Atributos
    protected char lineage;
    protected char gender;
    protected int age;
    protected String name;
    protected String lastName;
    protected ArrayList<Attribute> attrPhysical;
    protected ArrayList<Attribute> attrSocial;
    protected ArrayList<Attribute> attrMental;
    protected ArrayList<Skill> skillTalent;
    protected ArrayList<Skill> skillExpertise;
    protected ArrayList<Skill> skillKnowledge;

    /**
     * Construtor.
     */
    public Person() {
        toLineage();
        toGender();
        toAge();
        this.name = "NomeDeTeste";
        this.lastName = "SobrenomeDeTeste";
        
        //Inicializa as listas de atributos
        this.attrPhysical = new ArrayList<>();
        this.attrSocial = new ArrayList<>();
        this.attrMental = new ArrayList<>();
        
        //Inicializa as litas de habilidades.
        this.skillTalent = new ArrayList<>();
        this.skillExpertise = new ArrayList<>();
        this.skillKnowledge = new ArrayList<>();
    }
    
    /**
     * Retorna linhagem m: mortal, s: sobrenatural.
     */
    public char getLineage() {
        return this.lineage;
    }

    /**
     * Retorna gênero m: masculino, f: feminino
     */
    public char getGender() {
        return this.gender;
    }

    /**
     * Retorna a idade.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Retorna o primeiro nome.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Retorna o segundo nome.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Método que retonar os nomes dos atributos
     * @param: nome dos atributos a qual quer os nomes
     */
    public String[] getAttribute(String asAttribute) {
        String[] attribute;
        attribute = new String[Attribute.size(asAttribute)];
        
        switch ( asAttribute ) {
            case "physical":
                for (int i = 0; i < Attribute.size(asAttribute); i++) {
                    attribute[i] = this.attrPhysical.get(i).getName(asAttribute);
                }
                return attribute;
            case "social":
                for (int i = 0; i < Attribute.size(asAttribute); i++) {
                    attribute[i] = this.attrSocial.get(i).getName(asAttribute);
                }
                return attribute;
            case "mental":
                for (int i = 0; i < Attribute.size(asAttribute); i++) {
                    attribute[i] = this.attrMental.get(i).getName(asAttribute);
                }
                return attribute;
            default:
                return null;
        }
    }

    /**
     * Método que retorna uma lista das skill.
     * @param: nome de qual lista de habilidade quer retornar.
     */
    public String[] getSkill(String asSkill) {
        String[] skill;
        skill = new String[Skill.size(asSkill)];
        
        switch ( asSkill ) {
            case "talent":
                for (int i = 0; i < Skill.size(asSkill); i++) {
                    skill[i] = this.skillTalent.get(i).getName(asSkill);
                }
                return skill;
            case "expertise":
                for (int i = 0; i < Skill.size(asSkill); i++) {
                    skill[i] = this.skillExpertise.get(i).getName(asSkill);
                }
                return skill;
            case "knowledge":
                for (int i = 0; i < Skill.size(asSkill); i++) {
                    skill[i] = this.skillKnowledge.get(i).getName(asSkill);
                }
                return skill;
            default:
                return null;
        }
    }

    public int getValueAttr(int asAttribute) {
        return 0;
    }

    public int getValueSkill(int asSkill) {
        return 0;
    }
    
    /**
     * Define o genero do personagem.
     * retorna um valor char masculino: m, feminino: f.
     */
    private void toGender() {
        /*Invoca o método randomNumber()
         * Se par: Masculino
         * se impar: feminino.
         */
        if ( randomNumber() % 2 == 0 )
            this.gender = 'm';
        else
            this.gender = 'f';
    }
    
    /**
     * Define a Linagem do personagem.
     * S: sobrenatural, M: mortal.
     */
    private void toLineage() {
        /*Invoca o método randomNumber()
         * Se par: Sobrenatural.
         * se impar: Mortal.
         */
        if ( randomNumber() % 2 == 0 )
            this.lineage = 's';
        else
            this.lineage = 'm';
    }

    /**
     * Define o nome do personagem.
     * invoca o método ------;
     * Espera o retorno da String da classe de nomes;
     */
    private void toName() {

    }

    /**
     * Define a idade.
     * recebe valor aleatório de 0 a 100.
     * Caso valor aleatório for menor que 16 idade pede outro número.
     */
    private void toAge() {
        int aux;
        boolean isValid;
        
        //Loop para receber outro valor caso menor que 16
        do {
            aux = randomNumber();
            
            if (aux < 16)
              isValid = false;
            else {
              isValid = true;
              this.age = aux;
            }
        }while(isValid == false);
    }
    
    /**
     * Método que retonar um valor aleatório.
     */
    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
