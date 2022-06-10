package ex7;

public class Frentista 
{
    public void encher(Bomba b)
    {
        b.combustivel=b.getCapacidade();
    }
    
    public void abasV(Bomba b,float v)
    {
        b.setCombustivel(b.getCombustivel()-(v/b.getPreco()));
    }
    
    public void abasL(Bomba b,float l)
    {
        b.setCombustivel(b.getCombustivel()-l);
    }
    
    public void status(Bomba b)
    {
        System.out.println("CAPACIDADE:"+b.getCapacidade());
        System.out.println("COMBUSTIVEL ATUAL:"+b.getCombustivel());
        System.out.println("PREÇO:"+b.getPreco());
    }
}
