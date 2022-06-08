
import java.util.Scanner;


public class Problem {
    public static class Matematik{
    public static void Daire_alan(){
        System.out.println("Daire alandasınız");
        Scanner scanner=new Scanner(System.in); 
        System.out.println("yarıcap girin : ");
        int yarıcap=scanner.nextInt();
        double alan=yarıcap*yarıcap*Math.PI;
        System.out.println("Dairenin Alanı : "+alan);
    }
    
    public static void UcgenCevresi(){
       
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ücgenin kenarlarını girin");
        System.out.print("  1.Kenar : ");
        int kenar1=scanner.nextInt();
        System.out.print("  2.Kenar : ");
        int kenar2=scanner.nextInt();
        System.out.print("  3.Kenar : ");
        int kenar3=scanner.nextInt();
        int cevre=kenar1+kenar2+kenar3;
        System.out.println("Ücgenin çevresi : "+cevre);
    
    }
    
    
    }
    public static class Fizik{
    public static void İcCarpim(Vec vec1,Vec vec2){
        
    int iccarpim=(vec1.getI()*vec2.getJ())+(vec1.getJ()*vec2.getJ())+(vec1.getK()*vec2.getK());
    System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" vektörlerinin iç çarpımı : "+iccarpim);
    }}
}
