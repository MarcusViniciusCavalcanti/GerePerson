import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Write a description of class CreatTxt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateTxt {
    private FileWriter file;
    private PrintWriter recordFile;
    private String filePath;
    private String fileName;
    
    public CreateTxt(String fileName, String filePath, String content) {
        setFileName(fileName);  // gera o nome do arquivo.
        toFilePath(filePath);   // define o caminho do arquivo.  
        
        createFile();
        recordFile(content);
    }
    
    /**
     * Cria o arquivo txt.
     */
    private void createFile(){
        
        /*
         * APAGAR DEPOIS DE ENTENDER.
         * bloco try catch e como será tratado o erro caso algum problema
         * aconteça, como estamos lidando com criação de arquivos
         * o java não termite que algo assim compile sem tratamento
         * de erro.
         * try = caso tudo certo faça isso
         * catch = caso de errao faça iss
         * Exception = tipo do objeto que vai tratar e uma classa importada
         * tipo ArrayList 
         * e = variável to tipo exception que vai manipular
         * no caso botei um janela de erro caso aconteça isso.
         */
        try {
            this.file = new FileWriter(this.filePath + this.fileName);
        }
        catch (Exception e) {
            
        }
    }
    
    private void recordFile(String content) {
        this.recordFile = new PrintWriter(this.file);
        
        this.recordFile.printf(content);
        
        this.recordFile.close();
    }
        
    /**
     * Define o caminho da pasta que será gravado o arquivo.
     */
    private void toFilePath(String path) {
        this.filePath = path;
    }
    
    /**
     * Gera o nome do arquivo baseado no nome do personagem.
     */
    private void setFileName(String fileName) {
        this.fileName = fileName + ".txt";
    }
}

