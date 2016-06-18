/**
 * Responsável pelo conceitos Lacaios.
 * Lacaios caçadores, patrulheiros, xerifes e torturadores, tem atributos: fisicos, mentais e sociais nesta ordem, ao passo que,
 * lacaios trovadores, dama de companhia ou gigolo recebem como atributos: sociais, mentais e físicos.
 * 
 * Os lacaios patrulheiros e xerifes tem como habilidades primarias conhecimentos. 
 * Recebendo 1 ponto inicial em: 
 *  Investigação;
 *  Direito e;
 *  Polícia.
 * Suas habilidades secundárias são talento com afinidades em:
 *  Prontidão;
 * E perícias suas habilidades terceárias tem como caracteristica principal:
 *  Armas brancas;
 *  
 * Os lacaio caçador  tem como primárias perícias recebe 3 pontos em arqueirismo e 2 em furtividade inicialmente.
 * Secundárias talentos. E terceárias conhecimentos com maior afinidades;
 *  Sabedoria popular e;
 *  Investigação.
 *  
 * Trovadores e dama de companhia ou gigolo tem como habilidades princípal talento.
 * adicionando 1 ponto em representação e 2 em lábia. Suas habilidades secundárias é perícia
 * é principais:
 *  Música.
 *  Já suas habilidades terceárias são conhecimentos.
 * 
 * Por ultimo lacaios torturadores recebem como habilidades primarias perícia, conhecimento e talento.
 * Onde perícia recebe 1 ponto inicialmente armas brancas.
 */ 
public class Lacquey extends Person {
    
    /**
     * Construtor:
     * Inicializa os atributos e métodos da super classe Person
     * Invoca os métodos para distribuição de pontos do personagem.
     */
    public Lacquey() {
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
        
        if ( this.concept.equals("Dama de companhia") || this.concept.equals("gigolo") 
                || this.concept.equals("Trovador") || this.concept.equals("Trovadora") )
          while( points > 0 ){
              if ( this.social.get(randomNumber(this.social.size())).addPoints() )
                points--;
          }
        else
          while( points > 0 ){
              if ( this.physical.get(randomNumber(this.physical.size())).addPoints() ) {
                 points--;
              }
          }
    }
       
    /**
     * Define a distribuição dos pontos dos atributos secundários do personagem.
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
        
        while( points > 0 ){
            if ( this.mental.get(randomNumber(this.mental.size())).addPoints() ) {
               points--;
            }
        }
    }

    /**
     * Define a distribuição dos pontos dos atributos terceários do personagem.
     * baseados nas regrados dos conceitos.
     */
    public void toTertiaryAttributePoints() {
        int points = 3;
        
        //Adiciona os valores dos Skill finaliza o for quando os pontos acabarem. 
        if ( this.concept.equals("Dama de companhia") || this.concept.equals("gigolo") 
                || this.concept.equals("Trovador") || this.concept.equals("Trovadora") )
          while( points > 0 ){
              if ( this.physical.get(randomNumber(this.physical.size())).addPoints() )
                points--;
          }
        else
          while( points > 0 ){
              if ( this.social.get(randomNumber(this.social.size())).addPoints() ) {
                 points--;
              }
          }
        
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades princípal dos Lacaios, num máximo de 3 níveis.
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
         * Vai verirficar qual conceito o personagem tem 
         * faz a distribuição dos pontos primários 
         * respeitando a regra de cada conceito
         */
        if ( this.concept.equals("Gigolo") || this.concept.equals("Dama de companhia") 
                      || this.concept.equals("Trovador") || this.concept.equals("Trovadora") ) {
          for( int i = 0; i < 2; i++ )
                if ( this.talent.get(9).addPoints() ) 
                  points--;
                    
          if ( this.talent.get(0).addPoints() ) 
            points--;
          
          //Adiciona os valores das habilidades finaliza o loop termina quando os pontos acabarem.  
          while( points > 0 ){
              aux = randomNumber(this.talent.size());
              if ( this.talent.get(aux).getValue() < 3 )
                if ( this.talent.get(aux).addPoints() )
                  points--;
          }
        }
        else {    
          if ( this.concept.equals("Xerife") || this.concept.equals("Patrulheiro") || this.concept.equals("Patrulheira") ) {
             if ( this.knowledge.get(2).addPoints() )
               points--;
             
             if ( this.knowledge.get(3).addPoints() )
               points--;
               
             if ( this.knowledge.get(7).addPoints() )
               points--;
               
             while( points > 0 ){
                 aux = randomNumber(this.knowledge.size());
                 if ( this.knowledge.get(aux).getValue() < 3 )
                   if ( this.knowledge.get(aux).addPoints() )
                     points--;
             }    
          }
          else {
            if( this.concept.equals("Caçador") || this.concept.equals("Caçadora") ) {
              for( int i = 0; i < 3; i++ )
                  if ( this.expertise.get(1).addPoints() ) 
                    points--;
            
              for( int i = 0; i < 2; i++ )
                  if ( this.expertise.get(8).addPoints() ) 
                    points--;
                }
            else {
              if ( this.expertise.get(5).addPoints() ) 
                points--;
            }
          
            while( points > 0 ){
                aux = randomNumber(this.expertise.size());
                if ( this.expertise.get(aux).getValue() < 3 )
                  if ( this.expertise.get(aux).addPoints() )
                    points--;
            }  
          }
        }       
    }
    
