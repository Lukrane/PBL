package PBL06;

public class Main {
    public static void main(String[] args) {
        Camisa camisa = new Camisa("azul", "camisa", "123", "M", 99.99f);
        Vestido vestido = new Vestido("vermelho", "vestido", "456", "P", 109.99f);
        Calca calca = new Calca("preto", "calça", "789", "G", 79.99f);
        System.out.println(calca.calcularPrecoFinal(5));
        System.out.println(camisa.calcularPrecoFinal(5));
        System.out.println(vestido.calcularPrecoFinal(5));
      }
}
