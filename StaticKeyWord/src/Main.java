
public class Main {
    public static void main(String[] args){
        
        /* burada seyirci classında oluşmuş olan method ve özellikleri çağırmak
        için kesinlikle seyirci classından bir nesne türetmeliyiz ve
        bu nesne üzerinden özellik ve isimlere ulaşabiliriz*/
      /* Seyirci seyirci1=new Seyirci("mehmet yiğit");
       Seyirci seyirci2=new Seyirci("rojhat toptamuş");*/
       // şimdi çağırabiliriz
     /*  System.out.println("seyirci 1 :"+seyirci1.getIsim());
       System.out.println("seyirci 2 :"+seyirci2.getIsim());
       seyirci1.oyun_seyret();
       seyirci2.oyun_seyret(); */
  
       
       /* ama eğer bu claslardaki özellik yada methodumuz startik olsaydı
       hem bu şekilde nesne ile çağırabiliriz hemde nesne oluşturmadan 
       aişağıdaki gibi  direk clas ismi ile çağırabiliriz*/
       
        System.out.println("seyirci sayısı : "+Seyirci.getSeyirci());
        Seyirci seyirci1=new Seyirci("mehmet yiğit");
        Seyirci seyirci2=new Seyirci("rojhat toptamuş");
        seyirci1.oyun_seyret();
        seyirci2.oyun_seyret();
        System.out.println("seyirci sayısı : "+Seyirci.getSeyirci());
        /* yukarıda iki kez nesne oluşturulduğundan  her nesne oluşumunda constuctor u 
        çalıştığından çalıştığı kadar yani iki kez  seyirci sayısı artmış olsu
        - diğer özellikleri bu şekilde çağıramayız çünkü statik değil
        
        -- static bir method statik olmayan bir özellik yada methodu nesneleştirmden /nesne üzerinden olmadan direk class ile çağıramaz*/
       
      
       
       
       
        
    }
    
}