    /**
     * Define a distribuição dos pontos das Habilidades secundárias dos Lacaios, num máximo de 3 níveis.
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
         * Vai verirficar qual conceito o personagem tem 
         * faz a distribuição dos pontos secundários 
         * respeitando a regra de cada conceito
         */
        if ( this.concept.equals("Trovador") || this.concept.equals("Trovadora") 
                    || this.concept.equals("Gigolo") || this.concept.equals("Dama de companhia") ) {
          if ( this.expertise.get(6).addPoints() )
            points--;
            
          while( points > 0 ){
              aux = randomNumber(this.talent.size());
              if ( this.expertise.get(aux).getValue() < 3 )
                if ( this.expertise.get(aux).addPoints() ) 
                   points--;
          }
        }        
        else {
          if ( this.talent.get(1).addPoints() )
            points--;
                
          while( points > 0 ){
              aux = randomNumber(this.talent.size());
              if ( this.talent.get(aux).getValue() < 3 )
                if ( this.talent.get(aux).addPoints() ) 
                   points--;
          }
        }
    }

    /**
     * Define a distribuição dos pontos das Habilidades terceários dos Lacaios, num máximo de 3 níveis.
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
         * Vai verirficar qual conceito o personagem tem 
         * faz a distribuição dos pontos terceários 
         * respeitando a regra de cada conceito
         */
        if( this.concept.equals("Xerife") || this.concept.equals("Patrulheiro") || this.concept.equals("Patrulheira") ) {
          if( this.expertise.get(5).addPoints() )
            points--;
            
          while( points > 0 ){
              aux = randomNumber(this.expertise.size());
              if ( this.expertise.get(aux).getValue() < 3 )
                if ( this.expertise.get(aux).addPoints() ) 
                   points--;
          }
        }
        else {
          if( this.concept.equals("Torturador") || this.concept.equals("Torturadora") )
            while( points > 0 ){
                aux = randomNumber(this.expertise.size());
                if ( this.expertise.get(aux).getValue() < 3 )
                  if ( this.expertise.get(aux).addPoints() ) 
                    points--;
            }
          else {
            if ( this.concept.equals("Caçador") || this.concept.equals("Caçador") )
              if( this.knowledge.get(1).addPoints() )
                points--;
                
            if( this.knowledge.get(2).addPoints() )
              points--;
                
            while( points > 0 ){
                aux = randomNumber(this.knowledge.size());
                if ( this.knowledge.get(aux).getValue() < 3 )
                  if ( this.knowledge.get(aux).addPoints() ) 
                    points--;
            }
          }
        }
    }
    
    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {      
        int i = 4;//randomNumber(6);
        
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "Caçador";
                else
                  this.concept = "Caçadora";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Patrulheiro";
                else
                  this.concept = "Patrulheira";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = "Trovador";
                else
                  this.concept = "Trovadora";
                break;
            case 3:
                this.concept = "Xerife";
                break;
            case 4:
                if ( this.gender == 'm' )
                  this.concept = "Torturador";
                else
                  this.concept = "Torturadora";
                break;
            case 5:
                if ( this.gender == 'm' )
                  this.concept = "Gigolo";
                else
                  this.concept = "Dama de companhia";
                break;
        }
    }
}