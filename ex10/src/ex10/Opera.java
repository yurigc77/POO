package ex10;
public class Opera 
{
        public void adição(NumeroRacional n1,NumeroRacional n2)
    {
        int n,d;
        
        if(n1.denominador==n2.denominador)
        {
            System.out.println((n1.numerador+n2.numerador)+"/"+n1.denominador);
        }
        else
        {
            if(n1.denominador%n2.denominador==0||n2.denominador%n1.denominador==0)
            {
                if(n1.denominador>n2.denominador)
                {
                    n2.numerador=(n1.denominador/n2.denominador)*n2.numerador;
                    n2.denominador=(n1.denominador/n2.denominador)*n2.denominador;
                   System.out.println((n1.numerador+n2.numerador)+"/"+n1.denominador);
                    
                  //  n=(n1.numerador+n2.numerador); FALT ACHAR UM JEITO DE SIMPLIFICAR ISSO usando o simpli
                  //  d=n1.denominador;
                }
                else
                {
                    n1.numerador=(n2.denominador/n1.denominador)*n1.numerador;
                    n1.denominador=(n2.denominador/n1.denominador)*n1.denominador;
                    System.out.println((n1.numerador+n2.numerador)+"/"+n1.denominador);
                    
                  //  n=(n1.numerador+n2.numerador);
                  //  d=n1.denominador;
                }
            }
            else
            {
                System.out.println("Não é possivel somar!!!");
            }
        }
    }
    
    public void subtração(NumeroRacional n1,NumeroRacional n2)
    {
        int n,d;
        
        if(n1.denominador==n2.denominador)
        {
            System.out.println((n1.numerador-n2.numerador)+"/"+n1.denominador);
        }
        else
        {
            if(n1.denominador%n2.denominador==0||n2.denominador%n1.denominador==0)
            {
                if(n1.denominador>n2.denominador)
                {
                    n2.numerador=(n1.denominador/n2.denominador)*n2.numerador;
                    n2.denominador=(n1.denominador/n2.denominador)*n2.denominador;
                   System.out.println((n1.numerador-n2.numerador)+"/"+n1.denominador);
                    
                  //  n=(n1.numerador+n2.numerador); FALT ACHAR UM JEITO DE SIMPLIFICAR ISSO
                  //  d=n1.denominador;
                }
                else
                {
                    n1.numerador=(n2.denominador/n1.denominador)*n1.numerador;
                    n1.denominador=(n2.denominador/n1.denominador)*n1.denominador;
                    System.out.println((n1.numerador-n2.numerador)+"/"+n1.denominador);
                    
                  //  n=(n1.numerador+n2.numerador);
                  //  d=n1.denominador;
                }
            }
            else
            {
                System.out.println("Não é possivel somar!!!");
            }
        }
    }
        
    public void divisão(NumeroRacional n1,NumeroRacional n2)
    {
        int Naux,Daux;
        Naux=n2.denominador;
        Daux=n2.numerador;
        
        System.out.println((Naux*n1.numerador)+"/"+(Daux*n1.denominador));
        
    }
        
    public void multiplição(NumeroRacional n1,NumeroRacional n2)
    {
        System.out.println((n1.numerador*n2.numerador)+"/"+(n1.denominador*n2.denominador));
    }
}
