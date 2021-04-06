public class tesvehicle {
    public static void main(String[] args) throws Exception {
        vehicle kendaraan1 = new vehicle();
        bicycle sepeda = new bicycle();
        motorvehicle motor = new motorvehicle(5, "R 6865 KJ");

        sepeda.ringbell();
        kendaraan1.goStraight();
        kendaraan1.turnleft();
        motor.getLicencePlate();
        motor.getSizeofEngine();
        
    }
}
