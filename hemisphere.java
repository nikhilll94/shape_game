public class hemisphere {
    double r;
    hemisphere(double r){
        this.r=r;
    }
    public void getVolume(){
        System.out.println("volume of hemisphere is: " + (2/3)*3.14*r*r*r + "cube units");
    }
    public void leteralSurfaceArea(){
        System.out.println("leteralSurfaceArea of hemisphere is:" + 2*3.14*r*r + "sq.units" );
    }
    public void totalSurfaceArea(){
        System.out.println("totalSurfaceArea of hemisphere is: " + 3*3.14*r*r);
    }
    
}
