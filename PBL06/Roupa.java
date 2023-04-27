package PBL06;
abstract class Roupa implements Produto{
    public String tamanho;
    public String cor;
    public abstract Float calcularPrecoFinal(float acrescimo);
}