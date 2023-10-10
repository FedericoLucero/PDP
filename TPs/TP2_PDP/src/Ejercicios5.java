public class Ejercicios5 {
    public static void main(String[] args) {

        ejercicio1a();
        ejercicio1b();
        ejercicio1c();

        ejercicio2a();
        ejercicio2b();
        ejercicio2c();

    }

    public static void ejercicio1a() {
        float sum=0; int i;
        for (i = 10; 1/i > sum; i--){
            sum = sum + 1/i;
            System.out.println(sum);
        }
    }

    public static void ejercicio1b() {
        float sum=0;
        for (int i = 10; 1/i > sum; i--){
            sum = sum + 1/i;
            System.out.println(sum);
        }
    }

    public static void ejercicio1c() {
        for (int sum = 0, i = 10; 1/i > sum; i--){
            sum = sum + 1 / i;
            System.out.println(sum);
        }
    }

    public static void  ejercicio2a(){
        int a,b;
        char c;
        a=1;
        b=1;
        if ((a=2)>(b=1)) {
            a = b;
        }
        else {
            b = a;
        }
        System.out.println("a: " + a + ", b: " + b );
    }

    public static void  ejercicio2b(){
        int a,b;
        char c;
        a=1;
        b=1;
        if (a > b) {
            b = a;
            a = 0;
        }
        else {
            a = b;
            b = 0;
        }
        System.out.println("a: " + a + ", b: " + b );
    }

    public static void  ejercicio2c(){
        int a,b;
        char c;
        a=1;
        b=1;
        if (a == b) {
            a = 1;
            b = 2;
        }
        else {
            a = 2;
            b = 1;
        }
        System.out.println("a: " + a + ", b: " + b );
    }
}
