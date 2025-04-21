
public class Personel {
	
	// Personel sınıfının özellikleri
    private String isim;
    private String soyisim;
    private String cinsiyet;
    private int yaş;
    private String departman;
    private String pozisyon;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public int getYaş() {
		return yaş;
	}
	public void setYaş(int yaş) {
		this.yaş = yaş;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	public String getPozisyon() {
		return pozisyon;
	}
	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}
    
	// Personel sınıfının constructor'ı
    public Personel(String isim, String soyisim, String cinsiyet, int yaş, String departman, String pozisyon) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.cinsiyet = cinsiyet;
        this.yaş = yaş;
        this.departman = departman;
        this.pozisyon = pozisyon;
    }

    // Personel sınıfının bilgilerini ekrana yazdıran metot
    public void ogren() {
        System.out.println(isim + " " + soyisim + ", " + cinsiyet + ", " + yaş + " yaşında, "
                + departman + " departmanında, " + pozisyon + " pozisyonunda çalışmaktadır.");
    }

}
