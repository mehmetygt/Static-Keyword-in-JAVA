
public class Main {
// AnonimInnerClaslar
    /* clas içinde klasik interface luşruruyoruz*/
    public interface Iogrenci{
    void  derse_gir();
    void  ders_calis();
    }
    
    
    //abstarct classlar iiçin şöyledir
// static olmazsa  bbu classı psvm tanımaz
    
    public static abstract class Aogrenci{
     private String isim;
     private int id;

        public Aogrenci(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }
     
     public void selamla(){System.out.println("ANONİM Mİ ben senin ANONİM");}
     abstract void kayıt_ol();

        /**
         * @return the isim
         */
        public String getIsim() {
            return isim;
        }

        /**
         * @param isim the isim to set
         */
        public void setIsim(String isim) {
            this.isim = isim;
        }

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }
        
    } 
    
    
    
    
    public static void main(String[] args) {
        /* burada interfaceden nesne oluşturamayız sadece referans olur
         herhangi bir nesne oluşturunca şöyle bir yapı oluşur*/
        Iogrenci ogrennci=new Iogrenci() { /*  böyle bir yapı oluşur ve burdan override yapabiliriz*/
            @Override
            public void derse_gir() {
                System.out.println("ogrenci derse giriyor");
            }

            @Override
            public void ders_calis() {
                System.out.println("ogrenci ders çalışıyor");
            }
        };// buraya nojtalı virgül oymalıyız çünku bu nijhayette birr tanımlama kodu
       
        // şimdi methodlarını çağırabiliriz
        ogrennci.derse_gir();
        ogrennci.ders_calis();
        System.out.println("****************************************"); 
        
        
        
       //şimdi abstract clastan nesne nasıl oluşur bakalım
       //gelen özelliklere göre parametre yerleri doldurulur
       
       Aogrenci ogrenci2=new Aogrenci("mehmet yiğit",314) {
           @Override
           void kayıt_ol() {
               // burada özellikleimiz private olduğundan get ile çağırabiliriz
               System.out.println(getIsim()+" "+getId()+" numara ile kayıt oldu");}
       };// buraya noktalı virgül koyuyoruz
        
        ogrenci2.kayıt_ol();
        ogrenci2.selamla();
    }
    
}
