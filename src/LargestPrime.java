public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime (int number){
        if (number < 2){
            return -1;
        }
        boolean isPrime = true;
        int primeFactor = number;
        for (int i = 2; i < number/2; i++){
            if(number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    primeFactor = i;
                }
            }
        }
        return primeFactor;
    }
}
