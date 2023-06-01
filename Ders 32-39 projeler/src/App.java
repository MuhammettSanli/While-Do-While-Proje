import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner girdi = new Scanner(System.in)) {

            
            int sayi,toplam=0;

            do{
                System.out.println("Bir sayı giriniz.");
                sayi=girdi.nextInt();
                if(sayi<0)
                {
                    break;
                }
                if(sayi%2==0)
               {
                toplam+=sayi;
               }
            }while(sayi>=0);

            System.out.println("Toplma: "+toplam);
            /* 

            int sayi,toplam=0;

            while(true)
            {
                System.out.println("Bir sayi giriniz.");
                sayi=girdi.nextInt();

                if(sayi<0)
                {
                    break;
                }

                if(sayi%2==0)
                {
                    toplam+=sayi;
                }
            }
            System.out.println("Toplam: "+toplam);
            */












    
        }




    }
}
