public class Main {
    public static int getLargestPrime(int number) {
        for (int i = number; i > 1; i--) {
            if (number % i == 0) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return i;
            }
        }
        return -1;
    }
}