import java.util.Random;

public class MatrizAleatoria
{
   private final int L, C;
   private int m[][];

   public MatrizAleatoria(int linhas, int colunas)
   {
      this.L = linhas;
      this.C = colunas;
      Random gerador = new Random();

      this.m = new int[L][C];
      for (int i = 0; i < this.L; i++)
         for (int j = 0; j < this.C; j++)
            this.m[i][j] = gerador.nextInt(100);
            // gera inteiros entre 0 e 99
   }

   public void exibeMatriz()
   {
      for (int i = 0; i < this.L; i++)
      {
         for (int j = 0; j < this.C; j++)
            System.out.print(this.m[i][j] + "\t");
            // tabulação
         System.out.println();
      }
   }

   public String toString()
   {
      String aux = "";

      for (int i = 0; i < this.L; i++)
      {
         for (int j = 0; j < this.C; j++)
            aux = aux + this.m[i][j] + "\t";
         aux = aux + "\n";
      }

      return aux;
   }
}