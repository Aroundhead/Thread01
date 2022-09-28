import java.util.ArrayList;

public class Hilos01 implements Runnable{
    private int max;

    public Hilos01(int n) {
        this.max = n;
    }
    @Override
    public void run() {
        ArrayList<Integer> Factoriales = new ArrayList<Integer>();
        int factorial=1;
        for (int i = 1; i <= max; i++) {
            factorial=factorial*i;
        }
        System.out.println( Thread.currentThread().getName() + ":" +" El factorial de "+max+" es: "+ factorial);
    }
}
