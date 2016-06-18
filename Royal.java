/**
 * Classe responsável pelo conceitos nobres elencados barão, herdeiro real, cruzado, bastardo, libertino;
 * Define os atributos primários como sociais, segundários como conhecimento, terceários como físicos.
 * Suas habilidades princípal consistem na categoria de conhecimento, porém tende a ter maior afinidade com:
 *  Instrução;
 *  Linguística.
 * Suas habilidades segundárias estão entra as das categoia perícia com afinidade em:
 *  Representação e;
 *  Liderança.  
 * Por ultimo suas habilidades terceárias são talentos com maior afinidade:
 *  Etiqueta e;
 *  Cavalgar.
 * Obs:
 *      Cruzados são guerreiros nobres, cavaleiros, sendo assim suas habilidades e atributos diferencial um pouco dos conceitos anteriores.
 *      
 *      Seus atributos são: físico, sociais, mentais, respectivamente
 *      Suas habilidades: talentos, perícia e conhecimento.
 */ 
public class Royal extends Person {   
    
    /**
     * Construtor:
     * Inicializa os atributos e métodos da super classe Person
     * Invoca os métodos para distribuição de pontos do personagem.
     */
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
     * baseados nas regrados dos conceitos.
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
             */
            while( points > 0 ){
                if ( this.physical.get( randomNumber(this.physical.size()) ).addPoints() ) {
                   points--;
                }
            }
        }
        else {
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
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * baseados nas regrados dos conceitos.
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
             * Adiciona os valores dos atributos finaliza 
             * o loop quando os pontos acabarem.
             */
            while( points > 0 ){
                if ( this.social.get( randomNumber(this.social.size()) ).addPoints() ) {
                   points--;
                }
            }
        }
        else {
            /*
             * Adiciona de forma aleatória os pontos.
             * o loop termina quando os pontos acabam.
             */
            while( points > 0 ){
                if ( this.mental.get( randomNumber(this.mental.size()) ).addPoints() ) {
                   points--;
                }
            }
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * baseados nas regrados dos conceitos.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        if ( this.concept.equals("cruzado") ) {
            /*
             * Adiciona de forma aleatória os pontos.
             * o loop termina quando os pontos acabam.
             */
            while( points > 0 ){
                if ( this.mental.get( randomNumber(this.mental.size()) ).addPoints() ) {
                   points--;
                }
            }
        }
        else {
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
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades primárias dos Nobres, num máximo de 3 níveis.
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
         
        //Verificação das distribuições diferentes.
        if ( this.concept.equals("cruzado") ) {  
            /*
             * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
             * não adiciona pontos as habilidades as quais não tem como caracteristicas
             */
            if ( this.talent.get(1).addPoints() ) 
              points--;
              
            if ( this.talent.get(2).addPoints() ) 
              points--;
              
            if ( this.talent.get(8).addPoints() ) 
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
        else {
            /*
             * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
             * não adiciona pontos as habilidades as quais não tem como caracteristicas
             */
            if ( this.knowledge.get(0).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(4).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(9).addPoints() ) 
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
    }
    
     /**
     * Define a distribuição dos pontos das Habilidades secundárias dos Nobres, num máximo de 3 níveis.
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
        
        //Verificação das distribuições diferentes.
        if ( this.concept.equals("cruzado") ) {            
            /*
             * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
             * não adiciona pontos as habilidades as quais não tem como caracteristicas
             */
            if ( this.expertise.get(0).addPoints() ) 
              points--;
          
            if ( this.expertise.get(3).addPoints() ) 
              points--;
          
            if ( this.expertise.get(5).addPoints() ) 
              points--;
          
            if ( this.expertise.get(7).addPoints() ) 
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
        else {
            /*
             * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
             * não adiciona pontos as habilidades as quais não tem como caracteristicas
             */
            if ( this.talent.get(0).addPoints() ) 
              points--;
          
            if ( this.talent.get(8).addPoints() ) 
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
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades terceárias dos Nobres, num máximo de 3 níveis.
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
        
        //Verificação das distribuições diferentes.
        if ( this.concept.equals("cruzado") ) {
            /*
             * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
             * não adiciona pontos as habilidades as quais não tem como caracteristicas
             */
            if ( this.knowledge.get(0).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(4).addPoints() ) 
              points--;
          
            if ( this.knowledge.get(9).addPoints() ) 
              points--;
            
            /*
             * Adiciona de forma aleatória os pontos.
             * o loop termina quando os pontos acabam.
             */
            while( points != 0 ){
                aux = randomNumber(this.knowledge.size());
                
                if ( this.knowledge.get(aux).getValue() < 3 )
                  if ( this.knowledge.get(aux).addPoints() ) {
                     points--;
                  }
            }
        }
        else {
            /*
             * Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
             * não adiciona pontos as habilidades as quais não tem como caracteristicas
             */
            if ( this.expertise.get(3).addPoints() ) 
              points--;
              
            if ( this.expertise.get(7).addPoints() ) 
              points--;
              
            /*
             * Adiciona de forma aleatória os pontos.
             * o loop termina quando os pontos acabam.
             */
            while( points != 0 ){
                aux = randomNumber(this.expertise.size());                        
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
        int i = randomNumber(5);
        
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