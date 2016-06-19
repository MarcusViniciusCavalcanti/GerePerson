/**
 * Classe responsável pelo conceito Mendigos. 
 * Estes tem como atributos primários mentais para ambos os conceitos
 * secundários físicos, entretanto conceitos aleijados não recebem pontos de força
 * E por ultimo atributos sociais.
 * Habilidades primárias dos Mendigos é perícia, secundário talentos
 * e conhecimento com terceárias.
 * Pontos em aparência não são adicionados inicialmente.
 */ 

public class Mumper extends Person {
   
    /**
     * Construtor:
     * Inicializa os atributos e métodos da super classe Person
     * Invoca os métodos para distribuição de pontos do personagem.
     */
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
     * Define a distribuição dos pontos dos atributos primária dos Mendigos 
     * recebem como primária atributos Mentais.
     */
    public void toPrimaryAttributePoints() {
        int points = 0;

        //define quantidade de pontuação baseando na linhagem.
        if ( this.lineage == 's' )
          points = 7;
        else
          points = 6;
        
        while( points > 0 ){
            if ( this.mental.get(randomNumber(this.mental.size())).addPoints() ) {
               points--;
            }
        }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos segundária do personagem.
     * Mendigos recebem como segundários atributos fisicos, entretanto atributos força não são pontuados
     * para aleijados
     */
    public void toSegundaryAttributePoints() {
        int points;
        int aux;

        //Define a quantidade de pontos baseados na linhagem
        if( this.lineage == 's' )
          points = 5;
        else
          points = 4;
          
        /*
         * Adiciona de forma aleatória os pontos, 
         * com exceção de pontos de força para aleijados.
         * o loop termina quando os pontos acabam.
         */
        while( points > 0 ){
            aux = randomNumber(this.physical.size());   
            //condição para impedir a adição de pontos em força caso o conceito for aleijado(a)
            if ( aux == 0 && ( this.concept.equals("aleijado") || this.concept.equals("aleijada")) )
              continue; // instrução para o loop voltar ao inicio.
            else 
              if( this.physical.get(aux).addPoints() )
                points--;
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceária do personagem.
     * Conceitos de Mendigos recebem como terceários atributos Sociais.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        int aux;
        
        /*
         * Adiciona de forma aleatória os pontos, exceto pontos em aparência.
         */
        while( points > 0 ){
            aux = randomNumber(this.social.size());
            if ( aux != 2 )
              if ( this.social.get(aux).addPoints() ) {
                 points--;
              }
        }
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades primárias dos mendigos, num máximo de 3 níveis.
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
        if ( this.expertise.get(8).addPoints() ) 
          points--;
        
        if ( this.expertise.get(9).addPoints() ) 
          points--;
         
        /*
         * Adiciona os valores dos Skill finaliza o while 
         * quando os pontos acabarem.
         */ 
        while( points > 0 ){
            aux = randomNumber(this.expertise.size());
            //Condição para verificar se a habilidade escolhida não faz parte das exceções.
            if ( aux != 1 || aux != 3 || aux != 7 )
               if ( this.expertise.get(aux).getValue() < 3 )
                 if ( this.expertise.get(aux).addPoints() )
                      points--;
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades secundárias dos Mendigos, num máximo de 3 níveis.
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
         * não adiciona pontos as habilidades as quais não tem como caracteristicas.
         */       
        if ( this.talent.get(6).addPoints() ) 
          points--;
          
        if ( this.talent.get(9).addPoints() ) 
          points--;
                   
        /*
         * Adiciona os valores dos Skill finaliza o while quando os pontos acabarem.
         */
        while( points > 0 ){
            aux = randomNumber(this.talent.size());
            //Condição para verificar se a habilidade escolhida não faz parte das exceções.
            if ( aux != 2 || aux != 3 || aux != 8 )
               if ( this.talent.get(aux).getValue() < 3 )
                 if ( this.talent.get(aux).addPoints() )
                      points--;
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades terceária dos Mendigos, num máximo de 3 níveis.
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
         *Adiciona um ponto as habilidades pré-estabelecida com maior afinidade e,
         * não adiciona pontos as habilidades as quais não tem como caracteristicas.
         */
        if ( this.knowledge.get(1).addPoints() ) 
          points--;
        
        if ( this.knowledge.get(6).addPoints() ) 
          points--;
        
        /*
         * Adiciona os valores dos Skill finaliza 
         * o while quando os pontos acabarem.
         */
        while( points > 0 ){
            aux = randomNumber(this.knowledge.size());
            //Condição para verificar se a habilidade escolhida não faz parte das exceções.
            if ( aux != 0 || aux != 3 || aux != 4 || aux != 8 )
               if ( this.knowledge.get(aux).getValue() < 3 )
                 if ( this.knowledge.get(aux).addPoints() )
                      points--;
        }
    }
    
    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {      
        int i = randomNumber(6);
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "aleijado";
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
