public class App {
    public static void main(String[] args) throws Exception {
        PrimeGenerator generator = new PrimeGenerator();
        new Thread(generator).start();

        try {
            Thread.sleep(1000);
        } finally {
            generator.cancel();
        }

        System.out.println(generator.get());
    }
}
