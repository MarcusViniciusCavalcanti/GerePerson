/**
 * Classe Heretic: Classe responsável pelo conceito herege elencados me:
 *  Pagão, infernalista, bruxo, ocultista, feiticeiro;
 *  Define os atributos primários como sociais, segundários como mentais, terceários como físicos.
 *  Suas habilidades princípal consistem na categoria de conhecimento;
 *  Suas habilidades segundárias estão entra as das categoia perícia;
 *  Por ultimo suas habilidades terceárias são talentos.
 *  
 * @author (Matheus Mazepa e Vinicius Cavalcanti) 
 * @version (19.06.2016)
 */ 
public class Heretic extends Person {   
    /**
     * Construtor:
     * Inicializa os atributos e métodos da super classe Person
     * Invoca os métodos para distribuição de pontos do personagem.
     */
    public Heretic() {
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
     * Hereges recebem como primária atributos sociais.
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
         * 0 = Carisma;
         * 1 = Manipulação;
         * 2 = Aparência;
         */
        while( points > 0 ){
             if ( this.social.get(randomNumber(this.social.size())).addPoints() ) {
                points--;
             }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Hereges recebem como segundários atributos mentais.
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
         * 0 = Percepção.
         * 1 = Inteligência.
         * 2 = Raciocínio.
         */
        while( points > 0 ){
            if ( this.mental.get(randomNumber(this.mental.size())).addPoints() ) {
               points--;
            }
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Hereges recebem como terceários atributos físicos.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        /*
         * Adiciona de forma aleatória os pontos.
         * o loop termina quando os pontos acabam.
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
     * Define a distribuição dos pontos das Habilidades dos Hereges, num máximo de 3 níveis.
     * Hereges tem como habilidade principal Conhecimento, entretanto eles tende a ter mais afinidade com:
     *  Sabedoria popular e;
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
        if ( this.knowledge.get(1).addPoints() ) 
           points--;
           
        for (int i = 3; i < 3; i++)          
           if ( this.knowledge.get(6).addPoints() ) 
              points--;
        
        while( points > 0 ){
           aux = randomNumber(this.knowledge.size());
                        
           if ( this.knowledge.get(aux).getValue() < 3 )
              if ( this.knowledge.get(aux).addPoints() ) {
                 points--;
              }
        }      
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos hereges, num máximo de 3 níveis.
     * hereges tem como habilidade segundária Perícias, entretanto eles tende a ter mais afinidade com:
     *  Furtividade e;
     *  Sobrevivência.
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
        if ( this.expertise.get(8).addPoints() ) 
          points--;
      
        if ( this.expertise.get(9).addPoints() ) 
          points--;
      
        while( points > 0 ){
            aux = randomNumber(this.expertise.size());
                    
            if ( this.expertise.get(aux).getValue() < 3 )
              if ( this.expertise.get(aux).addPoints() ) {
                 points--;
              }
        }
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades dos Hereges, num máximo de 3 níveis.
     * Hereges tem como habilidade segundária Perícias, entretanto eles tende a ter mais afinidade com:
     *  Intimidação.
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
        
        
        if ( this.talent.get(6).addPoints() ) {
           points--;
        }  
        
        while( points > 0 ){
            aux = randomNumber(this.talent.size());
            
            if ( this.talent.get(aux).getValue() < 3 )
              if ( this.talent.get(aux).addPoints() ) {
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
                  this.concept = "Pagão,";
                else
                  this.concept = "Pagã";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Bruxo";
                else
                  this.concept = "Bruxa";
                break;
            case 2:
                this.concept = "Infernalista";
                break;
            case 3:
                this.concept = "Ocultista";
                break;
            case 4:
                if (this.gender == 'm' )
                  this.concept = "Feiticeiro";
                else
                  this.concept = "Feiticeira";
        }
    }
}