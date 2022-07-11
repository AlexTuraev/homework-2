public class Main {
    public static void main(String[] args) {
        // ------------------ homework Task-1 ------------------
        var a = 0;
        byte b = 1;
        short c = 2;
        int d = 3;
        long e = 4L;

        float f = 1.5f;
        double g = 1000;

        char ch1 = 33;
        boolean t = true;

        //  ------------------ homework Task-2 ------------------
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float weightTotal = weight1 + weight2;
        System.out.println("Total weight = " + weightTotal + " kg\n");

        float weightDifference = weight2 - weight1;
        System.out.println("Weight difference is " + weightDifference + " kg");

        // ------------------ homework Task-3 ------------------
        short bananas = 5*80;
        float milk = 200f/100*105;
        short iceCream = 2*100;
        short eggs = 4*70;
        float task3WeightTotal = bananas + milk + iceCream + eggs;
        System.out.println("Total weight of breakfast = " + task3WeightTotal + "g");
        float task3WeightTotalKg = task3WeightTotal/1000;
        System.out.println("Total weight of breakfast = " + task3WeightTotalKg + "kg\n");

        // ------------------ homework Task-4 ------------------
        float target = 7*1000;
        float countDays1 = target/250;
        System.out.println("Losing weight by 250g will take " + countDays1 + " days");
        float countDays2 = target/500;
        System.out.println("Losing weight by 500g will take " + countDays2 + " days");
        float countDaysAverage = (countDays1 + countDays2) / 2;
        System.out.println("Losing weight on average will take " + countDaysAverage + " days\n");

        // ------------------ homework Task-5 ------------------
        float salary1 = 67_760f;
        float salary2 = 83_690f;
        float salary3 = 76_230f;

        System.out.println("Masha now gets " + salary1 * 1.1f + ". Annual income increased by " + (salary1 * 1.1f - salary1) * 12);
        System.out.println("Denis now gets " + salary2 * 1.1f + ". Annual income increased by " + (salary2 * 1.1f - salary2) * 12);
        System.out.println("Kristina now gets " + salary3 * 1.1f + ". Annual income increased by " + (salary3 * 1.1f - salary3) * 12);
    }
}