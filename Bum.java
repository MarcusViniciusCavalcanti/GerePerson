/**
 * Classe responsáve pelos conceitos Ordinário.
 * Recebe como atributos social, físico e mental como 
 * primário, secundário e terceŕio respectivamente.
 * Suas habilidades são compostas por: primárias talentos,
 * porém recebe um ponto em briga, intimidação e lábia.
 * Secundárias perícia e recebe um ponto inicialmente em 
 * armas brancas e furtividade.
 * Suas terceira catergoria de habilidade são conhecimento. 
 * Inicializando a distribuição com 1 ponto em sabedoria popular 
 * e ocultismo.
 */ 

public class Bum extends Person {
   
    /**
     * Construtor:
     * Inicializa os atributos e métodos da super classe Person
     * Invoca os métodos para distribuição de pontos do personagem.
     */
    public Bum() {
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
     * Ordinários recebem como primária atributos sociais.
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
         */
        while( points > 0 ){
            if ( this.social.get(randomNumber(this.social.size())).addPoints() ) {
               points--;
            }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * Ordinários recebem como secundários atributos físicos.
     */
    public void toSegundaryAttributePoints() {
        int points;
        
        //define quantidade de pontuação baseando na linhagem.
        if( this.lineage == 's' )
          points = 5;
        else
          points = 4;
          
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         */
        while( points > 0 ){
            if ( this.physical.get(randomNumber(this.physical.size())).addPoints() ) {
               points--;
            }
        }
    }
    
    /**
     * Define a distribuição dos pontos dos atributos primária do personagem.
     * Ordinários recebem como secundários atributos mentais.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
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
     * Define a distribuição dos pontos das Habilidades dos Cavaleiros, num máximo de 3 níveis.
     * Cavalerios tem como habilidade principal perícia, entretanto eles tende a ter mais afinidade com:
     *  Cavalgar;
     *  Empatia com animais;
     *  Armas brancas e;
     *  Sobrevivência.  
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
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */
        if ( this.talent.get(3).addPoints() ) 
          points--;
        
        if ( this.talent.get(7).addPoints() ) 
          points--;
        
        if ( this.talent.get(9).addPoints() ) 
          points--;
        
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         */
        while( points > 0 ){
            aux = randomNumber(this.talent.size());
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) {
                 points--;
              }
        }
    }

    public void toSegundarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 9;
        else
          points = 7;
          
        /*
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */
        if ( this.expertise.get(1).addPoints() ) 
          points--;
        
        if ( this.expertise.get(8).addPoints() ) 
          points--;
         
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         */
        while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() ) {
                 points--;
              }
        }
    }

    public void toTertiarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 5;
        else
          points = 4;
                  
        /*
         * Adiciona os valores dos atributos finaliza 
         * o loop quando os pontos acabarem.
         */       
        if ( this.expertise.get(1).addPoints() ) 
          points--;
        
        if ( this.expertise.get(6).addPoints() ) 
          points--;
        
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
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
        int i = randomNumber(8);
        
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "Bêbado";
                else
                  this.concept = "Bêbada";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Garoto de programa";
                else
                  this.concept = "Prostituta";
                break;
            case 2:
                this.concept = "agiota,";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Jogador viajante";
                else
                  this.concept = "Jogadora viajante";
                break;
            case 4:
                if ( this.gender == 'm' )
                  this.concept = "Briguenta";
                else
                  this.concept = "Briguenta";
                  break;
            case 5:
                if ( this.gender == 'm' )
                  this.concept = "Clérigo excumungado";
                else 
                  this.concept = "Freira excumungada";
                break;
            case 6:
                if ( this.gender == 'm' )
                  this.concept = "Judeu";
                else 
                  this.concept = "Judia";
                break;  
            case 7:
                this.concept = "Nobre deserdado";
                break;      
        }
    }
}
