import java.util.Scanner;
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
        
        
        System.out.println("########################################################################");
        System.out.println("#                                                                      #");
        System.out.println("#                       Gerador de Personagem                          #");
        System.out.println("#                                                                      #");
        System.out.println("########################################################################");
        System.out.println();
        
        boolean exit = false;
        while (exit == false) {
            Person person = new Knight();
            
            System.out.println("nome: " + person.getName() + " " + person.getLastName() + "\t\t" + "Conceito: "+ person.getConcept() + "\t\t" + "Idade: " + person.getAge());
            System.out.println();
        
            System.out.println("                                   ----------- A T R I B U T O S -----------\n\n");             
            System.out.println("   Força: " + person.getPhysical(0) + "\t\t\t\t" + "    Carisma: " + person.getSocial(0) + "\t\t      " + "   Percepção: " + person.getMental(0));
            System.out.println("Destreza: " + person.getPhysical(1) + "\t\t\t\t" + "Manipulação: " + person.getSocial(1) + "\t\t      " + "Inteligência: " + person.getMental(1));
            System.out.println("   Vigor: " + person.getPhysical(2) + "\t\t\t\t" + "  Aparência: " + person.getSocial(2) + "\t\t      " + "  Raciocínio: " + person.getMental(2));

            System.out.println("\n\n                                 ----------- H A B I L I D A D E S -----------\n\n");
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
            System.out.println("                        " + person.getWillPower());
            
            
            
            System.out.println("deseja criar outro personagem? \n Sim[s]\n Não[n]");
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
