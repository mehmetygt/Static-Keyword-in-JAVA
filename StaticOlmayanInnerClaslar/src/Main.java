
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Matematik.Factoriel factoriel=new Matematik().new Factoriel();
        Matematik.Asal asal=new Matematik().new Asal();
        Matematik.Alan alan=new Matematik().new Alan();
      
        Scanner scanner=new Scanner(System.in);
       String islemler="\t İŞLEMLER \n"
               + "1. FAKTÖRİYEL \n"
               + "2. ASAL MI DEĞİL Mİ\n"
               + "3. DAİRE ALANI BULMA\n"
               + "4 : ÇIKIŞ";
       
        
       int islem;
        while (true) { 
          System.out.println(islemler);
          System.out.println("lütfen bir işlem seçin");
          islem=scanner.nextInt();
          if(islem==4){System.out.println("sistemden çıkılıyor");
          break;}
          else if(islem==1) {
                factoriel.Factoriel_Hesapla();
                
            }else if(islem==2) {
                asal.asalmı();
                
            }else if(islem==3) {
                alan.daire_alan();}
          
            else{System.out.println("lütfen geçerli bir işlem seçin");}
               
            
            
            
        }
        
    }
    
}
