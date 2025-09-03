//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

// Thread to print even numbers
class Even implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

// Thread to print odd numbers
class Odd implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

// Main class
public class Check {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new Even());
        Thread oddThread = new Thread(new Odd());

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}
