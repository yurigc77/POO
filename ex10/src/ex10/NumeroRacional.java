
package ex10;

public class NumeroRacional 
{
    public int numerador,denominador,x,y=0;

    
    public void simpli()
    {
        this.y=0;
       for(x=2;x<10;x++)
       {
            if(this.numerador%x==0&&this.denominador%x==0)
          {
            this.setNumerador(this.getNumerador()/x);
            this.setDenominador(this.getDenominador()/x);
            this.y=1;
          }
       }
       
       if(this.y==1)
       {
           this.simpli();
       }
    }
    
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public NumeroRacional(int numerador, int denominador) 
    {
        this.numerador = numerador;
        this.denominador = denominador;
        this.simpli();
    }  
}
