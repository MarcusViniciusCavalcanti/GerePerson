/**
 * Classe Erudite: Classe responsável pelo conceitos edruditos elencados em:
 *  Alquimista, Sabio, médico, escrivão, teologo;
 *  Define os atributos primários como Mentais, segundários como sociais, terceários como físicos.
 *  Suas habilidades princípal consistem na categoria de conhecimento suas habilidades segundárias
 *  estão entra as das categoia talentos e suas habilidades terciárias são perícias.
 */ 
public class Erudite extends Person {   
    public Erudite() {
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
     * Eruditos recebem como primária atributos Mentais.
     */
    public void toPrimaryAttributePoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
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
            aux = randomNumber(this.mental.size());
            if ( this.mental.get(aux).addPoints() ) {
               points--;
            }
        }  
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Eruditos recebem como segundários atributos sociais.
     */
    public void toSegundaryAttributePoints() {
        int points;
        int aux = 0;
        
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
         * Adiciona os valores dos atributos finaliza o for quando os pontos acabarem.
         * 0 = Carisma;
         * 1 = Manipulação;
         * 2 = Aparência;
         */
        while( points > 0 ){
            aux = randomNumber(this.social.size());
            if ( this.social.get(aux).addPoints() ) {
               points--;
            }
        }
       
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Eruditos recebem como terceários atributos físicos.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        int aux = 0;
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
         * 0 = força;
         * 1 = dextreza;
         * 2 = vigor;
        */
        while( points > 0 ){
           aux = randomNumber(this.physical.size());
           if ( this.physical.get(aux).addPoints() ) {
              points--;
           }
        }
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Eruditos, num máximo de 3 níveis.
     * Eruditos tem como habilidade principal Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Sabedoria Popular;
     *  Linguistica e;
     *  Ciencia.
     *  Já Médicos tem como afinidades:
     *  Instrução;
     *  Medicina e;
     *  Ciência;
     */
    public void toPrimarySkillPoints() {
        int points = 0;
        int aux = 0;
         
        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 13;
        else
          points = 11;
        
        if ( this.concept.equals("Médico") ||  this.concept.equals("Médica")) {
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
          
            if ( this.knowledge.get(5).addPoints() ) 
              points--;
        } else {
            if ( this.knowledge.get(1).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(4).addPoints() ) 
              points--;
        }
        
        if ( this.knowledge.get(8).addPoints() ) 
              points--;
        
        while( points != 0 ){
           aux = randomNumber(this.knowledge.size());
                
           if ( this.knowledge.get(aux).getValue() < 3 )
               if ( this.knowledge.get(aux).addPoints() ) {
                  points--;
               }
        }
        
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Eruditos, num máximo de 3 níveis.
     * Eruditos tem como habilidade segundária talentos, entretanto eles tende a ter mais afinidade com:
     *  Prontidão
     *  Empatia.
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
         * Adiciona os valores das Habilidades finaliza o for quando os pontos acabarem.
         * 0 = "Representação";
         * 1 = "Prontidão";
         * 2 = "Esportes"; 
         * 3 = "Briga";
         * 4 = "Esquiva; 
         * 5 = "Empatia",
         * 6 = "Intimidação";
         * 7 = "Crima;
         * 8 = "Liderança" e; 
         * 9 = "Lábia".
         */
        if ( this.talent.get(1).addPoints() ) 
           points--;
          
        if ( this.talent.get(5).addPoints() ) 
           points--;
        
        
        while( points != 0 ){
           aux = randomNumber(this.talent.size());
                
           if ( this.talent.get(aux).getValue() < 3 )
               if ( this.talent.get(aux).addPoints() ) {
                  points--;
               }
        }
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Eruditos, num máximo de 3 níveis.
     * Eruditos tem como habilidade Terciárias Perícias, entretanto eles tende a ter mais afinidade com:
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
            
        while( points != 0 ){
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
                this.concept = "Alquimista";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Sábio";
                else
                  this.concept = "Sábia";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = "Médico";
                else
                  this.concept = "Médica";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Escrivão";
                else
                  this.concept = "Escrivã";
                break;
            case 4:
                if (this.gender == 'm' )
                  this.concept = "Teólogo";
                else
                  this.concept = "Teóloga";
        }
    }
}