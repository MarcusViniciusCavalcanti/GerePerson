import java.util.ArrayList;
/**
 * 
 */
public class Expertise {
    private String[] names = {
        "Empatia com animais", "Arqueirismo",
        "Artesanato", "Etiqueta",
        "Herborismo", "Armas brancas",
        "Música", "Cavalgar",
        "Furtividade", "Sobrevivência"
    };

    private String name;
    private int value;

    /**
     * Construtor:
     * Inicializa a lista de péricias baseado
     * na quantidade de habilidades presentes.
     */
    public Expertise(int index) {
        setSkill(index);
    }

    public String getNameSkill(int asSkill) {
        return this.name;
    }
    
    public int getValue(int asSkill) {
        return this.value;
    }

    public void addPoints(int value) {
        this.value = value;
    }

    private void setSkill(int index) {
        /*
	     * a variável i seleciona a posição do nome da habilidade
	     * de forma dinâmica caso adicionar mais um elemento, só adicionar
	     * a lista de String mais um elemento.
	     */
	    this.name = names[index];
    }
}
