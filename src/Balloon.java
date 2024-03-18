public class Balloon {
    private double volume;
    public Balloon() {
        volume = 0;
    }
    public void addAir(double amount) {
        volume += amount;
    }
    public double getVolume() {
        return volume;
    }
    public double getSurfaceArea() {
        double radius = getRadius();
        return 4 * Math.PI * radius * radius;
    }
    public double getRadius() {
        return Math.pow((3 * volume) / (4 * Math.PI), 1.0 / 3);
    }
}
