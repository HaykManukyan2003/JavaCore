package folders.timeClassCaseStudy;

public class TimeTest {

    private static void displayTime(String header, Time1 object) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, object.toUniversalString(), object.toString());
    }

    public static void main(String[] args) {

        Time1 time1 = new Time1();

        displayTime("after time object is created:", time1);
        System.out.print("\n");

        time1.setTime(13, 16, 9);
        displayTime("after calling setTime", time1);


        try {
            time1.setTime(99, 88, 99);
            System.out.println("ggYo"); //will not print;
        } catch (IllegalArgumentException e) {
            System.out.printf("exception: %s%n", e);
        }

        displayTime("After calling setTime with invalid values", time1);

        try {
            Time1 time11 = new Time1(89, 90);
            System.out.println(time11.toUniversalString()); // will not display if time11 obj throws an exception;
        } catch (IllegalArgumentException e) {
            System.out.println("Exception while initializing a new Time object: " + e.getMessage());
        }



    }
}
