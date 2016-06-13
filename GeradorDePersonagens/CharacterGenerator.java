import java.util.Random;
/**
 * Classe responsável por fazer a seleção aleátoria da criação dos personagens.
 * Será invocado está classe ao pedir uma criação.
 */


public class CharacterGenerator {
    
    /**
     * Método que vai fazer a seleção da criação do objeto.
     */
    public void generate()  {
        Random random = new Random();
        
        int choice = random.nextInt(17); //
        
        switch ( choice ) {
            case 0 : 
                Knight person = new Knight();
                break;
            case 1 : 
                Knight person = new Knight();
                break;
            case 2 : 
                Knight person = new Knight();
                break;
            case 3 : 
                Knight person = new Knight();
                break;
            case 4 : 
                Knight person = new Knight();
                break;
            case 5 : 
                Knight person = new Knight();
                break;
            case 6 : 
                Knight person = new Knight();
                break;
            case 7 : 
                Knight person = new Knight();
                break;
            case 8 : 
                Knight person = new Knight();
                break;
            case 9 : 
                Knight person = new Knight();
                break;
            case 10 : 
                Knight person = new Knight();
                break;
            case 11 : 
                Knight person = new Knight();
                break;
            case 12 : 
                Knight person = new Knight();
                break;
            case 13: 
                Knight person = new Knight();
                break;
            case 14 : 
                Knight person = new Knight();
                break;
            case 15 : 
                Knight person = new Knight();
                break;
            case 16 : 
                Knight person = new Knight();
                break;
            case 17 : 
                Knight person = new Knight();
                break;
        }
    }

}
