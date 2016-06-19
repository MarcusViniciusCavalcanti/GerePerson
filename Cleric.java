/**
 * Classe Ceric: Classe responsável pelo conceitos cléricos elencados me:
 *  Monge, leigo, estudante, sacerdote;
 *  Define os atributos primários como Mentais, segundários como sociais, terceários como físicos.
 *  Suas habilidades princípal consistem na categoria de conhecimento suas habilidades segundárias
 *  estão entra as das categoia talentos e suas habilidades terciárias são perícias.
 *  
 * @author (Matheus Mazepa e Vinicius Cavalcanti) 
 * @version (19.06.2016)
 */ 

public class Cleric extends Person {
    /**
     * Construtor:
     * Inicializa os atributos e métodos da super classe Person
     * Invoca os métodos para distribuição de pontos do personagem.
     */
    public Cleric() {
        super(); //inicializa o construtor da super classe.
        
        //define conceito
        toConcept();
        
        //define os atributos.
        toPrimaryAttributePoints();
        toSegundaryAttributePoints();
        toTertiaryAttributePoints();
        
        //define as habilidades.
        toPrimarySkillPoints();
        toSegundarySkillPoints();
        toTertiarySkillPoints();
        
        //define a distribuição dos pontos bônus.
        toPointsBonus();
    }

    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * Conceitos de clérigos recebem como primária atributos Sociais.
     */
    public void toPrimaryAttributePoints() {
        int points = 0;
        
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 7;
        else
          points = 6;
        
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         * 
         * 0 = carisma.
         * 1 = manipulação.
         * 2 = aparencia.
         */
        while( points > 0 ){
            if ( this.social.get(randomNumber(this.social.size())).addPoints() ) {
               points--;
            }
        }          
        
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Conceitos de clérigos recebem como atributos segundários mentais.
     */
    public void toSegundaryAttributePoints() {
        int points;
        
        /*
         * Define a quantidade de pontos baseados na linhagem
         * Sobrenatural: 7
         * Mortal: 6
         */
        if( this.lineage == 's' )
          points = 5;
        else
          points = 4;
          
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         * 
         * 0 = Percepção.
         * 1 = Inteligência.
         * 2 = Reciocínio.
         */
        while( points > 0 ){
            if ( this.mental.get(randomNumber(this.mental.size())).addPoints() ) {
               points--;
            }
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Conceitos de clérigos recebem como terceários atributos físicos.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        /*
         * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
         * 0 = força;
         * 1 = dextreza;
         * 2 = vigor;
         */
        while( points > 0 ){
            if ( this.physical.get(randomNumber(this.physical.size())).addPoints() ) {
               points--;
            }
        }
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos clérigos, num máximo de 3 níveis.
     * Clérigos tem como habilidade principal Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Instrução;
     *  Sabedoria popular e;
     *  Linguístiva.  
     */
    public void toPrimarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 13;
        else
          points = 11;
                  
        /*
         * Adiciona os valores dos Skill finaliza o for quando os pontos acabarem.
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
        for(int i = 0; i < this.knowledge.size(); i++) {
           if(i == 0 || i == 1 || i == 4) {
              if ( this.knowledge.get(i).addPoints() ) {
                 points--;
              }
           }
        }
        
        while( points > 0 ){
            aux = randomNumber(this.knowledge.size());
                    
            if ( this.knowledge.get(aux).getValue() < 3 )
              if ( this.knowledge.get(aux).addPoints() ) {
                 points--;
              }
        }          
    }

    /**
     * Define a distribuição dos pontos das Habilidades dos clérigos, num máximo de 3 níveis.
     * Clérigos tem como habilidade secundária Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Representação;
     *  Empatia e;
     *  Liderança.  
     */
    public void toSegundarySkillPoints() {
        int points = 0;
        int aux = 0;
        
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 9;
        else
          points = 7;
                  
        /*
         * Adiciona os valores dos Skill finaliza o for quando os pontos acabarem.
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
        for(int i = 0; i < this.talent.size(); i++) {
           if(i == 0 || i == 5 || i == 8) {
              if ( this.talent.get(i).addPoints() ) {
                 points--;
              }
           }
        }
        
        while( points > 0 ){
            aux = randomNumber(this.talent.size());
            
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) {
                 points--;
              }
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades dos clérigos, num máximo de 3 níveis.
     * Clérigos tem como habilidade terciária perícia, entretanto eles tende a ter mais afinidade com:
     *  Etiqueta
     */
    public void toTertiarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 5;
        else
          points = 4;
        
        /*
         * Adiciona os valores dos Skill finaliza o for quando os pontos acabarem.
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
        if ( this.expertise.get(3).addPoints() ) 
            points--;
         
        while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() ) {
                 points--;
              }
        }
    }
    
    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {      
        int i = randomNumber(4);
        
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "Monge";
                else
                  this.concept = "Monja";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Leigo";
                else
                  this.concept = "Leiga";
                break;
            case 2:
                this.concept = "Estudante";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Sacerdote";
                else
                  this.concept = "Sacerdotisa";
                break;
        }
    }
}
