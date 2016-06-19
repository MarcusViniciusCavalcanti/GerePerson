import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Write a description of class CreatTxt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateTxt {
    private File path;
    private FileWriter file;
    private PrintWriter recordFile;
    private String filePath;
    private String fileName;
    
    public CreateTxt(String fileName, String content) {
        createPath();           // cria pasta para os arquivos na raiz da aplicação.
        createFile(fileName);   // gera o nome do arquivo.
        recordFile(content);    // escreve dados no arquivo txt.

    }
        
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
            file =  new FileWriter("ArquivosTXT" +"/"+ fileName + ".txt");
            return true;
        }
        catch(IOException ex) {
            return false;
        }
    }
}

