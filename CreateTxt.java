import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Gera um arquivos .txt com todas as informações do personagem.
 * 
 * @author (Matheus Mazepa e Vinicius Cavalcanti) 
 * @version (19.06.2016)  
 */
public class CreateTxt {
    private File path;
    private FileWriter file;
    private PrintWriter recordFile;
    private String filePath;
    private String fileName;
    
    /**
     * Construtor: Cria a pasta para os arquivos na raiz da aplicação.
     * Chama o método que gera o nome do arquivo.
     * Chama o método que escreve dados no arquivo txt.
     * @param: Nome do arquivo.
     * @param: Dados do arquivo.
     */
    public CreateTxt(String fileName, String content) {
        createPath();           
        createFile(fileName);   
        recordFile(content);    

    }
        
    /**
     * Método que escreve dados no arquivo txt.
     * @param: Conteúdo do arquivo .txt.
     */
    public void recordFile(String content) {
       recordFile = new PrintWriter(file);
       recordFile.printf(content);
       recordFile.close();
    }
        
    /**
     * Gera pasta na raiz da aplicação com o nome ArquivosTXT
     */
    private void createPath() {
       this.path = new File("ArquivosTXT");
       this.path.mkdir();
    }
    
    /**
     * Gera o nome do arquivo baseado no nome do personagem.
     * @param: nome do arquivo
     * @return: se criado com sucesso verdadeiro falso se não foi gerado.
     */
    private boolean createFile(String fileName) {
        try {
            file =  new FileWriter("ArquivosTXT" +"/"+ fileName + ".txt");
            return true;
        }
        catch(IOException ex) {
            return false;
        }
    }
}

