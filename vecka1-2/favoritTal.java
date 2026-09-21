public class favoritTal {
    public static void main (String[] args) {

        int[] numbers= {17, 4, 36, 10, 8};
        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i= 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        for (int i =0; i < numbers.length; i++){
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];

            }
        }
        System.out.println("Summan av alla tal är: " + sum);
        System.out.println("Det största talet är: " + largest);
        System.out.println("Det minsta talet är: " + smallest);
    }
}
