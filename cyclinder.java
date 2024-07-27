public class cyclinder {
    double r;
    double h;
    cyclinder(double r, double h){
        this.r=r;
        this.h=h;
    }
    public void getVolume(){
        System.out.println("volume of cyclinder is: " + 3.14*r*r*h);
    }
    public void leteralSurfaceArea(){
        System.out.println("leteralSurfaceArea of cyclinder is:" + 2*3.14*r*h);
    }
    public void totalSurfaceArea(){
        System.out.println("totalSurfaceArea of cyclinder is: " + 2*3.14*r*(r+h));
    }
    
}
