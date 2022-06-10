package ex123;

public class Retangulo 
{
    public int altura;
    public int largura;
    public int area;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
                  
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void mudarA(int a)
    {
        if(a>1)
        {
            this.setAltura(a);
        }
        else
        {
            System.out.println("valor invalido");
        }
    }
    
    public void mudarL(int l)
    {
        if(l>1)
        {
            this.setLargura(l);
        }
        else
        {
            System.out.println("valor invalido");
        }
    }

    public void calcArea()
    {
        this.setArea((this.getAltura()*this.getLargura())/2);
    }
    
    public Retangulo(int a, int l) 
    {
        if(l>1&&a>1)
        {
            this.altura = a;
            this.largura = l;
        }
        else
        {
            System.out.println("valor invalido");
        }
    }
}
