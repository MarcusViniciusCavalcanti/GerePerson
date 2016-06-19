/**
 * Classe responsável pela definição dos pontos de atributos e habilidades do estrangeiro.
 * Estrangeitos tem como atributos princípal físicos, mentais e socias, são respectivamente secundários e terceários.
 * Suas habilidades são talentos, perícias e conhecimento.
 * Com exceção do conceito espião;
 * O qual tem suas habilidades em perícia, talentos e conhecimento.
 */ 

public class Foreign extends Person {
   
    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * baseados nas regrados dos conceitos.
     */
    public Foreign() {
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
     * Respeitando as regras de cada conceito
     */
    public void toPrimaryAttributePoints() {
        int points = 0;
        
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 7;
        else
          points = 6;
                  
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
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * Respeitando as regras de cada conceito
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
         */
         while( points > 0 ){

            if ( this.mental.get(randomNumber(this.mental.size())).addPoints() ) {
               points--;
            }
        }
    }
    
    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * Respeitando as regras de cada conceito
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         */
        while( points > 0 ){
            if ( this.social.get(randomNumber(this.social.size())).addPoints() ) {
               points--;
            }
        }
        
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades princípal dos estrangeiros, num máximo de 3 níveis.
     * Respeitando a regra para cada conceito.
     * Há exeção para espiões pois suas habilidades primarias são perícias.
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
         * adiciona os pontos de habilidades
         * baseado no conceito do Estrangeiro.
         */
        if( this.concept.equals("Bárbaro") || this.concept.equals("Bárbara") ) {
             for(int i = 0; i < 3; i++ )
                if ( this.talent.get(3).addPoints() ) 
                   points--;
                   
        }
        else if ( this.concept.equals("Espião") || this.concept.equals("Espiã") ) {
          for(int i = 0; i < 3; i++ )
              if ( this.expertise.get(8).addPoints() ) 
                points--;  
          
          if ( this.expertise.get(9).addPoints() ) 
                points--;        
                
          while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() ) 
                 points--;
          }  
   
        }
        /*
         * Adiciona os valores dos Skill finaliza o while
         * quando os pontos acabarem.
         */
        while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) 
                 points--;
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades secundária dos estrangeiros, num máximo de 3 níveis.
     * Respeitando a regra para cada conceito.
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
         * adiciona os pontos de habilidades
         * baseado no conceito do estranegeiro.
         */
        if ( this.concept.equals("Espião") || this.concept.equals("Espiã") ) {
          for(int i = 0; i < 2; i++ )
              if ( this.talent.get(4).addPoints() ) 
                points--;  
          
          if ( this.talent.get(9).addPoints() ) 
                points--;        
                
          while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) 
                 points--;
          }
   
        }
        /*
         * Adiciona os valores dos Skill finaliza o while
         * quando os pontos acabarem.
         */
        while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() ) 
                 points--;
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades terceária dos Solados, num máximo de 3 níveis.
     * Respeitando a regra para cada conceito.
     */
    public void toTertiarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 5;
        else
          points = 4;
        
        if ( this.knowledge.get(1).addPoints() ) {
           points--;
        }  
        /*
         * Adiciona os valores dos Skill finaliza o while 
         * quando os pontos acabarem.
         */
        while( points > 0 ){
            aux = randomNumber(this.knowledge.size());
            if ( this.knowledge.get(aux).getValue() < 3 )
              if ( this.knowledge.get(aux).addPoints() ) {
                 points--;
              }
        }
    }
    
    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {      
        int i = randomNumber(5);
        
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "Bárbaro";
                else
                  this.concept = "Bárbara";
                break;
            case 1:
                this.concept = "Oriental";
                break;
            case 2:
                this.concept = "Viajante";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Muçulmano";
                else
                  this.concept = "Mulher do islã";
                break;
            case 4:
                if ( this.gender == 'm' )
                  this.concept = "Espião";
                else
                  this.concept = "Espiã";
                break;
        }
    }
}
