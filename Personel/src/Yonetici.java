
public class Yonetici extends Calisan {
	
	 // Yönetici sınıfının ekstra özellikleri
    private String öğrenimDüzeyi;
    private String yönetilenDepartmanlar;

    // Yönetici sınıfının constructor'ı
    public Yonetici(String isim, String soyisim, String cinsiyet, int yaş, String departman, String pozisyon,
                    String öğrenimDüzeyi, String yönetilenDepartmanlar) {
        super(isim, soyisim, cinsiyet, yaş, departman, pozisyon, 0, 0, 0); // Çalışan sınıfının constructor'ını çağır
        this.öğrenimDüzeyi = öğrenimDüzeyi;
        this.yönetilenDepartmanlar = yönetilenDepartmanlar;
    }

    // Yönetici sınıfının bilgilerini ekrana yazdıran metot (override edilmiş öğren metodu)
    @Override
    public void ogren() {
        super.ogren();
        System.out.println("Ayrıca, " + öğrenimDüzeyi + " derecesine sahiptir ve " +
                yönetilenDepartmanlar + " departmanlarını yönetmektedir.");
    }

}
