
import java.util.Scanner;


public class Main {
    /*-LocalInnerClaslar metodlar içinde tanımlanan claslardır
      -değişkenler gibi sadece içinde oldukları method içinde geçerlidir
    public ve static gibi ifadeler kulanamız çünkü bunlar normal bir classın özellik 
    yada methodları için kullanlbilir*/
    public static void main(String[] args) {
        
     // localinnerclasımız
        class Alan{
        public void alan_hesapla(){
            Scanner scanner=new Scanner(System.in);
            System.out.println(" yarıcap gir : ");
            int yaricap=scanner.nextInt();
            double alan=Math.PI*yaricap*yaricap;
            System.out.println("Daire alanı : "+alan);
        
        }
        }
        
        // yine clasımızdan nesne türetmeliyiz
         Alan alan1=new Alan();
         alan1.alan_hesapla();
        
      
    }
    
}
