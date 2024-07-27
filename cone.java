public class cone {
    double r;
    double h;
    double l;

    cone(double r, double h, double l){
        this.r=r;
        this.h=h;
        this.l=l;
    }
    public void getVolume(){
        System.out.println("volume of cone is: " + (1/3)*3.14*r*r*h);
    }
    public void leteralSurfaceArea(){
        System.out.println("leteralSurfaceArea of cone is:" + 3.14*r*l);
    }
    public void totalSurfaceArea(){
        System.out.println("totalSurfaceArea of cone is: " + 3.14*r*(r+l));
    }
    
    
}
