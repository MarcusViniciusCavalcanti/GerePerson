
/**
 *
 * Crie uma classe que representa um Produto do mundo real, está deve possuir as seguintes definições:
 * a. Os atributos para representar o nome do produto, o preço de custo e o preço de venda;
 * b. Um construtor que receba três parâmetros para inicializar os valores dos atributos;
 * c. Um método que retorna a margem de lucro do produto (diferença entre o preço de venda e preço de custo);
 * d. Um método que retorna a margem de lucro em porcentagem;
 * e. Um método que altera o preço de venda do produto de acordo com uma porcentagem de lucro.
 * f. Os acessadores (gets) e modificadores (sets) para os atributos preço de custo e preço de venda;

   Observações:
        - Tanto preço de venda quanto o preço de custo não podem ser menores que zero.
        - O preço de venda não pode ser menor que o preço de custo.
        
   ATENÇÃO: ENTENDA A SOLUÇÃO E IMPLEMENTE A CLASSE PRINCIPAL PARA TESTAR A CLASSE PRODUTO.
 */
public class Produto
{
<<<<<<< HEAD
    private int ia;
=======
    private int ib;
>>>>>>> 835c1d68056e4135d95403d73dc987db859e1c86
    private String nome;
    private double precoDeCusto;
    private double precoDeVenda;
    
    public Produto(String nome, double precoDeCusto, double precoDeVenda) {
        this.nome = nome;
        setPrecoDeCusto(precoDeCusto);
        setPrecoDeVenda(precoDeVenda);
    }
    
    public void setPrecoDeVenda(double precoDeVenda) {
        if (precoDeVenda > 0 && precoDeVenda > this.precoDeCusto) {
            this.precoDeVenda = precoDeVenda;
        }
    }
    
    public double getPrecoDeVenda() {
        return this.precoDeVenda;
    }
    
    public void setPrecoDeCusto(double precoDeCusto) {
        if (precoDeCusto > 0) {
            double porcentagemDelucroAtual = getPorcentagemDeLucro();
            this.precoDeCusto = precoDeCusto;
            alteraPrecoDeVendaPelaPorcentagemDeLucro(porcentagemDelucroAtual);
        }
    }
    
    public double getPrecoDeCusto() {
        return this.precoDeCusto;
    }
    
    public double getMargemDeLucro() {
        return this.precoDeVenda - this.precoDeCusto;
    }
    
    public double getPorcentagemDeLucro() {
        return getMargemDeLucro() / this.precoDeCusto * 100;
    }
    
    public void alteraPrecoDeVendaPelaPorcentagemDeLucro(double porcentagem) {
        if (porcentagem > 0) {
            this.precoDeVenda =  this.precoDeCusto + (this.precoDeCusto * porcentagem/100);
        }
    }
}
