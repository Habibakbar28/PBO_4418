public class Gameplayer{
    private double width;
    private double height;
    private int positionx;
    private int positiony;

    public Gameplayer(){

    }
    public Gameplayer(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Gameplayer(double width,double height,int positionx,int positiony){
        this.width=width;
        this.height=height;
        this.positiony=positiony;
        this.positionx=positionx;
    }

    public void setdimension(double width,double height){
        this.width=width;
        this.height=height;
    }
    public void setposition(int positionx,int positiony){
        this.positiony=positiony;
        this.positionx=positionx;
    }

    public double getwidth(){
        return width;
    }
    public double getheight(){
        return height;

    }

    public int getx(){
        return positionx;

    }

    public int gety(){
        return positiony;
    }

    public void run(){
        System.out.println("Player is running");
    }

    public void run(int inrementx){
        positionx=positionx+=inrementx;
        System.out.println("Player is still running...current X position:"+positionx);
    }

    public static void main(String[] args){
        Gameplayer test=new Gameplayer();
        test.setposition(60,30);
        System.out.println("position x:"+test.getx());
        test.run(30);
    }
}