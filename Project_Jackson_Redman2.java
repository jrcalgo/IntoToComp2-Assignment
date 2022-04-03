import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Project_Jackson_Redman2 
{
    private static Policy[] policies = new Policy[policyCount]
    public static void main(String[] args) throws IOException
    {
        int policyNum;
        String provider;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;
        int numSmoker;
        
        String fileName = "PolicyInformation.txt";

        final int POLICY_VARS = 8;
        int policyCount = getLineCount(fileName) / POLICY_VARS;

        ArrayList<Policy> policies = new ArrayList<Policy>(policyCount);

        Scanner inputFile = new Scanner(new File(fileName));

        while(inputFile.hasNext())
        {

            policyNum = inputFile.nextInt();
            inputFile.nextLine();
            provider = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();


            if (inputFile.hasNext())
                inputFile.nextLine();
            if (inputFile.hasNext())
                inputFile.nextLine();
            
            policies.add(new Policy(policyNum, provider, firstName, lastName, age, smokingStatus, height, weight));

        }

        for (Policy policy : policies)
        {
            policy.dataOutput();

            if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
                numSmoker++;
        }
    }



    public static int getLineCount(String fileName) throws IOException
    {

        LineNumberReader readLines = new LineNumberReader(new FileReader(fileName));
        int lineCount = 0;

        try 
        { // count number of lines
            while (readLines.readLine() != null) // ignore blank lines
            {
                lineCount++; // iterate number of lines
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error. Problem reading file.");
        }

        readLines.close();

        return lineCount;
    }

}
