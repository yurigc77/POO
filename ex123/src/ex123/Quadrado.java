package ex123;

public class Quadrado 
{
    private int lado;
    private int area;

    public int getLado()
    {
        return lado;
    }

    public void setLado(int lado) 
    {
        this.lado = lado;
    }

    public int getArea() 
    {
        return area;
    }

    public void setArea(int area) 
    {
        this.area = area;
    }
    
    public void calcArea()
    {
        this.setArea(this.getLado()*this.getLado());   
    }
    
    public void mudarLado(int l)
    {
        if(l>0)
        {
            this.setLado(l);
        }
        else
        {
            System.out.println("valor invalido");
        }
    }
    
    public Quadrado(int l)
    {
        if(l<1)
        {
            System.out.println("valor invalido");
        }
        else
        {
            this.setLado(1);
            this.calcArea();
        }
        
    }
    
}
