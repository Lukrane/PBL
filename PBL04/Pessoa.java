package Cadastro;
import java.util.Scanner;


public class Pessoa {
  public Pessoa(String nome, int idade, String tipo){
      this.nome = nome;
      this.idade = idade;
      this.tipo = tipo;
    }
  static Scanner scanner = new Scanner(System.in);
  String nome;
  int idade;
  String tipo; 
  static String nometemp;
  static int idadetemp;
  static int tipotemp;
  static String funcao;


  public static Pessoa cadastrar(){
    System.out.println("Qual sua função? 1 para cliente, 2 para funcionário, 3 para gerente");
    tipotemp = scanner.nextInt();
    System.out.println("Digite sua idade: ");
    idadetemp = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Digite seu nome: ");
    nometemp = scanner.nextLine();
    
    
    if (tipotemp == 1){
      funcao = "cliente";
    }
    else if (tipotemp == 2){
      funcao = "funcionário";
    }
    else if (tipotemp == 3){
      funcao = "gerente";
    }
    System.out.print(nometemp + " " + idadetemp + " " + funcao);
    System.out.println(", confirma? 1 para não, 2 para sim");
    int salvar = scanner.nextInt();
    if (salvar == 2){
      return new Pessoa(nometemp, idadetemp, funcao);

    } else {
      return null;
    }
  }
  
}
