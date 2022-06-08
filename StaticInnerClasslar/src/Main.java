
public class Main {
    public static void main(String[] args) {
    
        
        /* Alan clasımız statik inner olduğundan şu şekilde obje oluşturuabiliriz */
        Matematik.Alan alan=new Matematik.Alan();
        
        /*Eğre alan classı statik olmasaydı şöyle oluşturmalıydık
        Matematik.Alan alan=new Matematik().new Alan();*/
        
        alan.Daire_Alan();
       /* ama  eğer tanımladığımız daire alan methodu da statik olursa nesne oluşturmadan
        direk claslar üzerinden şu şekilde çağırabiliriz
         Matematik.Alan.Daire_Alan();
        */
       
    }/* eğer dış classımızdaki bir özelliği inner clasta kulllanmak istiyorsak statik olmak zoeundaddırr*/
    
}
