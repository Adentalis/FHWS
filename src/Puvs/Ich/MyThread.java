package Puvs.Ich;

public class MyThread extends Thread {

    int[] a;
    int[] b;

    static int counter = 0;
    int id;

    public MyThread(int[] a) {
        this.a = a;
        counter++;
        id = counter;
        b = new int[a.length];
    }

    @Override
    public void run() {
        //super.run();

        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {

            b[i] = b[i - 1] + a[i];

        }
    }

    public int[] getB() {
        return b;
    }
}
