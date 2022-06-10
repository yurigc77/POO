package ex4;
public class Pessoa 
{
    public String nome;
    public int idade;
    public float peso;
    public float altura;

    public void envelhecer()
    {
        this.setIdade(this.getIdade()+1);
        if(this.getIdade()<21)
        {
            this.setAltura((float) (this.getAltura()+1.5));
        }
    }
    
    public void emagrecer()
    {
        this.setPeso(this.getPeso()-1);
    }
    
    public void engordar()
    {
        this.setPeso(this.getPeso()+1);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public Pessoa(String nome,int idade,float peso,float altura)
    {
        this.nome=nome;
        this.idade=idade;
        this.peso=peso;
        this.altura=altura;
    }
}
