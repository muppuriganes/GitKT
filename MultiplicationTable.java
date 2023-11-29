class MultiplicationExample {
    int num;

    public void multiplication(int num) {
        this.num = num;
    }

    public void display() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

class ClassA extends Thread {
    MultiplicationExample m;

    ClassA(MultiplicationExample m) {
        this.m = m;
    }

    public void run() {
        m.multiplication(2);
        m.display();
    }
}

class ClassB implements Runnable {
    MultiplicationExample m;

    ClassB(MultiplicationExample m) {
        this.m = m;
    }

    public void run() {
        m.multiplication(5);
        m.display();
    }
}

public class MultiplicationTable {
    public static void main(String args[]) {
        MultiplicationExample obj1 = new MultiplicationExample();
        MultiplicationExample obj2 = new MultiplicationExample();

        ClassA a = new ClassA(obj1);
        ClassB b = new ClassB(obj2);

        Thread t1 = new Thread(b);
        a.start();

        // Using sleep in the main thread
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Sleep Method");
        t1.start();
        Thread.yield();

        // Suspending and resuming t1
        // a.suspend();
        // System.out.println("t1 suspended");
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // a.resume();
        // System.out.println("t1 resumed");

        // Using join to wait for t1 to finish
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Using wait and notify in the main thread
        synchronized (obj2) {
            try {
                System.out.println("Main thread waiting");
                obj2.wait();
                System.out.println("Main thread notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}