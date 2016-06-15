
/**
 * Write a description of class Attribute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attribute {

    private String name;
    private int value;

    public Attribute(String name) {
        this.value = 1;
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
    
    private void setName(String name) {
        this.name = name;
    }

    public void addValue(int value) {
        this.value = value;
    }
}
