package kasus1;
import java.util.ArrayList;

public class Matakuliah{
	private ArrayList<String> matkulTambahan = new ArrayList<String>();
    private ArrayList<String> matkulPokok = new ArrayList<String>();   

    public static void main(String[] args) {
        ArrayList<String> matkulTambahan = new ArrayList<String>();
        matkulTambahan.add("Bahasa Inggris");
        matkulTambahan.add("Bahasa Indonesia");
        matkulTambahan.add("Interaksi Manusia dan Komputer");
        matkulTambahan.add("Pendidikan Agama Islam");

        ArrayList<String> matkulkPokok = new ArrayList<String>();
        matkulkPokok.add("Otomata dan Teori Bahasa");
        matkulkPokok.add("Pemrograman Web Lanjut");
        matkulkPokok.add("Pemrograman Berbasis Objek");
        matkulPokok.add("Rekayasa Perangkat Lunak");


    }

}