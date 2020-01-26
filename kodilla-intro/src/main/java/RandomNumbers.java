import java.util.Random;

public class RandomNumbers {
    int max = 0;
    int min = 0;

    public void example() {
        Random random = new Random();
        int suma = 0;

        while (suma < 5000) {
            int randomNumber = random.nextInt(31);

            int min = findMin(randomNumber);
            int max = findMax(randomNumber);

            suma = suma + randomNumber;
            System.out.println("wylosowana liczba" + randomNumber);
            System.out.println(suma);
        }
        System.out.println("Wartosc minimalna wylosowana" + min);
        System.out.println("Wartosc maksymalna wylosowana" + max);
    }

    public int findMax(int number) {
        if (number > max) {
            max = number;
        }
        return max;
    }

    public int findMin(int number) {
        if (number < min) {
            min = number;
        }
        return min;
    }
}