
import java.util.Scanner;


public class Main {
     //Basit Matematik ve Fizik Problemleri
     //Daire Alan-Matematik
     //Ücgen Çeversi-Matematik
     //Üç Boyutlu Vektörlerin İç Çarpımı_ Fizik
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t * HOŞGELDİNİZ *");
        String islemler="İşlemler  \n"
                + "1. işlem = daire alanıhesaplama \n"
                + "2. işlem = Ücgen çevresi hesaplama \n"
                + "3. işlem = iki vektörün iç çarpımını hesaplama \n"
                + "Çıkış =4";
        
        while (true) {
            System.out.println(islemler);
            System.out.println("işlem seçiniz");
           int islem=scanner.nextInt();
           scanner.nextLine();
            if (islem==4) {
                System.out.println("Program Sonlandırılıyor......");
                break;
                
            }
            else if (islem==1) {
                Problem.Matematik.Daire_alan();
                
            }
            else if (islem==2) {
                Problem.Matematik.UcgenCevresi();
                
            }
            else if (islem==3) {
                 System.out.println("Ucgen çevresi alandasınız");
                 System.out.println("vektörleri girin");
                 System.out.println("vec1 : ");
                 Vec vec1=new Vec("vektor1");
                 System.out.println("vec2 : ");
                 Vec vec2=new Vec("vektor1");
                Problem.Fizik.İcCarpim(vec1, vec2);
                
            }
            else{System.out.println("Geçerziz İşlemmmm");}
        }
        
    }
    
}
