/**
 * Classe responsável pelo conceitos Pelegrinos elencados me:
 *  barão, herdeiro real, cruzado, bastardo, libertino;
 * Define os atributos primários como fisicos, segundários como conhecimento, terceários como sociais.
 * Suas habilidades princípal consistem na categoria de conhecimento, porém tende a ter maior afinidade com:
 *  Sabedoria popular;
 *  Ocultismo.
 * Suas habilidades segundárias estão entra as das categoia perícia com afinidade em:
 *  Sobrevivência, recebem 2 pontos de sobrevivência iniciais.
 *  Herborismo.  
 * Por ultimo suas habilidades terceárias são talentos com maior afinidade:
 *  Empatia;
 */ 

public class Pilgrim extends Person {
   
    public Pilgrim() {
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
     * Pelegrinos recebem como primária atributos físicos.
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
            if ( this.physical.get(randomNumber(Physical.SIZE)).addPoints() ) {
               points--;
            }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Pelegrinos recebem como segundários atributos mentais.
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
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Pelegrinos recebem como terceários atributos Sociais.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         * 0 = carisma.
         * 1 = manipulação.
         * 2 = aparencia.
         */
        while( points > 0 ){
            if ( this.social.get(randomNumber(Mental.SIZE)).addPoints() ) {
               points--;
            }
        }
        
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Cavaleiros, num máximo de 3 níveis.
     * Pelegrinos tem como habilidade principal Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Sabedoria popular;
     *  Ocultismo.
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
        if ( this.knowledge.get(1).addPoints() ) 
          points--;
          
        if ( this.knowledge.get(6).addPoints() ) 
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
     * Define a distribuição dos pontos das Habilidades dos Cavaleiros, num máximo de 3 níveis.
     * Pelegrinos tem como habilidade secundária perícia, entretanto eles tende a ter mais afinidade com:
     *  Sobrevivência
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
        for(int i = 0; i < 2; i++)
            if ( this.expertise.get(9).addPoints() )
              points--;
   
        while( points > 0 ){
            aux = randomNumber(Expertise.SIZE);
            
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() )
                 points--;
        }

    }

    /**
     * Define a distribuição dos pontos das Habilidades dos Cavaleiros, num máximo de 3 níveis.
     * Pelegrinos tem como ultima habilidade Talento, entretanto eles tende a ter mais afinidade com:
     *  Empatia
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
    	if ( this.talent.get(5).addPoints() ) 
    	 points--;
        
        while( points > 0 ){
            aux = randomNumber(Talent.SIZE);
            
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) 
                 points--;
        }
    }
    
    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {      
        int i = randomNumber(4);
        
        switch ( i ) {
            case 0:             
                this.concept = "Cruzado";
                break;
            case 1:
                this.concept = "Penitente";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = " Monge louco";
                else
                  this.concept = " Monja louca";
                break;
            case 3:
                this.concept = "Palmeirim";
                break;
        }
    }
}
