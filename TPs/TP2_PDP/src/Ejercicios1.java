public class Ejercicios1 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio1();
        ejercicio1();
    }

    // Ejercicio 1.1
    public static void ejercicio1(){
        int a; int b; int c;

        a = 2; a++; System.out.println("a. " + a);
        a = 2; b = a++; System.out.println("b. " + a + " " + b);
        a = 2; b = ++a; System.out.println("c. " + a + " " + b);
        a = 2; b = 1; b += a; System.out.println("d. " + a + " " + b);
        b = 1; b *= 5; System.out.println("e. " + b);
        //a = 2; b = 1; b += –a + 5; System.out.println("f. " + a + " " + b);
        //a = 2; b = 2; a += b–; System.out.println("g. " + a + " " + b);
        a = 2; b = 3; c = 5; a++; b+= a; c *= b; b -= 3; a %= 2; c /= 5; System.out.println("h. " + a + " " + b + " " + c);
        a = 1; b = 2; b++; b = ++a; a*=2; b +=a ; a = ++b + 2; System.out.println("i. " + a + " " + b);
        //a = 1; b = 4; a++; b += a; a *= 4; b -= a; ++b; a = ++b; b = –a + b; System.out.println("j. " + a + " " + b);
    }

    // Ejercicio 1.2
    public static void ejercicio2(){
        int a; int b;

        a=1; b=2; b=b+1; a=a+1; a=a*2; b=b+a; a=b+2;
        System.out.println(a + " " + b);
    }

    // Ejercicio 1.3
    public static void ejercicio3(){
        int a; int b; boolean v;

        a = 1; b = 2; v = (a++ < b); System.out.println("a. " + v);
        a = 1; b = 2; v = (++a < b); System.out.println("b. " + v);
        a = 1; b = 2; v = (++a >= b); System.out.println("c. " + v);
        // a = 1; v = (a); System.out.println("d. " + v);
        a = 1; v = (a != 1); System.out.println("e. " + v);
        a = 1; b = 2; v=(b++ < 10 && a == 1); System.out.println("f. " + v);
        a = 1; b = 2; v=(b == 1 && a >= 1); System.out.println("g. " + v);
        a = 1; b = 2; v=(b < 10 || a++ == 2); System.out.println("h. " + v);
        // a = 1; b = 2; v = (–b <= 1 || a <= 10); System.out.println("i. " + v);
        // a = 1; b = 2; v = (a– == 2 || b == 1); System.out.println("j. " + v);
        a = 1; b = 2; v =! (a == 1 && ++b == 1); System.out.println("k. " + v);
    }
}
