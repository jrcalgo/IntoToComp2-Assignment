

public class Policy
{
  private int policyNum;
  private String providerName;

  private String holderFirstName;
  private String holderLastName;
  private int holderAge;
  private String holderSmoker;

  private double holderHeight;
  private double holderWeight;


  public Policy()
  {
    policyNum = 0000;
    providerName = "...";
    holderFirstName = "...";
    holderLastName = "...";
    holderAge = 00;
    holderSmoker = "non-smoker";
    holderHeight = 0.00;
    holderWeight = 0.00;
  }


  public Policy(int num, String provider)
  {
    policyNum = num;
    providerName = provider;
  }


  public Policy(String firstName, String lastName, int age, String smoker)
  {
    holderFirstName = firstName;
    holderLastName = lastName;
    holderAge = age;
    holderSmoker = smoker;
  }


  public Policy(double height, double weight)
  {
    holderHeight = height;
    holderWeight = weight;
  }



  public Policy(int num, String provider, String firstName, String lastName, int age, 
                String smokeStatus, double height, double weight)
  {
    policyNum = num;
    providerName = provider;
    holderFirstName = firstName;
    holderLastName = lastName;
    holderAge = age;
    holderSmoker = smokeStatus;
    holderHeight = height;
    holderWeight = weight;
  }


  public void setHolder(String firstName, String lastName, 
                        int age, String smokeStatus)
  {
    holderFirstName = firstName;
    holderLastName = lastName;
    holderAge = age;
    holderSmoker = smokeStatus;
  }

  public void setPolicyNum(int num)
  {
    policyNum = num;
  }
  
  public void setPolicyNum(String num)
  {
    policyNum = Integer.parseInt(num);
  }

  public int getPolicyNum()
  {
    return policyNum;
  }


  public void setProvider(String provider)
  {
    providerName = provider;
  }

  public String getProvider()
  {
    return providerName;
  }
  

  public void setHolderName(String firstName, String lastName)
  {
    holderFirstName = firstName;
    holderLastName = lastName;
  }

  public void setHolderFirstName(String firstName)
  {
    holderFirstName = firstName;
  }
  
  public void setHolderLastName(String lastName)
  {
    holderLastName = lastName;
  }

  public String getHolderName()
  {
    String name = holderFirstName + " " + holderLastName;
    return name;
  }

  public String getHolderLastName()
  {
    return holderLastName;
  }

  public String getHolderFirstName()
  {
    return holderFirstName;
  }


  public void setHolderAge(int age)
  {
    holderAge = age;
  }

  public int getHolderAge()
  {
    return holderAge;
  }


  public void setSmokingStatus(String smokeStatus)
  {
    holderSmoker = smokeStatus;
  }

  public String getSmokingStatus()
  {
    return holderSmoker;
  }


  public void setHolderAttributes(double height, double weight)
  {
    holderHeight = height;
    holderWeight = weight;
  }

  public double getHeight()
  {
    return holderHeight;
  }

  public double getWeight()
  {
    return holderWeight;
  }




  public double getBMI()
  {
    return ((holderWeight * 703.00) / (holderHeight * holderHeight));
  }

  public double getPolicyCost(double bmi)
  {
    double total = 600.00;

    if (holderAge > 50)
      total += 75.00;

    if (holderSmoker.contentEquals("smoker"))
      total += 100;

    if (bmi > 35.00)
      total += (bmi - 35.00) * 20.00;

    return total;
  }

  public void dataOutput(double bmi, double price) 
  {
    System.out.println("\n+=+=+=+=+ Current Policy Holder Data Output +=+=+=+=+");
    System.out.println("Policy Number: " + policyNum);
    System.out.println("Provider Name: " + providerName);
    System.out.println("Policyholder's First Name: " + holderFirstName);
    System.out.println("Policyholder's Last Name: " + holderLastName);
    System.out.println("Policyholder's Age: " + holderAge);
    System.out.println("Policyholder's Smoking Status: " + holderSmoker);
    System.out.printf("Policyholder's Height: %.1f inches\n", holderHeight);
    System.out.printf("Policyholder's Weight: %.1f pounds\n", holderWeight);
    System.out.printf("Policyholder's BMI: %.2f\n", bmi);
    System.out.printf("Policy Price: $%.2f\n", price);

  }
}
