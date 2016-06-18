/**
 * Classe responsável pelos conceitos Mercador.
 * Seus atributos princípal são as da categoria fisicos, secundários mentais
 * terceários sociais
 * As Habilidades estão dividas em primários perícias.
 * Treiandores de animais recebem 2 pontos em empatia com animais inicialmente,
 * os demais 1 ponto em empatia com animais, artesanato e harborismo.
 * Por ultimo suas habilidades terceárias conhecimentos recebendo 
 * inicialmente 1 ponto em sabedoria popular e medicina.
 */ 

public class Merchant extends Person {
    
    /**
     * Construtor:
     * Inicializa os atributos e métodos da super classe Person
     * Invoca os métodos para distribuição de pontos do personagem.
     */
    public Merchant() {
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
     * Conceitos de Mercadores recebem como primária atributos físicos.
     */
    public void toPrimaryAttributePoints() {
        int points = 0;

        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 7;
        else
          points = 6;
                  
        /*
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */
        while( points > 0 ){
            if ( this.physical.get(randomNumber(this.physical.size())).addPoints() ) {
               points--;
            }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Conceitos de Mercadores recebem como segundários atributos mentais.
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
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */
        while( points > 0 ){
            if ( this.mental.get(randomNumber(this.mental.size())).addPoints() ) {
               points--;
            }
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Conceitos de Mercadores recebem como terceários atributos Sociais.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        /*
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */
        while( points > 0 ){
            if ( this.social.get(randomNumber(this.social.size())).addPoints() ) {
               points--;
            }
        }
        
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades primárias dos Mercadores, num máximo de 3 níveis.
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
         * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
         * não adiciona pontos as habilidades as quais não tem como caracteristicas
         */
        if ( this.concept.equals("Treinador de animais") ) {
           for (int i = 0; i < 2;i++ )       
               if ( this.expertise.get(0).addPoints() )
                 points--;
        }
        else {
            if ( this.expertise.get(0).addPoints() )
              points--;
            
            if ( this.expertise.get(2).addPoints() )
              points--;
            
            if ( this.expertise.get(5).addPoints() )
              points--;
        }
        
        /*
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */  
        while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() ) {
                 points--;
              }
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades secundárias dos Mercadores, num máximo de 3 níveis.
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
         * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
         * não adiciona pontos as habilidades as quais não tem como caracteristicas
         */
        if ( this.talent.get(3).addPoints() )
          points--;
          
        if ( this.talent.get(6).addPoints() )
          points--;
        
        if ( this.talent.get(8).addPoints() )
          points--;
        
        /*
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */
        while( points > 0 ){
            aux = randomNumber(this.talent.size());
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) {
                 points--;
              }
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades terceárias dos Mercadores, num máximo de 3 níveis.
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
         * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
         * não adiciona pontos as habilidades as quais não tem como caracteristicas
         */ 
        if ( this.knowledge.get(1).addPoints() )
          points--;
        
        if ( this.knowledge.get(6).addPoints() )
          points--;
        
        /*
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
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
                  this.concept = "Bardo";
                else
                  this.concept = "Trovadora";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Estalajadeira";
                else
                  this.concept = "Estalajadeira";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = "Vendedor ambulante";
                else
                  this.concept = "Vendedora ambulante";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Treinador de animais";
                else
                  this.concept = "Treinadora de animais";
                break;
        }
    }
}
