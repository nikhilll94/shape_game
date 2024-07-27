import java.util. Scanner;
public class driverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char p;
        do{
            System.out.println("Enter 1 for Rectangle");
            System.out.println("Enter 2 for Triangle");
            System.out.println("Enter 3 for Square");
            System.out.println("Enter 4 for Circle");
            System.out.println("Enter 5 for Cyclinder");
            System.out.println("Enter 6 for Sphere");
            System.out.println("Enter 7 for Hemisphere");
            System.out.println("Enter 8 for Cone");
            int choice = sc.nextInt();
    
            switch(choice)
            {
                case 1:
                System.out.println("You have Selected Rectangle=================>");
                System.out.println("Enter the length");
                double l= sc.nextDouble();
                System.out.println("Enter the width");
                double w= sc.nextDouble();
                rectangle r1 = new rectangle(l, w);
                r1.getArea();
                r1.getParameter();
                System.out.println();
                // break;
    
                case 2:
                System.out.println("You have Selected Triangle=====================>");
                System.out.println("Enter the length");
                double le= sc.nextDouble();
                System.out.println("Enter the height");
                double h= sc.nextDouble();
                System.out.println("Enter the base");
                double b= sc.nextDouble();
                triangle t1= new triangle(b, le, h);
                t1.getArea();
                t1.getParameter();
                System.out.println();
                // break;
    
                case 3:
                System.out.println("You have Selected Square==================>");
                System.out.println("Enter the side");
                double a = sc.nextDouble();
                square sq1 = new square(a);
                sq1.getArea();
                sq1.getParameter();
                System.out.println();
                // break;
    
                case 4:
                System.out.println("You have Selected Circle==================>");
                System.out.println("Enter the radius");
                double r = sc.nextDouble();
                circle ci1 = new circle(r);
                ci1.getARea();
                ci1.getPArameter();
                System.out.println();
                // break;
    
                case 5:
                System.out.println("You have Selected Cyclinder====================>");
                System.out.println("Enter the radius");
                double radius= sc.nextDouble();
                System.out.println("Enter the height");
                double height = sc.nextDouble();
                cyclinder cy1 = new cyclinder(radius, height);
                cy1.getVolume();
                cy1.leteralSurfaceArea();
                cy1.totalSurfaceArea();
                System.out.println();
                // break;
    
    
                case 6:
                System.out.println("You have Selected Sphere==================>");
                System.out.println("Enter the radius");
                double rad= sc.nextDouble();
                sphere sp1 = new sphere(rad);
                sp1.getVolume();
                sp1.leteralSurfaceArea();
                sp1.totalSurfaceArea();
                System.out.println();
                // break;
    
    
                case 7:
                System.out.println("You have Selected HemiSphere================>");
                System.out.println("Enter the radius");
                double radi= sc.nextDouble();
                hemisphere hs1 = new hemisphere(radi);
                hs1.getVolume();
                hs1.leteralSurfaceArea();
                hs1.totalSurfaceArea();
                System.out.println();
                // break;
                
    
                case 8:
                System.out.println("You have Selected Cone====================>");
                System.out.println("Enter the radius");
                double radiu= sc.nextDouble();
                System.out.println("Enter the height");
                double heigt = sc.nextDouble();
                System.out.println("Enter the length");
                double len = sc.nextDouble();
                cone cn1 = new cone(radiu, heigt, len);
                cn1.getVolume();
                cn1.leteralSurfaceArea();
                cn1.totalSurfaceArea();
                System.out.println();
                // break;
    
                default:
                System.out.println("This is Not a Valid choice!! ");

        }
        System.out.println("Press 'Y/y' for to continue or press other to stop");
        p = sc.next().charAt(0);
       
        }
        while( p=='Y' || p=='y');
        System.out.println("Thank You! program Ends!! ");
    
    }
  
}
