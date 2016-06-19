import java.util.Random;
import java.util.ArrayList;
/**
 * Super classe Personagem, define nome, gênero, linhagem e idade de forma aleatória
 * para as demais classes. 
 * Além de definir a coleção de atributos e de habilidades.
 */ 

public class Person {
    protected char lineage;
    protected char gender;
    protected String name;
    protected String lastName;
    protected String concept;
    protected int age;
    protected int willPower;
    protected ArrayList<Physical> physical;
    protected ArrayList<Social> social;
    protected ArrayList<Mental> mental;
    protected ArrayList<Talent> talent;
    protected ArrayList<Expertise> expertise;
    protected ArrayList<Knowledge> knowledge;
    
    protected final int NUMBER_OF_SKILL_LIST = 3;
    protected final int NUMBER_OF_ATTRIBUTE_LIST = 3;

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
        toLastName();  //define o sobrenome
        
        /*
         * Pontos de força de vontade já inicaliza com -- pontos
         * Inicializado no construror com o método toWillPower()
         * esperando como parâmetro um valor int.
         */
        this.willPower = 3;
        
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
    
    public String getConcept() {
        return this.concept;
    }
    
    public String getPhysical(int asAttribute) {
        String info = "";
        info = toBall(this.physical.get(asAttribute).getValue());
        return info;
    }
    
    public String getSocial(int asAttribute) {
        String info = "";
        info = toBall(this.social.get(asAttribute).getValue());
        return info;
    }
    
    public String getMental(int asAttribute) {
        String info = "";
        info = toBall(this.mental.get(asAttribute).getValue());
        return info;
    }
    
    public String getTalent(int asSkill) {
        String info = "";
        info = toBall(this.talent.get(asSkill).getValue());
        return info;
    }
    
    public String getExpertise(int asSkill) {
        String info = "";
        info = toBall(this.expertise.get(asSkill).getValue());
        return info;
    }
    
    public String getKnowledge(int asSkill) {
        String info = "";
        info = toBall(this.knowledge.get(asSkill).getValue());
        return info;
    }
    
    public String getWillPower() {
        String info = "";
        
        //adiciona as bolas
       for (int i = 0; i < this.willPower; i++) {
          info+= "o";
       }
      
       /*
        * A quantidade de traços (hífens) será a diferença da adição de pontos menos o resto de pontos. 
        */
       for (int i = 0; i < (10 - this.willPower); i++) {
          info+= "-"; 
       }
        
        return info;
    }
    
    /**
     * Método que retonar um valor aleatório.
     */
    public int randomNumber(int value) {
        Random random = new Random();
        return random.nextInt(value);
    }
    
    /**
     * Distribute os pontos bonus
     */
    public void toPointsBonus() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 21;
        else
          points = 15;
          
        while ( points > 0 ) {  
            aux = randomNumber(3);
            
            switch (aux) {
                case 0 :
                    aux = randomNumber(this.NUMBER_OF_SKILL_LIST);
                    if ( points > 2) {
                        if ( aux == 0 ) {
                            aux = randomNumber(Expertise.SIZE);
                            if ( this.expertise.get(aux).addPoints() ) {
                                points -= 2;
                            }
                        }
                        else {
                            if ( aux == 1 ) {
                                aux = randomNumber(Talent.SIZE);
                                if ( this.talent.get(aux).addPoints() ) {
                                    points -= 2;
                                }   
                            }
                            else {              
                                aux = randomNumber(Knowledge.SIZE);
                                if ( this.knowledge.get(aux).addPoints() ) {
                                    points -= 2;
                                }
                            }
                        }
                    }
                    else {
                        this.willPower++;
                        points--;
                    }
                    break;
                case 1 :
                    aux = randomNumber(this.NUMBER_OF_ATTRIBUTE_LIST);
                    if (points > 5 ){
                        if ( aux == 0 ) {
                            aux = randomNumber(Physical.SIZE);
                            if ( this.physical.get(aux).addPoints() ) {
                                points -= 5;
                            }
                        }
                        else {
                            if ( aux == 1 ) {
                                aux = randomNumber(Social.SIZE);
                                if ( this.social.get(aux).addPoints() ) {
                                    points -= 5;
                                }
                            }
                            else {
                                aux = randomNumber(Mental.SIZE);
                                if ( this.mental.get(aux).addPoints() ) {
                                    points -= 5;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    this.willPower++;
                    points--;
                    break;
            }
        }
    }
       
    /**
     * Espera um valor int para se transforar em uma String em "ooo--"
     * retorna esta String.
     */
    private String toBall(int n) {
       String ball = ""; 
       
       //adiciona as bolas
       for (int i = 0; i < n; i++) {
          ball+= "o";
       }
      
       /*
        * A quantidade de traços (hífens) será a diferença da adição de pontos menos o resto de pontos. 
        */
       for (int i = 0; i < (5 - n); i++) {
          ball+= "-"; 
       }
      
       return ball;
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
            aux = randomNumber(40);
            
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
