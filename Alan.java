import java.util.Scanner;

/**
 * @author fatih-git
 */

public class Alan {

    public static void main(String[] args) {

        double a,b,c,u,alan;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen üçgenin 1. kenarını giriniz:");
        a=input.nextDouble();
        System.out.print("Lütfen üçgenin 2. kenarını giriniz:");
        b=input.nextDouble();
        System.out.print("Lütfen üçgenin 3. kenarını giriniz:");
        c=input.nextDouble();

        u=(a+b+c)/2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı="+alan);

    }

}

