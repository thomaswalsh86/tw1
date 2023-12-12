import java.util.Scanner;
import java.lang.Math;
public class lab10Q1 {
    public static void main(String [] args)
    {
    Scanner scan = new Scanner(System.in);
    double square,circle,rectangle,sp,cc,rp;
  
        while(true)
        {
            System.out.println("Pick a shape");
            String in=scan.nextLine();

            if(in == "square")
            {
                  System.out.println("Pick a length");
                  double l=scan.nextInt();
                  System.out.println("Pick a width");
                  double w=scan.nextInt();
                  square = l*w;
                  System.out.println("The area of the square is : "+square);            
                  sp=l+w;
                  System.out.println("The perimeter of the rectangle is : "+sp);
            }    
           else if(in == "rectangle")
            {
                 System.out.println("Pick a length");
                  double l=scan.nextInt();
                  System.out.println("Pick a width");
                  double w=scan.nextInt();
                  System.out.println("Pick a height");
                  double h=scan.nextInt();
                  rectangle = l*w*h;
                  System.out.println("The area of the rectangle is : "+rectangle);
                  rp=l+w+h;
                  System.out.println("The perimeter of the rectangle is : "+rp);
            }
            else if(in == "circle")
            {
                 System.out.println("Pick a radius");
                 double r=scan.nextInt();
                 circle = Math.PI*Math.pow(r,2);
                 System.out.println("The area of the circle is : "+circle);
                 cc=2*Math.PI*r;
                 System.out.println("The perimeter of the circle is : "+circle);
            }
           else if(in=="q")
            {
                break;
            }
            scan.close();
        }
    }
}
