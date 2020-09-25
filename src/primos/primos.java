package primos;

import java.util.Scanner; //importamos una libreria 
public class primos {
	
	public static void main (String [ ] args) 
    {
         Scanner z = new Scanner(System.in); //pedimos que ingrese el numero al cuál queremos descomponer
         System.out.println("Escribe un numero para sacar sus factores primos");
         int numero = z.nextInt();
         factor(numero);
    }

    static void factor(int numero)
    {
         int num = 2; // el factor siempre empieza en 2

         while(numero!=1) 
         {
              while(numero%num==0)
              {
                   System.out.println(num); //se imprimen los resultados
                   numero /= num;
                   
              }
              num++;
         }
    }
}
