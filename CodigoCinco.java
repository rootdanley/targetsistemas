import java.util.Scanner;

public class CodigoCinco {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite uma string:");
      String original = scanner.nextLine();
      StringBuilder invertida = new StringBuilder();
      
      for (int i = original.length() - 1; i >= 0; i--) {
         invertida.append(original.charAt(i));
      }
      
      System.out.println("String original: " + original);
      System.out.println("String invertida: " + invertida.toString());
   }
   
}

