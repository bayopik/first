public class main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            if ((i % 2 != 0) && ((i / 10) % 2 != 0) && ((i / 100) % 2 != 0) && ((i / 1000) % 2 != 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
