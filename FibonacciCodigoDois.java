import java.util.Scanner;

public class FibonacciCodigoDois {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci:");
      int numero = scanner.nextInt();
      
      int a = 0;
      int b = 1;
      
      if (numero == a || numero == b) {
         System.out.println(numero + " pertence à sequência de Fibonacci.");
         return;
      }
      
      int fib = a + b;
      while (fib <= numero) {
         if (fib == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
            return;
         }
         a = b;
         b = fib;
         fib = a + b;
      }
      
      System.out.println(numero + " não pertence à sequência de Fibonacci.");
   }
}
