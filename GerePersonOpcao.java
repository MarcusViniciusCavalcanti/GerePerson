import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class GerePerson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GerePersonOpcao {
    public static void main(String[] args) {  
        Scanner read = new Scanner(System.in);
        Random  rand = new Random();
        
        header();
        System.out.println("deseja gerar um arquivo TXT com os dados do personagem? \n Sim[s]\nNão[n]");
        System.out.print("O que deseja fazer? ");
        char txtOp = read.next().charAt(0);
        boolean generateTxt = false;
            switch (txtOp) {
                case 's': case 'S':
                    generateTxt = true;
                    break;
                case 'n': case 'N':
                    generateTxt = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        
        boolean exit = false;
        boolean header = false;
        while (exit == false) {
            
            if ( header )
              header();
                           
            int aux = 0;
            aux = rand.nextInt(3);
            Person person = null;
            
            switch (aux) {
                case 0:
                    person = new Knight();
                    break;
                case 1:
                    person = new Craftsman();
                    break;
                case 2:
                    person = new Artist();
                    break;
                case 3:
                    person = new Mumper();
                    break;
                case 4:
                    person = new Royal();
                    break;
                case 5:
                    person = new Merchant();
                    break;
                case 6:
                    person = new Bum();
                    break;
                 case 7:
                     person = new Cleric();
                     break;
                 case 8:
                     person = new Royal();
                     break;
                 case 9:
                     person = new Soldier();
                     break;
                 case 10:
                     person = new Erudite();
                     break;
                case 11:
                     person = new Heretic();
                     break;
                case 12:
                     person = new Farmer();
                     break;
                case 13:
                     person = new Pilgrim();
                     break;
                case 14:
                     person = new Lacquey();
                     break;
                case 15:
                     person = new Foreign();
                     break;
            }
              
            System.out.println(person);
            
            if ( generateTxt ) {
               String content = person.toString();
               CreateTxt txt = new CreateTxt(person.getName() + " " + person.getLastName(), content);
               System.out.println("Gerando personagem com arquivo txt");
            }
            else
                System.out.println("Gerando personagem sem arquivo txt");
            
            System.out.println();
            System.out.println("deseja criar outro personagem? \n Sim[s]\n Não[n]");
            System.out.print("O que deseja fazer? ");
            char op = read.next().charAt(0);
            switch (op) {
                case 's': case 'S':
                    exit = false;
                    header = true;
                    break;
                case 'n': case 'N':
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.print("\f");
        }
    }
    
    public static void header() {
        System.out.println( "########################################################################\n"
                           + "#                                                                      #\n" 
                           + "#                       Gerador de Personagem                          #\n"
                           + "#                                                                      #\n"
                           + "########################################################################\n"+ "\n\n");
    }
}
