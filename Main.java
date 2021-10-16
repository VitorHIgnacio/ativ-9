import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //variaveis
   String nome;
   String endereço;
   String telefone;
   //entrada
   System.out.println("Qual seu nome?");
   nome=leitor.next();

   System.out.println("Qual seu endereço?");
   endereço=leitor.next();

   System.out.println("Qual seu telefone?");
   telefone=leitor.next();
   //saida
   System.out.println("Nome: "+nome);
   System.out.println("Endereço: "+endereço);
   System.out.println("telefone: "+telefone);
  }
}