
public class PersonelTakip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel p1 = new Personel("Ahmet", "Yılmaz", "Erkek", 35, "Muhasebe", "Muhasebe Müdürü");
        p1.ogren();

        Calisan c1 = new Calisan("Mehmet", "Kaya", "Erkek", 28, "Yazılım", "Yazılım Mühendisi", 40, 4000, 21);
        c1.ogren();

        Yonetici y1 = new Yonetici("Fatma", "Öztürk", "Kadın", 45, "Pazarlama", "Pazarlama Direktörü",
                "Yüksek Lisans", "Pazarlama, Satış");
        y1.ogren();

	}

}
