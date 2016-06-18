
/**
 * Write a description of class TesteSecundarySkill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesteSecundarySkill
{
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            Person person = new Lacquey();
            
            // System.out.println("Empatia com animais: " + person.getExpertise(0) );
            // System.out.println("        Arqueirismo: " + person.getExpertise(1) );
            // System.out.println("         Artesanato: " + person.getExpertise(2) );
            // System.out.println("           Etiqueta: " + person.getExpertise(3) );
            // System.out.println("         Herborismo: " + person.getExpertise(4) );
             System.out.println("      Armas brancas: " + person.getExpertise(5) );            
            // System.out.println("             Música: " + person.getExpertise(6) );
            // System.out.println("           Cavalgar: " + person.getExpertise(7) );
            // System.out.println("        Furtividade: " + person.getExpertise(8) );
            // System.out.println("      Sobrevivência: " + person.getExpertise(9) );                     
        }
    }
}
