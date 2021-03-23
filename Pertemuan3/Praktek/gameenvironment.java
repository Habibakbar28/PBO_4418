package gameenvironment;

public class gameenvironment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gameplayer coba = new gameplayer();
        coba.setPotition(30,20);
        coba.run(60);
        coba.run();
    }
    
}

