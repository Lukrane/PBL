package Cadastro;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int loop = 1;
    int task; 
    int cont = 0;
    int cargo;
    Pessoa pessoas[] = new Pessoa[50];
    Pessoa dados;
    Scanner scanner = new Scanner(System.in) ;
        while(loop == 1){
          
        
          System.out.println("O que fazer? Cadastro = 1, Listar = 2, Buscar = 3");
          task = scanner.nextInt();

          if (task == 1){
            dados = Pessoa.cadastrar();
            pessoas[cont] = new Pessoa(dados.nome, dados.idade, dados.tipo);
            cont += 1;
          }
          if (task == 2){
            for (int i = 0; i < pessoas.length; i++)
                if (pessoas[i] != null)
                    System.out.println(pessoas[i].nome);
          }
          if (task == 3){
            System.out.println("Qual o tipo de função será procurada? 1 para cliente, 2 para funcionário, 3 para gerente");
            cargo = scanner.nextInt();
            scanner.nextLine();
            if (cargo == 1){
                for (int i = 0; i < pessoas.length; i++){
                    if (pessoas[i] != null){
                        if (pessoas[i].tipo == "cliente"){
                            System.out.println(pessoas[i].nome);
                        }
                    }
                  }
            }
            else if (cargo == 2){
                for (int i = 0; i < pessoas.length; i++){
                    if (pessoas[i] != null){
                        if (pessoas[i].tipo == "funcionário"){
                            System.out.println(pessoas[i].nome);
                        }
                    }
                  }
            }
            else if (cargo == 3){
                for (int i = 0; i < pessoas.length; i++){
                    if (pessoas[i] != null){
                        if (pessoas[i].tipo == "gerente"){
                            System.out.println(pessoas[i].nome);
                        }
                    }
                  }
            }
          }
        }
    
  }
}
