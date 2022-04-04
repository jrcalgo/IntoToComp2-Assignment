import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Project_Jackson_Redman 
{
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        int policyNum;
        String provider;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;
        int numSmokers = 0;
        
        String file = "PolicyInformation.txt";

        final int POLICY_VARS = 8;
        int policyCount = getLineCount(file) / POLICY_VARS;

        ArrayList<Policy> policies = new ArrayList<Policy>(policyCount);

        Scanner inputFile = new Scanner(new File(file));

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
            
            if (smokingStatus.equalsIgnoreCase("smoker"))
                numSmokers++;  
            
            
            policies.add(new Policy(policyNum, provider, firstName, lastName, age, smokingStatus, height, weight));

        }

        for (Policy policy : policies)
        {
            policy.dataOutput();
        }

        System.out.println("\n\nThe total number of policies with a smoker is: " + numSmokers);
        System.out.println("The total number of policies with a non-smoker is: " + (policies.size() - numSmokers) );

    }



    public static int getLineCount(String fileName) throws IOException, FileNotFoundException
    {

        BufferedReader readLines = new BufferedReader(new FileReader(fileName));
        int lineCount = 0;

        try 
        { // count number of lines
            while (readLines.readLine() != null) // ignore blank lines
            {
                lineCount++; // iterate number of lines
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error. Problem reading file.");
        }

        readLines.close();

        return lineCount;
    }

}
