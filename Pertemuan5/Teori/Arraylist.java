import java.util.ArrayList;

public class Arraylist {

    public static void main(String args[]) {
        gudang dagangan = new gudang();
        System.out.println(dagangan.barangSisa());
        
        dagangan.tambahstok("kecap");
        dagangan.tambahstok("gelas");
        dagangan.tambahstok("mie goreng");
        System.out.println(dagangan.barangSisa());
        
        dagangan.kadaluarsa(3);
        System.out.println(dagangan.barangSisa());
        
    }
}

class warung{
    ArrayList<String> barang = new ArrayList<>();
    
    public warung(){
        
    }
    public void stokbarang(ArrayList<String> barang){
        this.barang = barang;
    }
    public ArrayList<String> ambilstok(){
        return this.barang;
    }
}

class gudang extends warung{
    public void tambahstok(String barang){
        super.ambilstok().add(barang);
    }
    public String kadaluarsa(int index){
        return super.ambilstok().remove(index);
    }
    public ArrayList<String> barangSisa(){
        return super.ambilstok();
    } 
}