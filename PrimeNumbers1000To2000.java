class PrimeNumbers1000To2000 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}