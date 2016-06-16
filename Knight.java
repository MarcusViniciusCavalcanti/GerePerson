/**
 * Classe Cavaleiro:
 */ 

public class Knight extends Person {
    private String concept;
    

    public Knight() {
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
    }

    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * Conceitos de cavaleiros recebem como primária atributos físicos.
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
        while( points == 0 ){
            if ( this.physical.get(randomNumber(Physical.SIZE)).addPoints() ) {
               points--;
            }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Conceitos de cavaleiros recebem como segundários atributos mentais.
     */
    public void toSegundaryAttributePoints() {
        int points;
        
        /*
         * Define a quantidade de pontos baseados na linhagem
         * Sobrenatural: 7
         * Mortal: 6
         */
        if( this.lineage == 's' )
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
        while( points == 0 ){
            if ( this.mental.get(randomNumber(Social.SIZE)).addPoints() ) {
               points--;
            }
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Conceitos de cavaleiros recebem como terceários atributos Sociais.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         * 
         * 0 = carisma.
         * 1 = manipulação.
         * 2 = aparencia.
         */
        while( points == 0 ){
            if ( this.social.get(randomNumber(Mental.SIZE)).addPoints() ) {
               points--;
            }
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
    public void toPrimarySkillPoints() {
        
    }

    public void toSegundarySkillPoints() {
    
    }

    public void toTertiarySkillPoints() {

    }
       
    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {      
        int i = randomNumber(4);
        
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
}
