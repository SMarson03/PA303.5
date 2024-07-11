public class Tuition {
    //Suppose the tuition for a university is $10,000 for the current year
    // and increases by 7 percent every year. In how many years will the
    // tuition be doubled?

    public static void main(String[] args) {
        futureTuition();

    }
    public static void futureTuition () {


        double t1 = 10000;
        double finalTuition = t1 * 2;

        double currentAmount = 10000;

        for (int i = 1; currentAmount < finalTuition; i++) {
            currentAmount += currentAmount * 7 / 100;
            if (currentAmount > finalTuition) {

                System.out.printf("The amount of years it would take is %d to be %.2f", i, currentAmount);
            }
        }
    }
    }


    //Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
    //In how many years will the tuition be doubled?




