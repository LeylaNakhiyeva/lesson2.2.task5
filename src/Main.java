import java.util.Scanner;

public class Main {                                  //ders2.test5
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ededi daxil edin: ");
        int a= sc.nextInt();
        int b=a;
        int faktorial=1;
        for (;a!=0;a--){
            faktorial*=a;

        }
        System.err.println("Daxil edilmis ededin faktoriali: "+b+"!= "+faktorial);
    }
}