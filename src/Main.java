public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
    }
}
