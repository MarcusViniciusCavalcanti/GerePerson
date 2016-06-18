/**
 * Classe Ordinário:
 */ 

public class Bum extends Person {
   
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
         * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
         * o loop termina quando os pontos acabam.
         * 0 = carisma.
         * 1 = manipulação.
         * 2 = aparencia.
         */
        while( points > 0 ){
            if ( this.social.get(randomNumber(Social.SIZE)).addPoints() ) {
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
         * 0 = força;
         * 1 = dextreza;
         * 2 = vigor;
         */
        while( points > 0 ){
            if ( this.physical.get(randomNumber(Physical.SIZE)).addPoints() ) {
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
         * 
         * 0 = Percepção.
         * 1 = Inteligência.
         * 2 = Raciocínio.
         */
        while( points > 0 ){
            if ( this.mental.get(randomNumber(Mental.SIZE)).addPoints() ) {
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
        
        if ( this.talent.get(3).addPoints() ) 
          points--;
        
        if ( this.talent.get(7).addPoints() ) 
          points--;
        
        if ( this.talent.get(9).addPoints() ) 
          points--;
        
        while( points > 0 ){
            aux = randomNumber(Talent.SIZE);
            
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
        if ( this.expertise.get(5).addPoints() ) 
          points--;
        
        if ( this.expertise.get(8).addPoints() ) 
          points--;
                
        while( points > 0 ){
            aux = randomNumber(Expertise.SIZE);
            
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
        if ( this.expertise.get(1).addPoints() ) 
          points--;
        
        if ( this.expertise.get(6).addPoints() ) 
          points--;
        
        while( points > 0 ){
            aux = randomNumber(Knowledge.SIZE);
                    
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
        }
    }
}
