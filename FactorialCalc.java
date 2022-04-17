import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)

        int C, r, n;
        Scanner input = new Scanner(System.in);

        /*
         According to n = 5
          i * nn =
        * 1 * 1 = 1
        * 2 * 1 = 2
        * 3 * 2 = 6
        * 4 * 6 = 24
        * 5 * 24 = 120
        * */


//--------------n FACTORİAL VALUE---------------
        System.out.print("Enter N number:  ");
        n = input.nextInt();
        int a = 1;
        long nn = 1;
        while (a <= n){
            nn = a * nn;
            a++;
        }
        System.out.println(nn);


//-------------r FACTORİAL VALUE---------------
        System.out.print("Enter R number:  ");
        r = input.nextInt();
        long rr = 1;
        int b = 1;
        while (b <= r){
            rr = rr * b;
            b++;
        }
        System.out.println(rr);


        long nnrr = 1;
        int c = 1;
        while (c <= (n-r)){
            nnrr = nnrr * c;
            c++;
        }

        /*
        * c
        * 1 * 1 = 1
        * 2 * 1 = 2
        * 3 * 2 = 6
        * */
        System.out.println("(n-r)! =  "+nnrr);
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");

        long sonuc = nn / (rr * (nnrr));
        System.out.println("C("+n+","+r+") = "+n+"! / ("+r+"! * ("+n+"-"+r+")!) = "+sonuc);
    }
}
