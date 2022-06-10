package ex5;

public class ContaCorrente 
{
    private float numero;
    private  String nome;
    private float saldo;

    public ContaCorrente(int num, String no)
    {
        numero = num;
        nome = no;
        this.saldo = 0;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void consulta()
    {
        System.out.println("NOME:" + this.getNome());
        System.out.println("NUMERO DA CONTA:" +this.getNumero());
        System.out.println("SALDO:" + this.getSaldo());
    }
    public void deposito(float d)
    {
        this.setSaldo(this.getSaldo()+d);
    }
    
    public void saque(float s)
    {
        if (this.getSaldo()<s)
        {
            System.out.println("ERRO!!");
        }
        else 
        {
            this.setSaldo(this.getSaldo()-s);
        }
    }
}

