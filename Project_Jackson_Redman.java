import Policy;
import java.util.Scanner;

public class Project_Jackson_Redman
{
    public static void main(String[] args)
    {
        String provider, firstName, lastName, smokingStatus;
        int policyNum, age;
        double height, weight;
        double bmi;

        Scanner keyboard = new Scanner(System.in);
        Policy policy = new Policy();

        System.out.print("Please enter the Policy Number: ");
        policyNum = Integer.parseInt(keyboard.nextLine());
        policy.setPolicyNum(policyNum);

        System.out.print("\nPlease enter the Provider Name: ");
        provider = keyboard.nextLine();
        policy.setProvider(provider);

        System.out.print("\nPlease enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();
        System.out.print("\nPlease enter the Policyholder's Last Name: ");
        lastName = keyboard.nextLine();
        System.out.print("\nPlease enter the policyholder's Age: ");
        age = Integer.parseInt(keyboard.nextLine());
        System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker / non-smoker): ");
        smokingStatus = keyboard.nextLine();
        policy.setHolder(firstName, lastName, age, smokingStatus);

        System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
        height = Double.parseDouble(keyboard.nextLine());
        System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
        weight = Double.parseDouble(keyboard.nextLine());
        policy.setHolderAttributes(height, weight);

        keyboard.close();

        bmi = policy.getBMI();
        policy.dataOutput(bmi, policy.getPolicyCost(bmi));

        System.exit(0);

    }
}