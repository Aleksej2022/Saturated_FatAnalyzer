package fat_aanlyzer;

import java.util.Scanner;

public class Saturated_FatAnalyzer {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        System.out.printf("%80s %n", "Dear user, welcome to the coffee saturated analyzer");
        System.out.println("This program calculates the saturated fat percentage present in different types of coffee");
        System.out.printf("%80s %n", "You can only calculate the saturated fat percentage for two types of coffee maximum");

        System.out.println("*********************Coffee Saturated Fat Analyzer*********************");
        System.out.printf("%80s %n", "How many coffee types would you like to calculate the saturated fat percentage");
        System.out.printf("%50s","Response: -> ");

        int coffee_type = number.nextInt();
        if (coffee_type == 1){
            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Calculation*********************");
            System.out.println("Coffee name: -> ");
            String coffee_name = text.nextLine();

            System.out.println("Saturated Fat Content(g): -> ");
            double sat_fatcontent = number.nextDouble();

            System.out.println("Total calories(cal): -> ");
            double calories = number.nextDouble();
            double sat_fatpercent = ((sat_fatcontent * 9) / calories) * 100;
            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Calculation*********************");

            //Display information received and calculated
            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Analytics*********************");
            System.out.printf("%20s","Coffee names");
            System.out.printf("%30s","Saturated Fat Content(g)");
            System.out.printf("%30s","Total food calories(cal)");
            System.out.printf("%30s","Saturated Fat Content(%)");
            System.out.println();

            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Analytics*********************");
            System.out.printf("%20s",coffee_name);
            System.out.printf("%20s",sat_fatcontent);
            System.out.printf("%25s",calories);
            System.out.printf("%20s %.2f","",sat_fatpercent);
        }
        else if (coffee_type == 2){
            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Calculation*********************");
            System.out.println("First Coffee name: -> ");
            String coffee_name1 = text.nextLine();

            System.out.println("Saturated Fat Content(g): -> ");
            double sat_fatcontent1 = number.nextDouble();

            System.out.println("Total calories(cal): -> ");
            double calories1 = number.nextDouble();
            double sat_fatpercent1 = ((sat_fatcontent1 * 9) / calories1) * 100;
            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Calculation*********************");

            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Calculation*********************");
            System.out.println("Second Coffee name: -> ");
            String coffee_name2 = text.nextLine();

            System.out.println("Saturated Fat Content(g): -> ");
            double sat_fatcontent2 = number.nextDouble();

            System.out.println("Total calories(cal): -> ");
            double calories2 = number.nextDouble();
            double sat_fatpercent2 = ((sat_fatcontent2 * 9) / calories2) * 100;
            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Calculation*********************");



            //Display information received and calculated
            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Analytics*********************");
            System.out.printf("%20s","Coffee names");
            System.out.printf("%30s","Saturated Fat Content(g)");
            System.out.printf("%30s","Total food calories(cal)");
            System.out.printf("%30s","Saturated Fat Content(%)");
            System.out.println();

            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Analytics*********************");
            System.out.printf("%20s",coffee_name1);
            System.out.printf("%20s",sat_fatcontent1);
            System.out.printf("%25s",calories1);
            System.out.printf("%20s %.2f","",sat_fatpercent1);

            System.out.println();

            System.out.printf("%80s %n", "*********************Coffee Saturated Fat Analytics*********************");
            System.out.printf("%20s",coffee_name2);
            System.out.printf("%20s",sat_fatcontent2);
            System.out.printf("%25s",calories2);
            System.out.printf("%20s %.2f","",sat_fatpercent2);


            System.out.printf("%80s %n", "*********************Final Results*********************");

            if (sat_fatpercent1 > sat_fatpercent2){
                System.out.println("The first type of coffee has a higher saturated fat percentage than the second type of coffee");
            }
           else if (sat_fatpercent2 > sat_fatpercent1){
                System.out.println("The second type of coffee has a higher saturated fat percentage than the first type of coffee");
            }
        }
        else {
            System.out.println("Sorry, you can only calculate the saturated fat percentage for just two types of coffee maximum");
        }

    }
}
