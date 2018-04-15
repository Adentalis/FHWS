package Puvs.Ich;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int array_length = 16;
        int a[] = new int[array_length];
        long b[] = new long[array_length];
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Kerne: " + cores);

        //init a
        for (int i = 1; i <= array_length; i++) {
            a[i - 1] = i;
        }

        //sequentielle Abarbeitung
        /*
        long time1 = System.nanoTime();
        b[0]= a[0];
        for(int i = 1; i <array_length;i++){

            b[i]= b[i-1]+a[i];
        }
        long time2 = System.nanoTime();
        */

        //mithilfe von Threads
        long time1 = System.nanoTime();

        MyThread t1 = new MyThread(a);
        MyThread t2 = new MyThread(a);
        MyThread t3 = new MyThread(a);
        MyThread t4 = new MyThread(a);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] dummyb1 = t1.getB();
        int[] dummyb2 = t2.getB();
        int[] dummyb3 = t3.getB();
        int[] dummyb4 = t4.getB();

        for (int i = 0; i < dummyb1.length; i++) {
            System.out.print(dummyb2[i] + "  ");
        }

        long time2 = System.nanoTime();


        double s = (time2 - time1) / 1000000000.0;
        System.out.println("Dauer in ns: " + (time2 - time1));
        System.out.println("Dauer s: " + s);
        System.out.println("Ergebnis: " + b[array_length - 1]);

        // printResult(a,b,array_length);


    }

    private static void printResult(int[] a, int[] b, int l) {
        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < l; i++) {
            System.out.print(b[i] + " ");
        }
    }

}


