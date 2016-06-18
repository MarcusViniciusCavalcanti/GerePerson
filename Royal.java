/**
 * Classe Royal: Classe responsável pelo conceitos nobres elencados me:
 *  barão, herdeiro real, cruzado, bastardo, libertino;
 *  Define os atributos primários como sociais, segundários como conhecimento, terceários como físicos.
 *  Suas habilidades princípal consistem na categoria de conhecimento, porém tende a ter maior afinidade com:
 *   Instrução;
 *   Linguística.
 *  Suas habilidades segundárias estão entra as das categoia perícia com afinidade em:
 *   Representação e;
 *   Liderança.  
 *  Por ultimo suas habilidades terceárias são talentos com maior afinidade:
 *   Etiqueta e;
 *   Cavalgar.
 *   Obs:
 *      Cruzados são guerreiros nobres, cavaleiros, sendo assim suas habilidades e atributos diferencial um pouco dos conceitos anteriores.
 *      
 *      Seus atributos são: físico, sociais, mentais, respectivamente
 *      Suas habilidades: talentos, perícia e conhecimento.
 */ 
public class Royal extends Person {   
    public Royal() {
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
     * Nobres recebem como primária atributos sociais.
     */
    public void toPrimaryAttributePoints() {
        int points = 0;
        
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 7;
        else
          points = 6;
        
        if ( this.concept.equals("cruzado") ){
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
        else {
            /*
             * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
             * 0 = Carisma;
             * 1 = Manipulação;
             * 2 = Aparência;
             */
            while( points > 0 ){
                if ( this.social.get(randomNumber(Social.SIZE)).addPoints() ) {
                   points--;
                }
            }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Nobres recebem como segundários atributos mentais.
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
        
        if ( this.concept.equals("cruzado") ) {
            /*
             * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
             * 0 = Carisma;
             * 1 = Manipulação;
             * 2 = Aparência;
             */
            while( points > 0 ){
                if ( this.social.get(randomNumber(Social.SIZE)).addPoints() ) {
                   points--;
                }
            }
        }
        else {
            /*
             * Adiciona de forma aleatória os pontos.
             * o loop termina quando os pontos acabam.
             * 0 = Percepção.
             * 1 = Inteligência.
             * 2 = Raciocínio.
             */
            while( points > 0 ){
                if ( this.mental.get(randomNumber(Social.SIZE)).addPoints() ) {
                   points--;
                }
            }
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Nobres recebem como terceários atributos físicos.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        if ( this.concept.equals("cruzado") ) {
            /*
             * Adiciona de forma aleatória os pontos.
             * o loop termina quando os pontos acabam.
             * 0 = Percepção.
             * 1 = Inteligência.
             * 2 = Raciocínio.
             */
            while( points > 0 ){
                if ( this.mental.get(randomNumber(Social.SIZE)).addPoints() ) {
                   points--;
                }
            }
        }
        else {
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
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Nobres, num máximo de 3 níveis.
     * Nobres tem como habilidade principal Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Instrução;
     *  Linguística e;
     *  Senescália.
     * Excetos cruzados tem como habilidade princípal talento, com afinidades:
     *  Prontidão;
     *  Esportes e;
     *  Liderança.
     */
    public void toPrimarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 13;
        else
          points = 11;
         
        if ( this.concept.equals("cruzado") ) {  
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
            if ( this.talent.get(1).addPoints() ) 
              points--;
              
            if ( this.talent.get(2).addPoints() ) 
              points--;
              
            if ( this.talent.get(8).addPoints() ) 
              points--;
            
            while( points > 0 ){
                aux = randomNumber(Talent.SIZE);
                
                if ( this.talent.get(aux).getValue() < 3 )
                  if ( this.talent.get(aux).addPoints() ) {
                     points--;
                  }
            }
        }
        else {
            /*
             * Adiciona os valores das Habilidades finaliza o for quando os pontos acabarem.
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
            if ( this.knowledge.get(0).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(4).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(9).addPoints() ) 
              points--;
              
            while( points > 0 ){
                aux = randomNumber(Expertise.SIZE);
                
                if ( this.knowledge.get(aux).getValue() < 3 )
                  if ( this.knowledge.get(aux).addPoints() ) {
                     points--;
                  }
            }
        }
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Nobres, num máximo de 3 níveis.
     * Nobres tem como habilidade segundária Perícias, entretanto eles tende a ter mais afinidade com:
     *  Representação e;
     *  Liderança.  
     * Excetos cruzados tem como habilidade princípal talento, com afinidades:
     *  Empatia com animais;
     *  Etiqueta;
     *  Armas brancas e ;
     *  Cavalgar.
     */
    public void toSegundarySkillPoints() {
        int points = 0;
        int aux = 0;
        
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 9;
        else
          points = 7;
        
        if ( this.concept.equals("cruzado") ) {
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
            if ( this.expertise.get(0).addPoints() ) 
              points--;
          
            if ( this.expertise.get(3).addPoints() ) 
              points--;
          
            if ( this.expertise.get(5).addPoints() ) 
              points--;
          
            if ( this.expertise.get(7).addPoints() ) 
              points--;
            
            while( points > 0 ){
                aux = randomNumber(Knowledge.SIZE);
                        
                if ( this.expertise.get(aux).getValue() < 3 )
                  if ( this.expertise.get(aux).addPoints() ) {
                     points--;
                  }
            }
        }
        else {
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
            if ( this.talent.get(0).addPoints() ) 
              points--;
          
            if ( this.talent.get(8).addPoints() ) 
              points--;
            
            while( points > 0 ){
                aux = randomNumber(Talent.SIZE);
                
                if ( this.talent.get(aux).getValue() < 3 )
                  if ( this.talent.get(aux).addPoints() ) {
                     points--;
                  }
            }
        }
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Nobres, num máximo de 3 níveis.
     * Nobres tem como habilidade segundária Perícias, entretanto eles tende a ter mais afinidade com:
     *  Etiqueta e;
     *  Cavalgar.  
     * Excetos cruzados tem como habilidade princípal talento, com afinidades:
     *  Instrução;
     *  Linguística e;
     *  Senescália.
     */
    public void toTertiarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 5;
        else
          points = 4;
        
        if ( this.concept.equals("cruzado") ) {
            /*
             * Adiciona os valores das Habilidades finaliza o for quando os pontos acabarem.
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
            if ( this.knowledge.get(0).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(4).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(9).addPoints() ) 
              points--;
            
            while( points != 0 ){
                aux = randomNumber(Expertise.SIZE);
                
                if ( this.knowledge.get(aux).getValue() < 3 )
                  if ( this.knowledge.get(aux).addPoints() ) {
                     points--;
                  }
            }
        }
        else {
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
              
            if ( this.expertise.get(7).addPoints() ) 
              points--;
            
            while( points != 0 ){
                aux = randomNumber(Knowledge.SIZE);
                        
                if ( this.expertise.get(aux).getValue() < 3 )
                  if ( this.expertise.get(aux).addPoints() ) {
                     points--;
                  }
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
                  this.concept = "Barão,";
                else
                  this.concept = "Baronesa";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = " Herdeiro real";
                else
                  this.concept = "Herdeira real";
                break;
            case 2:
                this.concept = "Cruzado";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Bastardo";
                else
                  this.concept = "Bastarda";
                break;
            case 4:
                if (this.gender == 'm' )
                  this.concept = "Libertino";
                else
                  this.concept = "Libertino";
        }
    }
}