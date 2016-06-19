import java.util.Random;
import java.util.ArrayList;
/**
 * classe Person com o toString 
 * se curtir a ideia so passar o metodo para a person se nao curtir sla
 */ 

public class PersonToString {
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
     */
    public PersonToString() {
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
     * @return: Linhagem do personagem M para mortal, S para sobrenatural
     */
    public char getLineage() {
        return this.lineage;
    }

    /**
     * @return: gênero do personagem M masculino, F feminino.
     */
    public char getGender() {
        return this.gender;
    }

    /**
     * @return: idade do personagem.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * @return  primeiro nome.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return: sobrenome.
     */
    public String getLastName() {
        return this.lastName;
    }
    
    /**
     * @return: conceito do personagem 
     */
    public String getConcept() {
        return this.concept;
    }
    
    /**
     * Método que retonar o valor dos pontos dos atributos em string.
     * Return: valor do atributo de categoria físico já formatado (ooo--) do personagem.
     * @param: índice do atributo.
     * 0 = força;
     * 1 = destreza;
     * 2 = vigor.
     */
    public String getPhysical(int asAttribute) {
        String info = "";
        info = formatPoints(this.physical.get(asAttribute).getValue());
        return info;
    }
    
    /**
     * Método que retonar o valor dos pontos dos atributos em string.
     * Return: valor do atributo de categoria social já formatado (ooo--) do personagem.
     * @param: índice do atributo.
     * 0 = carisma;
     * 1 = manipulação;
     * 2 = Aparência.
     */
    public String getSocial(int asAttribute) {
        String info = "";
        info = formatPoints(this.social.get(asAttribute).getValue());
        return info;
    }
    
    /**
     * Método que retonar o valor dos pontos dos atributos em string.
     * Return: valor do atributo de categoria mental já formatado (ooo--) do personagem.
     * @param: índice do atributo.
     * 0 = percepção;
     * 1 = inteligência;
     * 2 = raciocínio.
     */
    public String getMental(int asAttribute) {
        String info = "";
        info = formatPoints(this.mental.get(asAttribute).getValue());
        return info;
    }
    
    /**
     * Método que retonar o valor dos pontos dos habilidades em string.
     * Return: valor das habiliades de categoria talento já formatado (ooo--) do personagem.
     * @param: qual habilidade deseja ver o valor.
     * 0 = "Representação";
     * 1 = "Prontidão";
     * 2 = "Esportes"; 
     * 3 = "Briga";
     * 4 = "Esquiva"; 
     * 5 = "Empatia",
     * 6 = "Intimidação";
     * 7 = "Crime";
     * 8 = "Liderança"; 
     * 9 = "Lábia".
     */
    public String getTalent(int asSkill) {
        String info = "";
        info = formatPoints(this.talent.get(asSkill).getValue());
        return info;
    }
    
    /**
     * Método que retonar o valor dos pontos dos habilidades em string.
     * Return: valor das habiliades de categoria perícias já formatado (ooo--) do personagem.
     * @param: qual habilidade deseja ver o valor.
     * 0 = "Empatia com animais";
     * 1 = "Arqueirismo";
     * 2 = "Artesanato"; 
     * 3 = "Etiqueta";
     * 4 = "Herborismo"; 
     * 5 = "Armas brancas",
     * 6 = "Música";
     * 7 = "Cavalgar";
     * 8 = "Furtividade"; 
     * 9 = "Sobrevivência".
     */
    public String getExpertise(int asSkill) {
        String info = "";
        info = formatPoints(this.expertise.get(asSkill).getValue());
        return info;
    }
    
    /**
     * Método que retonar o valor dos pontos dos habilidades em string.
     * Return: valor das habiliades de categoria perícias já formatado (ooo--) do personagem.
     * @param: qual habilidade deseja ver o valor.
     * 0 = "Instrução";
     * 1 = "Sabedoria popular";
     * 2 = "Investigação"; 
     * 3 = "Direito";
     * 4 = "Linguística; 
     * 5 = "Medicina",
     * 6 = "Ocultismo";
     * 7 = "Polícia;
     * 8 = "Ciência" e; 
     * 9 = "Senescália".
     */
    public String getKnowledge(int asSkill) {
        String info = "";
        info = formatPoints(this.knowledge.get(asSkill).getValue());
        return info;
    }
    
    /**
     * Método que retonar o valor de pontos em força de vontade
     * Return: valor dos pontos já formatado (ooo--) do personagem.
     */
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
     * Define a quantidade dos pontos de força de vontade.
     * @param value: valor inteiro que ajusta o valor.
     */
    public void setWillPower(int value) {
        this.willPower = value;
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
     * Espera um valor int para se transforar em uma String no formatod ("ooo--")
     * @param: valor dos pontos.
     * @return: valor dos pontos já formatados.
     * 
     */
    private String formatPoints(int n) {
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
    
    public String toString() {
        String content = "\n\n" + "nome: " + this.name + " " + this.lastName + "\t\t" + "Conceito: "+ this.concept + "\t\t" + "Idade: " + this.age + "\n\n" +
                            "                                   ----------- A T R I B U T O S -----------\n\n" + 
                            "     Físicos   \t\t\tSociais \t\t\t     Mentais\n" + 
                            "   Força: " + getPhysical(0) + "\t\t" + "    Carisma: " + getSocial(0) + "\t\t      " + "   Percepção: " + getMental(0) + "\n" +
                            "Destreza: " + getPhysical(1) + "\t\t" + "Manipulação: " + getSocial(1) + "\t\t      " + "Inteligência: " + getMental(1) + "\n" +
                            "   Vigor: " + getPhysical(2) + "\t\t" + "  Aparência: " + getSocial(2) + "\t\t      " + "  Raciocínio: " + getMental(2) + "\n" +
                            "\n\n                                 ----------- H A B I L I D A D E S -----------\n\n" +
                            "     Talentos    \t\t\t Perícias \t\t\t      Conhecimentos\n" +
                            "Representação: " + getTalent(0) + "\t\t" + "Empatia com animais: " + getExpertise(0) + "\t\t" + "        Instrução: " + getKnowledge(0) + "\n" +
                            "    Prontidão: " + getTalent(1) + "\t\t" + "        Arqueirismo: " + getExpertise(1) + "\t\t" + "Sabedoria popular: " + getKnowledge(1) + "\n" +
                            "     Esportes: " + getTalent(2) + "\t\t" + "         Artesanato: " + getExpertise(2) + "\t\t" + "     Investigação: " + getKnowledge(2) + "\n" +
                            "        Briga: " + getTalent(3) + "\t\t" + "           Etiqueta: " + getExpertise(3) + "\t\t" + "          Direito: " + getKnowledge(3) + "\n" +
                            "      Esquiva: " + getTalent(4) + "\t\t" + "         Herborismo: " + getExpertise(4) + "\t\t" + "      Linguística: " + getKnowledge(4) + "\n" +
                            "      Empatia: " + getTalent(5) + "\t\t" + "      Armas brancas: " + getExpertise(5) + "\t\t" + "         Medicina: " + getKnowledge(5) + "\n" +  
                            "  Intimidação: " + getTalent(6) + "\t\t" + "             Música: " + getExpertise(6) + "\t\t" + "        Ocultismo: " + getKnowledge(6) + "\n" +
                            "        Crime: " + getTalent(7) + "\t\t" + "           Cavalgar: " + getExpertise(7) + "\t\t" + "          Polícia: " + getKnowledge(7) + "\n" +
                            "    Liderança: " + getTalent(8) + "\t\t" + "        Furtividade: " + getExpertise(8) + "\t\t" + "          Ciência: " + getKnowledge(8) + "\n" +
                            "        Lábia: " + getTalent(9) + "\t\t" + "      Sobrevivência: " + getExpertise(9) + "\t\t" + "       Senescália: " + getKnowledge(9) + "\n" +      
                            "\n\t\t\t\t\tForça de Vontade:" + "\n" +
                            "\t\t\t\t\t    " + getWillPower() + "\n\n";
        return content;
    }
}
