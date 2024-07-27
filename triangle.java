public class triangle {
    double base;
    double height;
    double length;

    triangle(double base, double height, double length){
        this.base= base;
        this.height=height;
        this.length=length;
    }

    public void getArea(){
        System.out.println("Area of traingle is: " + 0.5*height*base);
    }

    public void getParameter(){
        System.out.println("Parameter of triangle is: " + (base+height+length));

    }
    
}


