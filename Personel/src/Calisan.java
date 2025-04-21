
public class Calisan extends Personel {
	// Çalışan sınıfının özellikleri
    private int haftalıkCalismaSaati;
    private double maas;
    private int izinHakki;

    // Çalışan sınıfının constructor'ı
    public Calisan(String isim, String soyisim, String cinsiyet, int yaş, String departman, String pozisyon,
                   int haftalıkCalismaSaati, double maas, int izinHakki) {
        super(isim, soyisim, cinsiyet, yaş, departman, pozisyon);
        this.haftalıkCalismaSaati = haftalıkCalismaSaati;
        this.maas = maas;
        this.izinHakki = izinHakki;
    }

    // Çalışan sınıfının bilgilerini ekrana yazdıran metot (override edilmiş öğren metodu)
    @Override
    public void ogren() {
        super.ogren();
        System.out.println("Ayrıca, haftada " + haftalıkCalismaSaati + " saat çalışmaktadır ve maaşı " +
                maas + " TL'dir. " + izinHakki + " izin hakkı bulunmaktadır.");
    }

}
