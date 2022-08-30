package task1;

public class Task11 {

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double avg = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
                if (min > ints[j]) {
                    min = ints[j];
                }
                avg += (double) ints[j] / (array.length * array.length);
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
