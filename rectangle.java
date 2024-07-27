public class rectangle {

    double l;
    double w;
    rectangle(double l , double w){
        this.l=l;
        this.w=w;
    }
    public void getArea(){
        System.out.println("Area is: " + l*w + "s1.unit");
    }
    public void getParameter(){
        System.out.println("Parameter is: " + 2*(l+w) + "unit");
    }
}