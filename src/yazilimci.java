public class yazilimci extends Calisan{
    private String diller;

    public yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
    public void formatAd(String isletim_Sistemi ){
        System.out.println(getAd()+""+isletim_Sistemi+"'ni yüklüyor.");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller:"+diller);
    }
}
