public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);

        Thread thread1 = new Thread(() -> {
            atm.withdraw(200);
        });

        Thread thread2 = new Thread(() -> {
            atm.deposit(500);
        });

        Thread thread3 = new Thread(() -> {
            atm.withdraw(300);
        });

        Thread thread4 = new Thread(() -> {
            atm.deposit(700);
        });


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}