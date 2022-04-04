
public class Policy
{ 
  // fields
  private int policyNum;
  private String providerName;

  private String holderFirstName;
  private String holderLastName;
  private int holderAge;
  private String holderSmoker;

  private double holderHeight;
  private double holderWeight;

  // constructors below
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

  /**
   * 
   * @param num policy number
   * @param provider name of policy provider
   */
  public Policy(int num, String provider)
  {
    policyNum = num;
    providerName = provider;
  }

  /**
   * 
   * @param firstName first name of policy holder
   * @param lastName last name of policy holder
   * @param age age of policy holder
   * @param smoker smoking status of policy holder
   */
  public Policy(String firstName, String lastName, int age, String smoker)
  {
    holderFirstName = firstName;
    holderLastName = lastName;
    holderAge = age;
    holderSmoker = smoker;
  }

  /**
   * 
   * @param height height of policy holder
   * @param weight weight of policy holder
   */
  public Policy(double height, double weight)
  {
    holderHeight = height;
    holderWeight = weight;
  }

  /**
   * 
   * @param num number of policy
   * @param provider name of policy provider
   * @param firstName first name of policy holder
   * @param lastName last name of policy holder
   * @param age age of policy holder
   * @param smokeStatus smoking status of policy holder
   * @param height height of policy holder
   * @param weight weight of policy holder
   */
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


  /**
   * 
   * @param num number of policy as integer
   */
  public void setPolicyNum(int num)
  {
    policyNum = num;
  }
  
  /**
   * 
   * @param num number of policy as string
   */
  public void setPolicyNum(String num)
  {
    policyNum = Integer.parseInt(num);
  }

  /**
   * 
   * @return outputs number of policy
   */
  public int getPolicyNum()
  {
    return policyNum;
  }

  /**
   * 
   * @param provider name of policy provider
   */
  public void setProvider(String provider)
  {
    providerName = provider;
  }

  /**
   * 
   * @return outputs policy provider name
   */
  public String getProvider()
  {
    return providerName;
  }
  

  // calculation methods below

  /**
   * 
   * @return calculated BMI
   */
  public double getBMI()
  {
    return ((holderWeight * 703.00) / (holderHeight * holderHeight));
  }

  /**
   * 
   * @param bmi calculated BMI
   * @return cost of policy
   */
  public double getPolicyCost()
  {
    double total = 600.00;

    if (holderAge > 50)
      total += 75.00;

    if (holderSmoker.contentEquals("smoker"))
      total += 100;

    if (getBMI() > 35.00)
      total += (getBMI() - 35.00) * 20.00;

    return total;
  }

  /**
   * 
   * @return output of all collected data
   */
  public void dataOutput() 
  {
    System.out.println("\n+=+=+=+=+ " + holderFirstName + "'s Policy Data Output +=+=+=+=+");
    System.out.println("Policy Number: " + policyNum);
    System.out.println("Provider Name: " + providerName);
    System.out.println("Policyholder's First Name: " + holderFirstName);
    System.out.println("Policyholder's Last Name: " + holderLastName);
    System.out.println("Policyholder's Age: " + holderAge);
    System.out.println("Policyholder's Smoking Status: " + holderSmoker);
    System.out.printf("Policyholder's Height: %.1f inches\n", holderHeight);
    System.out.printf("Policyholder's Weight: %.1f pounds\n", holderWeight);
    System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
    System.out.printf("Policy Price: $%.2f\n", getPolicyCost());

  }
}
