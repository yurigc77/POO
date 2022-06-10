package ex7;

public class Bomba 
{
    public float capacidade;
    public float preco;
    public float combustivel;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }
   
    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

   public Bomba(float c,float p)
   {
       this.capacidade=c;
       this.preco=p;
       this.combustivel=c;
   }  
}
