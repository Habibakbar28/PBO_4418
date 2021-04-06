import java.util.*;

public class queue {
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
    Queue<String> barang = new LinkedList<>();
    
    public warung(){
        
    }
    public void stokbarang(Queue<String> barang){
        this.barang = barang;
    }
    public Queue<String> ambilstok(){
        return this.barang;
    }
}

class gudang extends warung{
    public void tambahstok(String barang){
        super.ambilstok().add(barang);
    }
    public String kadaluarsa(int index){
        return super.ambilstok().poll();
    }
    public Queue<String> barangSisa(){
        return super.ambilstok();
    } 
}