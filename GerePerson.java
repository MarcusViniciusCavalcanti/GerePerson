import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class GerePerson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GerePerson
{   
    public static void main(String[] args) {  
        Scanner read = new Scanner(System.in);
        Random  rand = new Random();
        
        
        System.out.println("########################################################################");
        System.out.println("#                                                                      #");
        System.out.println("#                       Gerador de Personagem                          #");
        System.out.println("#                                                                      #");
        System.out.println("########################################################################");
        System.out.println();
        
        boolean exit = false;
        while (exit == false) {
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
//                case 11:
//                     person = new Knight();
//                     break;
//                case 12:
//                     person = new Knight();
//                     break;
//                case 13:
//                     person = new Knight();
//                     break;
//                case 14:
//                     person = new Knight();
//                     break;
//                case 15:
//                     person = new Knight();
//                     break;
//                case 16:
//                     person = new Knight();
//                     break;
            }
            
            System.out.println("nome: " + person.getName() + " " + person.getLastName() + "\t\t" + "Conceito: "+ person.getConcept() + "\t\t" + "Idade: " + person.getAge());
            System.out.println();
        
            System.out.println("                                   ----------- A T R I B U T O S -----------\n\n"); 
            System.out.println("     Físicos    \t\t\t Sociais \t\t\t\t Mentais\n");
            System.out.println("   Força: " + person.getPhysical(0) + "\t\t\t\t" + "    Carisma: " + person.getSocial(0) + "\t\t      " + "   Percepção: " + person.getMental(0));
            System.out.println("Destreza: " + person.getPhysical(1) + "\t\t\t\t" + "Manipulação: " + person.getSocial(1) + "\t\t      " + "Inteligência: " + person.getMental(1));
            System.out.println("   Vigor: " + person.getPhysical(2) + "\t\t\t\t" + "  Aparência: " + person.getSocial(2) + "\t\t      " + "  Raciocínio: " + person.getMental(2));

            System.out.println("\n\n                                 ----------- H A B I L I D A D E S -----------\n\n");
            System.out.println("     Talentos    \t\t\t Perícias \t\t\t\t Conhecimentos\n");
            System.out.println("Representação: " + person.getTalent(0) + "\t\t" + "Empatia com animais: " + person.getExpertise(0) + "\t\t" + "        Instrução: " + person.getKnowledge(0));
            System.out.println("    Prontidão: " + person.getTalent(1) + "\t\t" + "        Arqueirismo: " + person.getExpertise(1) + "\t\t" + "Sabedoria popular: " + person.getKnowledge(1));
            System.out.println("     Esportes: " + person.getTalent(2) + "\t\t" + "         Artesanato: " + person.getExpertise(2) + "\t\t" + "     Investigação: " + person.getKnowledge(2));
            System.out.println("        Briga: " + person.getTalent(3) + "\t\t" + "           Etiqueta: " + person.getExpertise(3) + "\t\t" + "          Direito: " + person.getKnowledge(3));
            System.out.println("      Esquiva: " + person.getTalent(4) + "\t\t" + "         Herborismo: " + person.getExpertise(4) + "\t\t" + "      Linguística: " + person.getKnowledge(4));
            System.out.println("      Empatia: " + person.getTalent(5) + "\t\t" + "      Armas brancas: " + person.getExpertise(5) + "\t\t" + "         Medicina: " + person.getKnowledge(5));            
            System.out.println("  Intimidação: " + person.getTalent(6) + "\t\t" + "             Música: " + person.getExpertise(6) + "\t\t" + "        Ocultismo: " + person.getKnowledge(6));
            System.out.println("        Crime: " + person.getTalent(7) + "\t\t" + "           Cavalgar: " + person.getExpertise(7) + "\t\t" + "          Polícia: " + person.getKnowledge(7));
            System.out.println("    Liderança: " + person.getTalent(8) + "\t\t" + "        Furtividade: " + person.getExpertise(8) + "\t\t" + "          Ciência: " + person.getKnowledge(8));
            System.out.println("        Lábia: " + person.getTalent(9) + "\t\t" + "      Sobrevivência: " + person.getExpertise(9) + "\t\t" + "       Senescália: " + person.getKnowledge(9));          
            System.out.println();
            
            System.out.println("                        Força de Vontade:");
            System.out.println("                            " + person.getWillPower());
            System.out.print("\n\n");
            
            System.out.println("deseja gerar um arquivo TXT com os ados do personagem? \n Sim[s]\nNão[n]");
            System.out.print("O que deseja fazer? ");
            char txtOp = read.next().charAt(0);
            String content;
            switch (txtOp) {
                case 's': case 'S':
                    content = "--------------------------- Gerador de Personagem ---------------------------\n" + "\n\n" +
                                "nome: " + person.getName() + " " + person.getLastName() + "\t\t" + "Conceito: "+ person.getConcept() + "\t\t" + "Idade: " + person.getAge() +"\n" + "\n" +
                                "                                   ----------- A T R I B U T O S -----------\n\n" + 
                                "     Físicos   \t\t\tSociais \t\t\t     Mentais\n" + 
                                "   Força: " + person.getPhysical(0) + "\t\t" + "    Carisma: " + person.getSocial(0) + "\t\t      " + "   Percepção: " + person.getMental(0) + "\n" +
                                "   Força: " + person.getPhysical(0) + "\t\t" + "    Carisma: " + person.getSocial(0) + "\t\t      " + "   Percepção: " + person.getMental(0) + "\n" +
                                "Destreza: " + person.getPhysical(1) + "\t\t" + "Manipulação: " + person.getSocial(1) + "\t\t      " + "Inteligência: " + person.getMental(1) + "\n" +
                                "   Vigor: " + person.getPhysical(2) + "\t\t" + "  Aparência: " + person.getSocial(2) + "\t\t      " + "  Raciocínio: " + person.getMental(2) + "\n" +
                                "\n\n                                 ----------- H A B I L I D A D E S -----------\n\n" +
                                "     Talentos    \t\t\t Perícias \t\t\t      Conhecimentos\n" +
                                "Representação: " + person.getTalent(0) + "\t\t" + "Empatia com animais: " + person.getExpertise(0) + "\t\t" + "        Instrução: " + person.getKnowledge(0) + "\n" +
                                "    Prontidão: " + person.getTalent(1) + "\t\t" + "        Arqueirismo: " + person.getExpertise(1) + "\t\t" + "Sabedoria popular: " + person.getKnowledge(1) + "\n" +
                                "     Esportes: " + person.getTalent(2) + "\t\t" + "         Artesanato: " + person.getExpertise(2) + "\t\t" + "     Investigação: " + person.getKnowledge(2) + "\n" +
                                "        Briga: " + person.getTalent(3) + "\t\t" + "           Etiqueta: " + person.getExpertise(3) + "\t\t" + "          Direito: " + person.getKnowledge(3) + "\n" +
                                "      Esquiva: " + person.getTalent(4) + "\t\t" + "         Herborismo: " + person.getExpertise(4) + "\t\t" + "      Linguística: " + person.getKnowledge(4) + "\n" +
                                "      Empatia: " + person.getTalent(5) + "\t\t" + "      Armas brancas: " + person.getExpertise(5) + "\t\t" + "         Medicina: " + person.getKnowledge(5) + "\n" +  
                                "  Intimidação: " + person.getTalent(6) + "\t\t" + "             Música: " + person.getExpertise(6) + "\t\t" + "        Ocultismo: " + person.getKnowledge(6) + "\n" +
                                "        Crime: " + person.getTalent(7) + "\t\t" + "           Cavalgar: " + person.getExpertise(7) + "\t\t" + "          Polícia: " + person.getKnowledge(7) + "\n" +
                                "    Liderança: " + person.getTalent(8) + "\t\t" + "        Furtividade: " + person.getExpertise(8) + "\t\t" + "          Ciência: " + person.getKnowledge(8) + "\n" +
                                "        Lábia: " + person.getTalent(9) + "\t\t" + "      Sobrevivência: " + person.getExpertise(9) + "\t\t" + "       Senescália: " + person.getKnowledge(9) + "\n" +      
                                "\n\t\t\t\t\tForça de Vontade:" + "\n" +
                                "\t\t\t\t\t    " + person.getWillPower() +
                                "\n\n";
                    CreateTxt txt = new CreateTxt(person.getName() + " " + person.getLastName(), content);
                    break;
                case 'n': case 'N':
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            System.out.print("\n\n");
            
            System.out.println("deseja criar outro personagem? \n Sim[s]\n Não[n]");
            System.out.print("O que deseja fazer? ");
            char op = read.next().charAt(0);
            switch (op) {
                case 's': case 'S':
                    exit = false;
                    break;
                case 'n': case 'N':
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
    }
}
