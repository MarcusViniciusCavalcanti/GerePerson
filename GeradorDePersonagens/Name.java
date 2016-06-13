import java.util.ArrayList;
import java.util.Random;
public class Name {
   private ArrayList<String> maleNames;
   private ArrayList<String> femaleNames;
   
   private static final Random rand = new Random();
   
   /**
    * Construtor
    */
   public Name() {
       this.maleNames = new ArrayList<>();
       this.femaleNames = new ArrayList<>();
   }
   
   /**
    * Se o genero do personagem for masculino ele adiciona a ArrayList de nomes masculinos.
    */
   private void createMaleNames() {
       this.maleNames.add("Aros");
       this.maleNames.add("Lonios");
       this.maleNames.add("Daewron");
       this.maleNames.add("Euturiel");
       this.maleNames.add("Lewis");
       this.maleNames.add("Axel");
       this.maleNames.add("Nembat");
       this.maleNames.add("Xanthus");
       this.maleNames.add("Xenos");
       this.maleNames.add("Caeneus");
       this.maleNames.add("Paul");
       this.maleNames.add("Zeus");
       this.maleNames.add("Ceto");
       this.maleNames.add("Clio");
       this.maleNames.add("Sirius");
       this.maleNames.add("Clayter");
       this.maleNames.add("Tomé");
       this.maleNames.add("Abraham");
       this.maleNames.add("Linus");
       this.maleNames.add("Donatello");
       this.maleNames.add("Rafael");
       this.maleNames.add("Michelangelo");
       this.maleNames.add("Splinter");
       this.maleNames.add("Aspen");
       this.maleNames.add("Tenório");
       this.maleNames.add("Kulak");
       this.maleNames.add("Gilve");
       this.maleNames.add("Thomas");
       this.maleNames.add("Dhonladfu");
       this.maleNames.add("Rian");
       this.maleNames.add("Husky");
       this.maleNames.add("Dusk");
       this.maleNames.add("Flacy");
       this.maleNames.add("Vopru");
       this.maleNames.add("Alki");
       this.maleNames.add("Risko");
       this.maleNames.add("Bart");
       this.maleNames.add("Homer");
       this.maleNames.add("Barney");
       this.maleNames.add("Fred");
       this.maleNames.add("Odin");
       this.maleNames.add("Thor");
       this.maleNames.add("Loki");
       this.maleNames.add("João");
       this.maleNames.add("Galileu");
       this.maleNames.add("Henry");
       this.maleNames.add("Albert");
       this.maleNames.add("Morrice");
       this.maleNames.add("Josué");
       this.maleNames.add("Freud");    
   }
   
   private void createFemaleNames() {
      this.femaleNames.add("Haula");
      this.femaleNames.add("Saal");
      this.femaleNames.add("Zara");
      this.femaleNames.add("Tasa");
      this.femaleNames.add("Helna");
      this.femaleNames.add("Arna");
      this.femaleNames.add("Medusa");
      this.femaleNames.add("Atena");
      this.femaleNames.add("Ninfas");
      this.femaleNames.add("Eutênia");
      this.femaleNames.add("Kera");
      this.femaleNames.add("Diana");
      this.femaleNames.add("Dione");
      this.femaleNames.add("Íris");
      this.femaleNames.add("Vitória");
      this.femaleNames.add("Núbia");
      this.femaleNames.add("Afrodite");
      this.femaleNames.add("Acalantis");
      this.femaleNames.add("Shena");
      this.femaleNames.add("Aska");
      this.femaleNames.add("Nina");
      this.femaleNames.add("Lucy");
      this.femaleNames.add("Valkiria");
      this.femaleNames.add("Kitana");
      this.femaleNames.add("Kira");
      this.femaleNames.add("Azura");
      this.femaleNames.add("Tura");
      this.femaleNames.add("Artana");
      this.femaleNames.add("Fenryl");
      this.femaleNames.add("Zebel");
      this.femaleNames.add("Elseone");
      this.femaleNames.add("Arlequina");
      this.femaleNames.add("Zereni");
      this.femaleNames.add("Irva");
      this.femaleNames.add("Affyria");
      this.femaleNames.add("Samantha");
      this.femaleNames.add("Zaidi");
      this.femaleNames.add("Nerica");
      this.femaleNames.add("Hacari");
      this.femaleNames.add("Lachira");
      this.femaleNames.add("Vane");
      this.femaleNames.add("Aléxia");
      this.femaleNames.add("Troia");
      this.femaleNames.add("Vexia");
      this.femaleNames.add("Lyfalia");
      this.femaleNames.add("Taris");
      this.femaleNames.add("Taline");
      this.femaleNames.add("Moriel");
      this.femaleNames.add("Ramona");
      this.femaleNames.add("Pharana");
   }
   
   /**
    *   O método retorna um nome aleatorio masculino ou feminino dependendo do genero
    *   que será passado pelo personagem como parametro.
    */
   public String getName(char genero) {
      if (genero == 'm'){
         createMaleNames();
         return this.maleNames.get(rand.nextInt(this.maleNames.size())); 
      }
      createFemaleNames();
      return this.femaleNames.get(rand.nextInt(this.femaleNames.size()));
   }
   
   public void getQuantidadeNomes() {
      System.out.println(this.femaleNames.size());
   }
}