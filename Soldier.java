/**
 * Classe responsável pela definição dos pontos de atributos e habilidades dos Soldado.
 * Soldados tem como atributos princípal físicos, mentais e socias, são respectivamente secundários e terceários.
 * Suas habilidades são perícias, talentos e conhecimento.
 * Mercenarios e assassinos recebem 2 pontos de armas brancas e 3 pontos de furtividade inicialmente.
 * 
 * @author (Matheus Mazepa e Vinicius Cavalcanti) 
 * @version (19.06.2016)
 */ 

public class Soldier extends Person {
   
    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * baseados nas regrados dos conceitos.
     */
    public Soldier() {
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
        while( points != 0 ){
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
         while( points != 0 ){

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
        while( points != 0 ){
            if ( this.social.get(randomNumber(this.social.size())).addPoints() ) {
               points--;
            }
        }
        
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades princípal dos Solados, num máximo de 3 níveis.
     * Respeitando a regra para cada conceito.
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
         * baseado no conceito do soldado.
         */
        if( this.concept.equals("Mercenário") || this.concept.equals("Mercenária")
                || this.concept.equals("Assassino") || this.concept.equals("Assassino") ) {
             for(int i = 0; i < 2; i++ )
              if ( this.expertise.get(5).addPoints() ) 
                points--;
             
             for(int i = 0; i < 3; i++ )
              if ( this.expertise.get(8).addPoints() ) 
                points--;
        }
        else
          for(int i = 0; i < 3; i++ )
              if ( this.expertise.get(5).addPoints() ) 
                points--;
        
        /*
         * Adiciona os valores dos Skill finaliza o while
         * quando os pontos acabarem.
         */
        while( points != 0 ){
            aux = randomNumber(this.expertise.size());
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() ) 
                 points--;
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades secundária dos Solados, num máximo de 3 níveis.
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
         * Adicona pontos inicial em briga, intimidação e liderança.
         */
        if ( this.talent.get(3).addPoints() )
          points--;
          
        if ( this.talent.get(6).addPoints() )
          points--;
          
        if ( this.talent.get(8).addPoints() )
          points--;
        
        /*
         * Adiciona os valores dos Skill finaliza o while
         * quando os pontos acabarem.
         */
        while( points != 0 ){
            aux = randomNumber(this.talent.size());
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) {
                 points--;
              }
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
        int i = randomNumber(4);
        
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "Homem de armas";
                else
                  this.concept = "Mulher de armas";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Mercenário";
                else
                  this.concept = "Mercenária";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = "Veterano de guerra";
                else
                  this.concept = "Veterana de guerra";
                break;
            case 3:
                this.concept = "Guarda";
                break;
            case 4:
                if ( this.gender == 'm' )
                  this.concept = "Assassino";
                else
                  this.concept = "Assassina";
                break;
        }
    }
}
