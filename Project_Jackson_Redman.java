
import java.util.Scanner;
import java.io.*;

public class Project_Jackson_Redman
{
    public static void main(String[] args) throws IOException
    {
        // file name in directory
        String fileName = "PolicyInformation.txt";

        // sets amount of policies to process based off line count
        final int POLICY_VARS = 8;
        int policyCount = getLineCount(fileName) / POLICY_VARS;

        // processes and outputs data 
        outputFileData(fileName, policyCount);

        // end program
        System.exit(0); 

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

    public static void outputFileData(String fileName, int dataEntries) throws IOException
    {
        int policyNum;
        String provider;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;

        Scanner readFile = new Scanner(new File(fileName));

        Policy[] policy = new Policy[dataEntries];

        try 
        {
            for (int i = 0; i < policy.length; i++)
            {
                while (readFile.hasNext())
                {
                    policy[i].setPolicyNum(readFile.nextLine());
                    policy[i].setProvider(readFile.nextLine());
                }
                System.out.println("This woks.");
            }
        } 
        catch (Exception e)
        {
            System.out.println("Error. Problem reading file.");
        }
        
        readFile.close();
    }
}