public class Factorialrunner {
    public static void main(String[] args) {
        try{


        for( String s: args) {
            int n = Integer.parseInt(s);

            Thread t = new Thread( new Hilos01(n) );
            t.start();
        }
        }catch (Exception e){
            System.out.printf("Ingresa un número, que sea entero mediante la linea de argumentos");
        }
    }
}