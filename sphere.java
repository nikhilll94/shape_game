public class sphere {
    double r;
    sphere(double r){
        this.r=r;
    }
    public void getVolume(){
        System.out.println("volume of sphere is: " + 1.3*3.14*r*r*r);
    }
    public void leteralSurfaceArea(){
        System.out.println("leteralSurfaceArea of sphere is:" + 4*3.14*r*2 );
    }
    public void totalSurfaceArea(){
        System.out.println("totalSurfaceArea of sphere is: " + 4*3.14*r*r);
    }

    
}
