
import java.util.Scanner;


public class Matematik {
    
    
    public static class Alan{
    public void Daire_Alan(){
    System.out.println("dare alan hesaplamaya hoşgeldiniz lanını hesaplayacağınız daireniin yarı çapını yazınız : ");
    Scanner scanner=new Scanner(System.in);
    int yaricap=scanner.nextInt();
    
    double alan=Math.PI*yaricap*yaricap;
    System.out.println("Dairenin alanı : "+alan);
    }
    }
    
}
