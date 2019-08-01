public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height*this.getArea();
    }
    @Override
    public String toString(){
        return "Cylinder, radius= "+this.radius+", color: "+this.color+", height= "+this.height+", volume= "+this.getVolume();
    }
}
