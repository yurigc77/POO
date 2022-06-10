package ex123;
public class Bola 
{
    private String cor;

    private String getCor() 
    {
        return cor;
    }

    private void setCor(String cor) 
    {
        this.cor = cor;
    }
    
    public void qcor()
    {
        System.out.println("cor:"+this.getCor());
    }
    
    public void mudarCor(String cor)
    {
        this.setCor(cor);
    }
    
    public Bola(String cor)
    {
        this.setCor(cor);
    }
    
}
