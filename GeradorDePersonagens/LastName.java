import java.util.ArrayList;
import java.util.Random;
public class LastName {
   private ArrayList<String> lastName;
   
   private static final Random rand = new Random();
   
   /**
    * Construtor
    */
   public LastName() {
       this.lastName = new ArrayList<>();
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
   
   public String getLastName() {
      createLastName();
      return this.lastName.get(rand.nextInt(this.lastName.size())); 
   }
}