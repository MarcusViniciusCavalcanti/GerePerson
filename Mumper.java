/**
 * Classe Cavaleiro:
 */ 

public class Mumper extends Person {
   
    public Mumper() {
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
     * Mendigos recebem como primária atributos Mentais.
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
         * 0 = Percepção.
         * 1 = Inteligência.
         * 2 = Raciocínio.
         */
        while( points != 0 ){
            if ( this.mental.get(randomNumber(Mental.SIZE)).addPoints() ) {
               points--;
            }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Mendigos recebem como segundários atributos mentais, entretanto atributos força não são pontuados
     * para aleijados
     */
    public void toSegundaryAttributePoints() {
        int points;
        int aux;
        
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
         * Adiciona de forma aleatória os pontos, com exceção de pontos de força para aleijados.
         * o loop termina quando os pontos acabam.
         * 0 = força;
         * 1 = dextreza;
         * 2 = vigor;
         */
        while( points != 0 ){
            aux = 0; //randomNumber(Physical.SIZE);
            if ( !(aux == 0)  && !(this.concept == "aleijado" || this.concept == "aleijada") )
              if ( this.physical.get(randomNumber(Physical.SIZE)).addPoints() ) {
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
        int aux;
        
        /*
         * Adiciona de forma aleatória os pontos, exceto pontos em aparência.
         * o loop termina quando os pontos acabam.
         * 
         * 0 = carisma.
         * 1 = manipulação.
         * 2 = aparencia.
         */
        while( points != 0 ){
            aux = randomNumber(Social.SIZE);
            if ( aux != 2 )
              if ( this.social.get(aux).addPoints() ) {
                 points--;
              }
        }
        
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Mendigos, num máximo de 3 níveis.
     * Mendigos tem como habilidade principal Perícias, entretanto eles tende a ter mais afinidade com:
     *  Sobrevivência;
     *  Furtividade.
     * Outro ponto, os mendigos dente a não ter em suas caracteristicas pontos em:
     *  Etiqueta; 
     *  Cavalgar;
     *  Arqueirismo;
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
         * Adiciona os valores dos Skill finaliza o while quando os pontos acabarem.
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
         * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
         * não adiciona pontos as habilidades as quais não tem como caracteristicas
         */
        for(int i = 0; i < Expertise.SIZE; i++) {
           if(i == 0 || i == 8 || i == 9) {
              if ( this.expertise.get(i).addPoints() ) {
                 points--;
              }
           }
        }
        
        while( points != 0 ){
            aux = randomNumber(Expertise.SIZE);
            //Condição para verificar se a habilidade escolhida não faz parte das exceções.
            if ( aux != 1 || aux != 3 || aux != 7 )
               if ( this.expertise.get(aux).getValue() < 3 )
                 if ( this.expertise.get(aux).addPoints() )
                      points--;
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades dos Mendigos, num máximo de 3 níveis.
     * Mendigos tem como habilidade segundária Talentos, entretanto eles tende a ter mais afinidade com:
     *  Intimidação;
     *  Lábia.
     * Outro ponto, os mendigos dente a não ter em suas caracteristicas pontos em:
     *  Briga; 
     *  Liderança;
     *  Esportes;
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
         * Adiciona os valores dos Skill finaliza o while quando os pontos acabarem.
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
         * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
         * não adiciona pontos as habilidades as quais não tem como caracteristicas.
         */
        for(int i = 0; i < Talent.SIZE; i++) {
           if( i == 6 || i == 9 ) {
              if ( this.talent.get(i).addPoints() ) {
                 points--;
              }
           }
        }
        
        while( points != 0 ){
            aux = randomNumber(Expertise.SIZE);
            //Condição para verificar se a habilidade escolhida não faz parte das exceções.
            if ( aux != 2 || aux != 3 || aux != 8 )
               if ( this.expertise.get(aux).getValue() < 3 )
                 if ( this.expertise.get(aux).addPoints() )
                      points--;
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades dos Mendigos, num máximo de 3 níveis.
     * Mendigos tem como habilidade terceária Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Sabedoria popular e;
     *  Ocultismo.
     * Outro ponto, os mendigos dente a não ter em suas caracteristicas pontos em:
     *  Instrução; 
     *  Direito;
     *  Linguística e;
     *  Ciência;
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
         * Adiciona os valores dos Skill finaliza o while quando os pontos acabarem.
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
         * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
         * não adiciona pontos as habilidades as quais não tem como caracteristicas.
         */
        for(int i = 0; i < Knowledge.SIZE; i++) {
           if( i == 1 || i == 6 ) {
              if ( this.knowledge.get(i).addPoints() ) {
                 points--;
              }
           }
        }
        
        while( points != 0 ){
            aux = randomNumber(Knowledge.SIZE);
            //Condição para verificar se a habilidade escolhida não faz parte das exceções.
            if ( aux != 0 || aux != 3 || aux != 4 || aux != 8 )
               if ( this.expertise.get(aux).getValue() < 3 )
                 if ( this.expertise.get(aux).addPoints() )
                      points--;
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
                  this.concept = "aleijada";
                else
                  this.concept = "aleijada";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "escravo fugitivo";
                else
                  this.concept = "escrava fugitiva";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = "devedor";
                else
                  this.concept = "devedora";
                break;
            case 3:
                this.concept = "delinquente";
                break;
            case 4:
                if (this.gender == 'm' )
                  this.concept = "mutilado";
                else
                  this.concept = "multilada";
            case 5:
                if ( this.gender == 'm' )
                  this.concept = "veterado";
                else
                  this.concept = "veterada";
        }
    }
}
