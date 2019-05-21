package season_4.Circle_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){}
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return super.getRadius()*super.getRadius()*height;
    }

    @Override
    public String toString(){
        return " Cylinder: \n"
                +" Volume is: "+ getVolume()
                +" Height is: "+getHeight()
                + " color is: "+super.getColor();
    }
}
