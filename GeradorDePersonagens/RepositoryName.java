import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class RepositoryName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RepositoryName {
     
    private ArrayList<String> maleNames;
    private ArrayList<String> femaleNames;
    private ArrayList<String> lastName;
   
    private static final Random rand = new Random();
    
    public RepositoryName() {
        maleNames = new ArrayList<>();
        femaleNames = new ArrayList<>();
        lastName = new ArrayList<>();
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
   
    private void createLastName() {
        this.lastName.add("Mazepa"); 
        this.lastName.add("Bliger");
        this.lastName.add("Arkalis");
        this.lastName.add("Maieski");
        this.lastName.add("Cavalcanti");
        this.lastName.add("Pina");
        this.lastName.add("Strong");
        this.lastName.add("Ambershard");
        this.lastName.add("Graylock");
        this.lastName.add("Swiller");
        this.lastName.add("Targana");
        this.lastName.add("Marczel"); 
        this.lastName.add("Machiro");
        this.lastName.add("Zatchet");
        this.lastName.add("Zethergyll");
        this.lastName.add("Caskajaro");
        this.lastName.add("Coldshore");
        this.lastName.add("Coyle");
        this.lastName.add("Daargen");
        this.lastName.add("Donoghan");
        this.lastName.add("Drumwind");
        this.lastName.add("Grantham");
        this.lastName.add("Falck"); 
        this.lastName.add("Towerfall");
        this.lastName.add("Pyncion");
        this.lastName.add("Kreel");
        this.lastName.add("Kroft");
        this.lastName.add("Pyncion");
        this.lastName.add("Targana");
        this.lastName.add("Ambershard");
        this.lastName.add("Barrelhelm");
        this.lastName.add("Copperhearth");
        this.lastName.add("Deepmiddens");
        this.lastName.add("Drakantal"); 
        this.lastName.add("Evermead");
        this.lastName.add("Zarkanan");
        this.lastName.add("Skandalor");
        this.lastName.add("Silvertarn");
        this.lastName.add("Rockharvest");
        this.lastName.add("Ramcrown");
        this.lastName.add("Markolak");
        this.lastName.add("Irongull");
        this.lastName.add("Hackshield");
        this.lastName.add("Grimtor");
        this.lastName.add("Garkalan"); 
        this.lastName.add("Lantherval");
        this.lastName.add("Lorhalien");
        this.lastName.add("Maldranthe");
        this.lastName.add("Shalbarain");
        this.lastName.add("Sirothian");
        this.lastName.add("Starfeon");
        this.lastName.add("Zolerii");
        this.lastName.add("Autumnloft");
        this.lastName.add("Balefrost");
        this.lastName.add("Briarfell");
        this.lastName.add("Evenwind"); 
        this.lastName.add("Graytrails");
        this.lastName.add("Mooncairn");
        this.lastName.add("Riverwall");
        this.lastName.add("Stormwolf");
        this.lastName.add("Summergale");
        this.lastName.add("Sunshadow");
        this.lastName.add("Woodenhawk");
        this.lastName.add("Angler");
        this.lastName.add("Battlestone");
        this.lastName.add("Blackwater");
        this.lastName.add("Daggersharp"); 
        this.lastName.add("Paradise");
        this.lastName.add("Deepstrider");
        this.lastName.add("Hollowpot");
        this.lastName.add("Puddle");
        this.lastName.add("Raftmite");
        this.lastName.add("Skiprock");
        this.lastName.add("Silverfin");
        this.lastName.add("Tanglestrand");
        this.lastName.add("Tricker");
        this.lastName.add("Willowrush");
        this.lastName.add("Yellowcrane"); 
        this.lastName.add("Amarzian");
        this.lastName.add("Carnago");
        this.lastName.add("Domarien");
        this.lastName.add("Iscitan");
        this.lastName.add("Meluzan");
        this.lastName.add("Menetrian");
        this.lastName.add("Paradas");
        this.lastName.add("Romazi");
        this.lastName.add("Sarzan");
        this.lastName.add("Serechor");
        this.lastName.add("Shadowhorn"); 
        this.lastName.add("Szereban");
        this.lastName.add("Torzalan");
        this.lastName.add("Trelenus");
        this.lastName.add("Trevethor");
        this.lastName.add("Tryphon");
        this.lastName.add("Vadu");
        this.lastName.add("Vrago");
        this.lastName.add("Black");
        this.lastName.add("Queiroz");
        this.lastName.add("Saerthzal");
        this.lastName.add("Plunder"); 
        this.lastName.add("Demonskull");
        this.lastName.add("Silva");
        this.lastName.add("Loch");
        this.lastName.add("Halendros");
        this.lastName.add("Knife");
        this.lastName.add("Xavier");
        this.lastName.add("Paiva");
        this.lastName.add("Mordock");
        this.lastName.add("Mish");
        this.lastName.add("Ortis");
        this.lastName.add("Maldonato"); 
        this.lastName.add("Malfroi");
        this.lastName.add("Potter");
        this.lastName.add("Jeff");
        this.lastName.add("Smit");
        this.lastName.add("Jobs");
        this.lastName.add("Gates");
        this.lastName.add("Wozniak");
        this.lastName.add("Cook");
        this.lastName.add("Blamer");
        this.lastName.add("Bonaparte");
    }
    
    /**
     * O método retorna um nome aleatorio masculino ou feminino dependendo do genero
     * que será passado pelo personagem como parametro.
     */
    public String getName(char genero) {
        if (genero == 'm'){
          createMaleNames();
          return this.maleNames.get(rand.nextInt(this.maleNames.size())); 
        }
        
        createFemaleNames();
        return this.femaleNames.get(rand.nextInt(this.femaleNames.size()));
    }
   
    public String getLastName() {
        createLastName();
        return this.lastName.get(rand.nextInt(this.lastName.size())); 
    }
}
