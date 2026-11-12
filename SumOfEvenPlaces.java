
class SumOfEvenPlaces {
    public static void main(String[] args) {
        int num = 123456, sum = 0, place = 1;

        while (num != 0) {
            int digit = num % 10;

            if (place % 2 == 0) {
                sum += digit;
            }

            num /= 10;
            place++;
        }

        System.out.println("Sum of even places: " + sum);
    }
}

    