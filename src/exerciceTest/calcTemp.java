package exerciceTest;

public class calcTemp {

    public static void main(String[] args) {
        int[] temperatures = {14,5,8,3,-2,2,6,-7,8,-1,1};

        computeClosesToZero(temperatures);
        int closestToZero = computeClosesToZero(temperatures);

        System.out.println("La température la plus proche de zéro est : " + closestToZero);

    }

    public static int computeClosesToZero(int[] temperatures) {

        if (temperatures.length == 0) {
            return 0;
        }

        int closestTemp = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i];

            if (Math.abs(currentTemp) < Math.abs(closestTemp) || (Math.abs(currentTemp) == Math.abs(closestTemp) && currentTemp > 0)) {
                closestTemp = currentTemp;
            }

        }
        return closestTemp;
    }
}





