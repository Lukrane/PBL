package PBL06;

public class Vestido extends Roupa{
    private String marca;
    private String nome;
    private float preco;
    Vestido(String cor, String nome, String marca, String tamanho, float preco){
        this.cor = cor;
        this.nome = nome;
        this.marca = marca; 
        this.tamanho = tamanho;
        this.preco = preco;
    }
    public Float calcularPrecoFinal(float acrescimo){
        float precof = preco + acrescimo;

        return(precof-(precof * 0.20f));
    }
    public void setPreco(float preco) {
        preco = this.preco;
    }
    public String getMarca() {
        return marca;
    }
    public String getNome() {
        return nome;
    }
    public Float getPreco() {
        return preco;
    }
}
