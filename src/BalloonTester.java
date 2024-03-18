public class BalloonTester {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        balloon.addAir(100);
        System.out.println("Volume after adding 100 cm^3 of air: " + balloon.getVolume() + " cm^3");
        System.out.println("Surface area after adding 100 cm^3 of air: " + balloon.getSurfaceArea() + " cm^2");
        System.out.println("Radius after adding 100 cm^3 of air: " + balloon.getRadius() + " cm");
        balloon.addAir(100);
        System.out.println("\nVolume after adding another 100 cm^3 of air: " + balloon.getVolume() + " cm^3");
        System.out.println("Surface area after adding another 100 cm^3 of air: " + balloon.getSurfaceArea() + " cm^2");
        System.out.println("Radius after adding another 100 cm^3 of air: " + balloon.getRadius() + " cm");
    }
}
