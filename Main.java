public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Calculator Service");

        System.out.println("Personal Calculator");
        PersonalCalculator.calculate();

        System.out.println("Interest Calculator");
        InterestCalculator.calculate();

        System.out.println("SIP Calculator");
        SIPCalculator.calculate();

        System.out.println("CI Calculator");
        CICalculator.calculate();

    }

}
