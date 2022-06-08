
import java.util.Scanner;


public class Matematik {
    
    private double pi=Math.PI;// bu özelliğimiz private olmasına rağme inner classlar tarfından doğrudan kullanılabilir
    
    // burada clas içinde method yazar gibi clas yazıyoruz
    public class Factoriel{
        public void Factoriel_Hesapla(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktöriyelini öğrenmek istediğiniz sayıyı giriniz");
       int sayi=scanner.nextInt();
        int fact=1;
            for (int i = 2; i <=sayi; i++) {
                fact=fact*i;
               
                
            } System.out.println("Girdiğiniz sayını faktöriyeli  : "+fact);
}
        
    }
     public class Asal{
     public void asalmı(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("asal olup olmadığını öğrenmek istediğiniz sayıyı girini öğrenmek");
        int sayi=scanner.nextInt();
      
         for (int i = 2; i <sayi; i++) {
             if (sayi%i==0) {
                 System.out.println("girdiğiniz sayı asal değil "+i+" sayısına tam bölündü");
                 break;
                }  System.out.println("girdiğiniz sayı asaldır. "); 
                break;
              }
             }}
     public class Alan{
     public void daire_alan(){
         Scanner scanner=new Scanner(System.in);
        System.out.println("Alanını öğrenmekm istediğiniz dairenin yarıçapını  giriniz : ");
        int yaricap=scanner.nextInt();
       
       double  alan = (pi*yaricap*yaricap);
         
         System.out.println("Dairenin alanı : " +alan);
     }
     
     
     
     }
          }