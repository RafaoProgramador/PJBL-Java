import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

class petShop{
//private static ArrayList<Tutor> tutores = new ArrayList<Tutor>(); 
   public static void main(String[] args){
      char op = 'n';
      while (op != 'x'){ 
      op = Menu();
      switch (op){
      case 'c':
      
      }
   }
}
 static char Menu(){
   System.out.println("*****ESCOLHER UMA OPCAO*****");
   System.out.println("c: cadastrar tutor + pet(s)");
   System.out.println("i: imprimir cadastro");
   System.out.println("b: buscar pets por codigo tutor");
   System.out.println("e: excluir pets por codigo tutor");
   System.out.println("x: encerrar.");
   System.out.println("Opção escolhida:");
   Scanner sop = new Scanner(System.in);
   char op = sop.next().charAt(0);
   return op;
}

} 
