import java.util.Random;
/**
 * Classe responsável por fazer a seleção aleátoria da criação dos personagens.
 * Será invocado está classe ao pedir uma criação.
 */


public class CharacterGenerator {
    
    private Object person;
<<<<<<< HEAD
    
=======
>>>>>>> aba7a4c3003e77544cf83fe8ad2edaa9455b8b8d
    /**
     * Método que vai fazer a seleção da criação do objeto.
     */
    public void generate()  {
        Random random = new Random();
        
        int choice = random.nextInt(17); //

         
        switch ( choice ) {
            case 0 : 
                person = new Knight();
                break;
            case 1 : 
                person = new Knight();
                break;
            case 2 : 
                person = new Knight();
                break;
            case 3 : 
                person = new Knight();
                break;
            case 4 : 
                person = new Knight();
                break;
            case 5 : 
                person = new Knight();
                break;
            case 6 : 
                person = new Knight();
                break;
            case 7 : 
                person = new Knight();
                break;
            case 8 : 
                person = new Knight();
                break;
            case 9 : 
                person = new Knight();
                break;
            case 10 : 
                person = new Knight();
                break;
            case 11 : 
                person = new Knight();
                break;
            case 12 : 
                person = new Knight();
                break;
            case 13: 
                person = new Knight();
                break;
            case 14 : 
                person = new Knight();
                break;
            case 15 : 
                person = new Knight();
                break;
            case 16 : 
                person = new Knight();
                break;
            case 17 : 
                person = new Knight();
                break;
        }
    }
}
