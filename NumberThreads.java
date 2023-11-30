class NumberThreads {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 15; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 15; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}
