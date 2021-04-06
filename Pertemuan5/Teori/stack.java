import java.util.*;


public class stack {

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
    Stack<String> barang = new Stack<>();
    
    public warung(){
        
    }
    public void stokbarang(Stack<String> barang){
        this.barang = barang;
    }
    public Stack<String> ambilstok(){
        return this.barang;
    }
}

class gudang extends warung{
    public void tambahstok(String barang){
        super.ambilstok().add(barang);
    }
    public String kadaluarsa(int index){
        return super.ambilstok().pop();
    }
    public Stack<String> barangSisa(){
        return super.ambilstok();
    } 
}