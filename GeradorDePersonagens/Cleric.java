import java.util.Random;

public class Cleric extends Person{

	 private int willPower;
    private String concept;
    
    /**
     * Construtor.
     */
    public Cleric() {
        /* vai inicializar o construtor da classe super
         * definindo o nome e genero.
         */
        super();
        
        //define conceito
        toConcept();
        
        //define os atributos.
        toPrimaryAttr();
        toSegundaryAttr();
        toTertiaryAttr();
        
        //define as habilidades.
        toPrimarySkill();
        toSegundarySkill();
        toTertiarySkill();
        
        //define os pontos bonus.
        addPointsBonus();
    }
    
    /**
     * Retornar os pontos de vontades.
     */
    public int getWillPower() {
        return this.willPower;
    }

    /**
     * retornar o conceito do personagem
     */
    public String getConcept() {
        return this.concept;
    }

    /**
     * Define o conceito do personagem de forma aleatória.
     */
    private void toConcept() {
        Random rand = new Random();
        
        int i = rand.nextInt(4);
        
        switch ( i ) {
            case 0:
                if ( this.gender == 'm' )
                  this.concept = "Escudeiro";
                else
                  this.concept = "Escudeira";
                break;
            case 1:
                if ( this.gender == 'm' )
                  this.concept = "Cavaleiro Errante";
                else
                  this.concept = "Cavaleira Errante";
                break;
            case 2:
                if ( this.gender == 'm' )
                  this.concept = "Cortesão";
                else
                  this.concept = "Cortesã";
                break;
            case 3:
                if ( this.gender == 'm' )
                  this.concept = "Cavaleiro nobre";
                else
                  this.concept = "Cavaleira nobre";
                break;
        }
    }

    /**
     * Define qual será os atributos primária do personagem.
     * Distribue os pontos.
     */
    private void toPrimaryAttr() {

    }

    /**
     * Define qual será os atributos segundária do personagem.
     * Distribue os pontos.
     */
    private void toSegundaryAttr() {

    }

    /**
     * Define qual será os atributos tercearia do personagem.
     * Distribue os pontos.
     */
    private void toTertiaryAttr() {

    }

    /**
     * Define qual será as habilidades primária do personagem.
     * Distribue os pontos.
     */
    private void toPrimarySkill() {

    }

    /**
     * Define qual será as habilidades segundárias do personagem.
     * Distribue os pontos.
     */
    private void toSegundarySkill() {

    }

    /**
     * Define qual será as habilidades terceárias do personagem.
     * Distribue os pontos.
     */
    private void toTertiarySkill() {

    }

    /**
     * Distribue os pontos bonus.
     */
    private void addPointsBonus() {

    }
}
