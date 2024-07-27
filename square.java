public class square {

    double a;
    square(double a){
        this.a=a;
    }
    public void getArea(){
        System.out.println("Area of rectangle is: " + a*2);
    }

    public void getParameter(){
        System.out.println("Parameter of rectangle is: " + 4*a);
    }
}