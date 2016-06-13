import java.util.Random;

/**
 * 
 */
public class Knight extends Person{

    private final String ATTRIBUTE_PRIMARY = "physical";
    private final String ATTRIBUTE_SEGUNDARY = "mental";
    private final String ATTRIBUTE_TERTIARY = "social";
    private final String SKILL_PRIMARY = "expertise";
    private final String SKILL_SEGUNDARY = "knowledge";
    private final String SKILL_TERTIARY = "talent";
    
    private int willPower;
    private String concept;
    
    /**
     * Construtor.
     */
    public Knight() {
        /*vai inicializar o construtor da classe super
         * definindo o nome e genero.
         */
        super();
        
        //define conceito
        toConcept();
        
        //define os atributos.
        toPrimaryAttrPonts();
        toSegundaryAttrPonts();
        toTertiaryAttrPonts();
        
        //define as habilidades.
        toPrimarySkillPonts();
        toSegundarySkillPonts();
        toTertiarySkillPonts();
        
        //define os pontos bonus.
        addPointsBonus();
    }
    
    /**
     * Retornar os pontos de vontades.
     */
    public int getWillPower() {
        return this.willPower;
    }

    /**
     * retornar o conceito do personagem
     */
    public String getConcept() {
        return this.concept;
    }

    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {
        Random rand = new Random();
        
        int i = rand.nextInt(4);
        
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "Escudeiro";
                else
                  this.concept = "Escudeira";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Cavaleiro Errante";
                else
                  this.concept = "Cavaleira Errante";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = "Cortesão";
                else
                  this.concept = "Cortesã";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Cavaleiro nobre";
                else
                  this.concept = "Cavaleira nobre";
                break;
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * Conceitos de cavaleiros recebem como primária os atributos físicos.
     */
    private void toPrimaryAttrPonts() {      
        int limit = 0;
        int aux = 0;
        
        //cria adiciona os objetos atributos físicos na lista.
        for (int i = 0; i < Attribute.size(ATTRIBUTE_PRIMARY);i++) {
            Attribute attribute = new Attribute(i, ATTRIBUTE_PRIMARY);
            this.attrPhysical.add(attribute);
        }
                
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          limit = 7;
        else
          limit = 6;
         
        /*
         * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
         * 0 = força;
         * 1 = dextreza;
         * 2 = vigor;
         */
        boolean isValid;
        for (int i = 0; i < limit; i++) {
            //condição para não estourar pontos.
            do {
                aux = randomPoints(limit);
                
                //Condição para não estourar o valor máximo de 5.
                if ( aux > 5 ) { 
                  isValid = false;
                }
                else {
                  this.attrPhysical.get(i).addValue(aux, ATTRIBUTE_PRIMARY);
                  limit = limit - aux; //subtrai os pontos acrescido anteriormente
                  isValid = true;
                }
            }while (isValid == false);
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Conceitos de cavaleiros recebem como segundários os atributos mentais.
     */
    private void toSegundaryAttrPonts() {
        int limit = 0;
        int aux = 0;
        
        //cria adiciona os objetos atributos mentais na lista.
        for (int i = 0; i < Attribute.size(ATTRIBUTE_SEGUNDARY);i++) {
            Attribute attribute = new Attribute(i, ATTRIBUTE_SEGUNDARY);
            this.attrMental.add(attribute);
        }
        
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          limit = 5;
        else
          limit = 4;
         
        /*
         * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
         * 0 = Percepção;
         * 1 = Inteligência;
         * 2 = Raciocínio;
         */
        boolean isValid;
        for (int i = 0; i < limit; i++) {
            //condição para não estourar pontos.
            aux = randomPoints(limit); 
            do {
                //Condição para não estourar o valor máximo de 5.
                if (aux > 5) {
                  isValid = false;
                }
                else {      
                  this.attrMental.get(i).addValue(aux, ATTRIBUTE_SEGUNDARY);
                  limit = limit - aux; //subtrai os pontos acrescido anteriormente
                  isValid = true;
                }
            }while( isValid == false);
         }
    }

    /**
     * Define a distribuição dos pontos dos atributos tercearia do personagem.
     * Conceitos de cavaleiros recebem como primária os atributos Sociais.
     */
    private void toTertiaryAttrPonts() {
        int limit = 3;
        int aux = 0;
        
        //cria adiciona os objetos atributos social na lista.
        for (int i = 0; i < Attribute.size(ATTRIBUTE_TERTIARY);i++) {
            Attribute attribute = new Attribute(i, ATTRIBUTE_TERTIARY);
            this.attrSocial.add(attribute);
        }
        
        /*
         * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
         * 0 = Carisma;
         * 1 = Manipulação;
         * 2 = Aparência;
         */
        for (int i = 0; i < limit; i++) {
            aux = randomPoints(limit);        
            this.attrSocial.get(i).addValue(aux, ATTRIBUTE_TERTIARY);
            limit = limit - aux; //subtrai os pontos acrescido anteriormente
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades dos Cavaleiros, num máximo de 3 níveis.
     * Cavalerios tem como habilidade principal perícia, entretanto eles tende a ter mais afinidade com:
     *  Cavalgar;
     *  Empatia com animais;
     *  Armas brancas e;
     *  Sobrevivência.  
     */
    private void toPrimarySkillPonts() {
        int limit;
        int aux;
        
        if ( this.lineage == 's' )
          limit = 13;
        else
          limit = 11;
          
        //cria adiciona os objetos habilidades perícias na lista.
        for (int i = 0; i < Skill.size(SKILL_PRIMARY);i++) {
            Skill skill = new Skill(i, SKILL_PRIMARY);
            this.skillExpertise.add(skill);
        }
          
        //Habilidade Empatia com animais.
        aux = 1 + randomPoints(3);
        this.skillExpertise.get(0).addValue(aux, SKILL_PRIMARY);
        limit = limit - aux;
        
        //Habilidde Armas Brancas.
        aux = 1 + randomPoints(3);
        this.skillExpertise.get(5).addValue(aux, SKILL_PRIMARY);
        limit = limit - aux;
        
        //Habilidade Cavalgar.
        aux = 1 + randomPoints(3);
        this.skillExpertise.get(7).addValue(aux, SKILL_PRIMARY);
        limit = limit - aux;
        
        /*
         * Loop vai verificar se os pontos que serão adicionar são os das afinidades
         * caso forem, vai verficar a quantidade de pontos para adicionar, lembrando que não pode passar de 3.
         * Loop finaliza quando a quantidade de pontos acabarem.
         * 0 = Empatia com animais;
         * 1 = Arqueirismo;
         * 2 = Artesanato;
         * 3 = Etiqueta;
         * 4 = Herborismo;
         * 5 = Armas branca;
         * 6 = Música;
         * 7 = Cavalgar;
         * 8 = Furtividade e;
         * 9 = Sobrevivência.
         */
        boolean isValid;
        for (int i = 0; i < limit; i++) {
            if (i == 0 || i == 5 || i == 7 ) {                           
              if ( this.skillExpertise.get(i).getValue(SKILL_PRIMARY) < 3 )     
                if ( this.skillExpertise.get(i).getValue(SKILL_PRIMARY) == 2 ){
                  this.skillExpertise.get(i).addValue(1, SKILL_PRIMARY);
                  limit -= 1;
                }
                else {
                  this.skillExpertise.get(i).addValue(2, SKILL_PRIMARY);
                  limit -= 2;
                }
            }
            else {
              do {

                  aux = randomPoints(limit);
                  //condição para não estourar o limite de 3
                  if ( aux > 3 )
                    isValid = false;
                  else {
                    this.skillExpertise.get(i).addValue(aux, SKILL_PRIMARY);
                    limit = limit - aux;
                    isValid = true;
                  }
              }while ( isValid == false );
            }
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades dos Cavaleiros, num máximo de 3 níveis.
     * Cavalerios tem como habilidade secundária Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Polícia;
     *  Direito e;
     *  Senescália; 
     */
    private void toSegundarySkillPonts() {
        int limit;
        int aux;
        
        if ( this.lineage == 's' )
          limit = 9;
        else
          limit = 7;
          
        //cria adiciona os objetos habilidades Conhecimento na lista.
        for (int i = 0; i < Skill.size(SKILL_SEGUNDARY);i++) {
            Skill skill = new Skill(i, SKILL_SEGUNDARY);
            this.skillKnowledge.add(skill);
        }
          
        //Habilidade Direito
        aux = 1 + randomPoints(2);
        this.skillKnowledge.get(3).addValue(aux, SKILL_SEGUNDARY);
        limit = limit - aux;
        
        //Habilidde Polícia.
        aux = 1 + randomPoints(2);
        this.skillKnowledge.get(7).addValue(aux, SKILL_SEGUNDARY);
        limit = limit - aux;
        
        //Habilidade Senescália.
        aux = 1 + randomPoints(2);
        this.skillKnowledge.get(9).addValue(aux, SKILL_SEGUNDARY);
        limit = limit - aux;
        
        /*
         * Loop vai verificar se os pontos que serão adicionar são os das afinidades
         * caso forem, vai verficar a quantidade de pontos para adicionar, lembrando que não pode passar de 3.
         * 0 = Instrução;
         * 1 = Sabedoria popular;
         * 2 = Investigação;
         * 3 = Direito;
         * 4 = Linguística;
         * 5 = Medicina;
         * 6 = Ocultismo;
         * 7 = Polícia;
         * 8 = Ciência e;
         * 9 = Senescália.
         */
        boolean isValid;
        for (int i = 1; i < limit; i++) {
            if ( i == 3 || i == 7  ||i == 9 ) {                           
              if ( this.skillKnowledge.get(i).getValue(SKILL_SEGUNDARY) <= 2 )     
                if ( this.skillKnowledge.get(i).getValue(SKILL_SEGUNDARY) == 2 ){
                  this.skillKnowledge.get(i).addValue(1, SKILL_SEGUNDARY);
                  limit -= 1;
                }
                else {
                  this.skillKnowledge.get(i).addValue(2, SKILL_SEGUNDARY);
                  limit -= 2;
                }
              }
            else {
                do {
                    aux = randomPoints(limit);
                    if ( aux > 3 )
                      isValid = false;
                    else {
                      this.skillKnowledge.get(i).addValue(aux, SKILL_SEGUNDARY);
                      limit = limit - aux; 
                      isValid = true;
                    }
                }while ( isValid == false );
            }
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades dos Cavaleiros, num máximo de 3 níveis.
     */
    private void toTertiarySkillPonts() {
        int limit;
        int aux;
        
        if ( this.lineage == 's' )
          limit = 9;
        else
          limit = 7;
          
        //cria adiciona os objetos habilidades talento na lista.
        for (int i = 0; i < Skill.size(SKILL_TERTIARY);i++) {
            Skill skill = new Skill(i, SKILL_TERTIARY);
            this.skillTalent.add(skill);
        }
        
        /*
         * Adiciona os valores dos habilidades Talentos finaliza o for quando os pontos acabarem.
         * 0 = Representação;
         * 1 = Prontidão;
         * 2 = Esportes;
         * 3 = Briga;
         * 4 = Esquiva;
         * 5 = Empatia;
         * 6 = Intimidação;
         * 7 = Crime;
         * 8 = Liderança e;
         * 9 = Lábia.
         */
        boolean  isValid;
        for (int i = 0; i < limit; i++) {
            //Condição para não estourar limite de 3
            do {
                aux = randomPoints(3);
                if ( aux > 3 )
                  isValid = false;
                else {
                  this.skillTalent.get(i).addValue(aux, SKILL_TERTIARY);
                  limit = limit - aux;
                  isValid = true;
                }
            }while ( isValid == false);
        }
    }

    /**
     * Distribue os pontos bonus.
     */
    private void addPointsBonus() {
        
    }
    
    /**
     * Método que retorna um valor inteiro aleatório
     */
    private int randomPoints(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }    
}
