import java.util.Random;
import java.util.ArrayList;
/**
 * Super classe Personagem, define nome, gênero, liagem e idade de forma aleatória
 * para as demais classes. 
 * Além de definir a coleção de atributos e de habilidades.
 */ 

public class Person {
    protected char lineage;
    protected char gender;
    protected String name;
    protected String lastName;
    protected int age;
    protected int willPower;
    protected ArrayList<Physical> physical;
    protected ArrayList<Social> social;
    protected ArrayList<Mental> mental;
    protected ArrayList<Talent> talent;
    protected ArrayList<Expertise> expertise;
    protected ArrayList<Knowledge> knowledge;

    /**
     * Construtor: Inicializa os método que definiram:
     *  Gênero;
     *  Linhage;
     *  Idade;
     *  Nome (baseado no gênero) e;
     *  Sobrenome;
     * Inicializa definindo um valor inicial de pontos de vontade.
     * @param value: espera um valor inteiro dos pontos de vontade.
     */
    public Person() {
        toGender();    //define gênero.
        toLineage();   //define linhagem. 
        toAge();       //define idade.
        toName();      //define Nome.
        
        /*
         * Pontos de força de vontade já inicaliza com -- pontos
         * Inicializado no construror com o método toWillPower()
         * esperando como parâmetro um valor int.
         */
        this.willPower = 5;
        
        /*
         * Cria lista os objetos atributos.
         */
        this.physical = new ArrayList<>();
        this.social = new ArrayList<>();
        this.mental = new ArrayList<>();
        /*
         * Cria lista os objetos habilidades.
         */
        this.talent = new ArrayList<>();
        this.expertise = new ArrayList<>();
        this.knowledge = new ArrayList<>();
        
        addPhysicalAttribute(); //adiciona os atributos fisicos
        addSocialAttribute();   //adiciona os atributos sociais.
        addMentalAttribute();    //adiciona os atributos mentais.
        
        addTalentSkill();       //adiciona as habilidades talentos.
        addExpertiseSkill();    //adiciona as habilidades perícias.
        addKnowledgeSkill();    //adiciona as habilidades conhecimentos.
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
     * Define a quantidade dos pontos de força de vontade.
     * @param value: valor inteiro que ajusta o valor.
     */
    public void setWillPower(int value) {
        this.willPower = value;
    }

    public void toPointsBonuts() {

    }
    
    /**
     * Método que retonar um valor aleatório.
     */
    public int randomNumber(int value) {
        Random random = new Random();
        return random.nextInt(value);
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
        if ( randomNumber(2) == 0 )
            this.lineage = 's';
        else
            this.lineage = 'm';
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
        if ( randomNumber(2) == 0 )
            this.gender = 'm';
        else
            this.gender = 'f';
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
            aux = randomNumber(100);
            
            if (aux < 16)
              isValid = false;
            else {
              isValid = true;
              this.age = aux;
            }
        }while(isValid == false);
    }
    
    /**
     * Define o nome do personagem.
     * invoca o método getName() de DbName.
     * Espera o retorno da String da classe de nomes;
     */
    private void toName() {
        DbName name = new DbName();
        this.name = name.getName(this.gender);
    }
    
    /**
     * Define o nome do personagem.
     * invoca o método getLastName() de DbName.
     * Espera o retorno da String da classe de nomes;
     */
    private void toLastName() {
        DbName lastName = new DbName();
        this.lastName = lastName.getLastName();
    }
    
    /**
     * Adiciona atributos fisicos ao personagem.
     */
    private void addPhysicalAttribute() {
        for (int i = 0; i < Physical.SIZE;i++) {
            Physical physical = new Physical(i);
            this.physical.add(physical);
        }
    }
    
    /**
     * Adiciona atributos social ao personagem..
     */
    public void addSocialAttribute() {
        for (int i = 0; i < Social.SIZE;i++) {
            Social social = new Social(i);
            this.social.add(social);
        }
    }
    
    /**
     * Adiciona atributos mental ao personagem..
     */
    private void addMentalAttribute() {
        for (int i = 0; i < Mental.SIZE;i++) {
            Mental mental = new Mental(i);
            this.mental.add(mental);
        }
    }
    
    /**
     * adiciona habilidades talento ao personagem
     */
    private void addTalentSkill() {
        for (int i = 0; i < Talent.SIZE;i++) {
            Talent talent = new Talent(i);
            this.talent.add(talent);
        }
    }
    
    /**
     * adiciona habilidades perícia ao personagem
     */
    private void addExpertiseSkill() {
        for (int i = 0; i < Expertise.SIZE;i++) {
            Expertise expertise = new Expertise(i);
            this.expertise.add(expertise);
        }
    }
    
    /**
     * adiciona habilidades conhecimento ao personagem
     */
    private void addKnowledgeSkill() {
        for (int i = 0; i < Knowledge.SIZE;i++) {
            Knowledge knowledge = new Knowledge(i);
            this.knowledge.add(knowledge);
        }
    }
}