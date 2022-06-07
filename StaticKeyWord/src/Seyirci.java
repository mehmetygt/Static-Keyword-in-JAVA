
public class Seyirci {
    private String isim;
    //seyirci sayısı statik olduğundan nesne oluşturulmadan bu class ismi ile çağrılabilir
    private static int seyirci=0;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirci++;
    }

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
     public void oyun_seyret(){
         System.out.println(getIsim()+" seyirci oyun seyredyor");}

    
    /**
     * @return the seyirci
     */
    public static int getSeyirci() {
        return seyirci;
    }

    /**
     * @param aSeyirci the seyirci to set
     */
    public static void setSeyirci(int aSeyirci) {
        seyirci = aSeyirci;
    }
    
}
