
package th.ac.nu.student.u54347644.compro.ch2;
import java.util.Scanner;
public class p4 {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Radius = ");
     int Radius= in.nextInt();
     System.out.println("Area = " + 3.14*(Radius*Radius));
     System.out.println("Circumference = " + 2*3.14*Radius);   
     System.out.println("Volume = " + 4/3*3.14*(Radius*Radius*Radius));    
     System.out.println("Surface = " + 4*3.14*(Radius*Radius));    
    }
}
