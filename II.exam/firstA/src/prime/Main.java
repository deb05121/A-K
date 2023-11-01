package prime;

public class Main {
    public static void main(String[] args) {
        int max = 16555;
        int firstPrime = getFirstLowerPrime(max);
        System.out.printf("First prime before 16555: %d\n", firstPrime);
        getMorePrimes(firstPrime);
        System.out.println();
        int from = 4000;
        int to = 7935;
        int sum = getPrimesSum(from, to);
        System.out.println(sum);
        boolean isPrime = isPrimeNumber(sum);
        System.out.printf("The %d prime? %b\n", sum, isPrime);
        int sqr = (int) Math.floor(Math.sqrt(sum));
        if (sqr * sqr == sum) {
            System.out.println("Square number.");
        } else {
            System.out.println("Not square number.");
            System.out.printf("First lower prime: %d\n", getFirstLowerPrime(sum));
            System.out.printf("First higher prime: %d\n", getFirstHigherPrime(sum));
            System.out.printf("First lower square: %d\n", getFirstLowerSquareNumber(sum));
            System.out.printf("First higher square: %d\n", getFirstHigherSquareNumber(sum));
        }
    }

    private static int getFirstHigherSquareNumber(int sum) {
        int diff = 1;
        int numericalNeighbor = sum ;
        boolean isNotSquareNumber = true;
        while (isNotSquareNumber) {
            numericalNeighbor += diff;
            int sqr = (int) Math.floor(Math.sqrt(numericalNeighbor));
            if (sqr * sqr == numericalNeighbor) {
                isNotSquareNumber = false;
            }

        }
        return numericalNeighbor;
    }

    private static int getFirstLowerSquareNumber(int sum) {
        int diff = -1;
        int numericalNeighbor = sum ;
        boolean isNotSquareNumber = true;
        while (isNotSquareNumber) {
            numericalNeighbor += diff;
            int sqr = (int) Math.floor(Math.sqrt(numericalNeighbor));
            if (sqr * sqr == numericalNeighbor) {
                isNotSquareNumber = false;
            }
        }
        return numericalNeighbor;
    }


    private static boolean isPrimeNumber(int basic) {
        int sqr = (int) Math.sqrt(basic);
        boolean isPrime = true;
        for (int i = sqr; i > 1; i--) {
            if (basic % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static int getPrimesSum(int from, int to) {
        int sum = 0;
        int basic = from;
        int sqr = (int) Math.sqrt(basic);
        while (basic <= to) {
            boolean isPrime = isPrimeNumber(basic);
            if (isPrime) {
                sum += basic;
            }
            basic++;
        }
        return sum;
    }

    private static void getMorePrimes(int basic) {
        int pieces = 0;
        while (basic > 2) {
            boolean isPrime = isPrimeNumber(basic);
            if (isPrime) {
                pieces++;
                if (pieces % 3 == 0) {
                    System.out.printf("%d ", basic);
                }
            }
            basic--;
        }
    }

    private static int getFirstLowerPrime(int basic) {
        int diff = -1;
        while (basic > 2) {
            boolean isPrime = isPrimeNumber(basic);

            if (isPrime) {
                return basic;
            }
            basic += diff;
        }
        return 0;
    }

    private static int getFirstHigherPrime(int basic) {
        int diff = 1;
        while (basic > 2) {
            boolean isPrime = isPrimeNumber(basic);

            if (isPrime) {
                return basic;
            }
            basic += diff;
        }
        return 0;
    }

}
