import java.util.*;
import java.lang.Math;

class Random_Number_Generator {
    public static void main(String[] args) {
        boolean run = true;
        System.out.println("This program will output a random number in the range specified by you.");
        while (run) {
            Scanner Number1 = new Scanner(System.in);
            System.out.print("Enter the upper limit - ");
            int Upper = Number1.nextInt();
            Scanner Number2 = new Scanner(System.in);
            System.out.print("Enter the lower limit - ");
            int Lower = Number2.nextInt();
            if (Lower > Upper) {
                boolean run2 = true;
                while (run2) {
                    System.out.println("Lower limit cannot be higher than upper limit.");
                    System.out.print("Enter the lower range - ");
                    int Lower1 = Number2.nextInt();
                    if (Lower1 < Upper) {
                        break;
                    }
                    if (Lower1 > Upper) {
                        continue;
                    }

                }

            }

            int Random_number = (int) (Math.random() * (Upper - Lower + 1) + Lower);
            System.out.println("The random number generated is - " + Random_number);
            Scanner A = new Scanner(System.in);
            System.out.print("Do you want to generate a new number? (Yes/No) ");
            String Again = A.nextLine();
            if (Again.equals("Yes")) {
                continue;
            }
            if (Again.equals("No")) {
                break;
            }

            Number1.close();
            Number2.close();
            A.close();
        }
    }
}