package latihan.mahasiswa;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.nim = "10110142";
		mhs1.nama = "Muhammad Naufal Fakri";
		Mahasiswa mhs2 = new Mahasiswa();
		mhs2.nim = "10118044";
		mhs2.nama = "Wildan Muhammad Fikri";
		
		mhs1.perkenalkanDiri();
		System.out.println("");
		mhs2.perkenalkanDiri();
	}

}
