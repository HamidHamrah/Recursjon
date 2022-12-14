import javax.print.DocFlavor;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        System.out.println("main() starter!");
        int sum = tverrsum(7295);
        System.out.println("main() er ferdig!");
    }
    public static int a(int n)
    {
        if (n<0){
            throw new NoSuchElementException("N er negative");
        }
        int x=0,y=1,z=1;
        for (int i=0; i<n; i++){
            z=2*y+3*x;
            x=y;
            y=z;
        }
        return z;
    }
    public static int tverrsumItrativt(int n)              // n må være >= 0
    {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
    public static int tverrsum(int n)              // n må være >= 0
    {
        System.out.println("tverrsum(" + n + ") starter!");
        int sum = (n < 10) ? n : tverrsum(n / 10) + (n % 10);
        System.out.println("tverrsum(" + n + ") er ferdig!");
        return sum;
    }
    public static int Kvadratt(int n){
        if (n==1){
            return 1;
        }
        else {
            return Kvadratt(n-1)+n*n;
        }
    }
    public static int sum(int fra, int til){
        //0+1+2+3+4
        if (fra==til) {
            return fra;
        }
        int m=(fra+til)/2;
        return sum(fra,m)+sum(fra+1,til);
    }
    public static int maks(int[] a, int fra, int til){
        int m=(fra+til)/2;
        if (fra==til)return fra;
        int mFra=maks(a,m+1,til);
        int mTil=maks(a,fra,m);
        return a[mFra]>=a[mTil]? mFra:mTil;
    }
    public static int maks(int[] a){
        return maks(a,0,a.length-1);
    }
    public static int Fakultet(int n){
        if (n<=1){
            return 1;
        }
        return Fakultet(n-1)*n;

    }
    public static int fib(int n)         // det n-te Fibonacci-tallet
    {
        if (n <= 1) return n;              // fib(0) = 0, fib(1) = 1
        else return fib(n-1) + fib(n-2);   // summen av de to foregående
    }

    public static int euklid(int a, int b) {
        System.out.println("euklid(" + a + "," + b + ") starter!");
        if (b == 0) {
            System.out.println("euklid(" + a + "," + b + ") er ferdig!");
            return a;
        }
        int r = a % b;            // r er resten
        int k = euklid(b, r);       // rekursivt kall
        System.out.println("euklid(" + a + "," + b + ") er ferdig!");
        return k;
    }
}
