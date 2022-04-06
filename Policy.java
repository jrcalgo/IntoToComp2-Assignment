
public class Policy
{ 
  // count of policy objects
  private static int policyCount;
  // fields
  private int policyNum;
  private String providerName;
  // policy holder object
  private PolicyHolder holder;


  // constructors below
  public Policy()
  {
    policyNum = 0000;
    providerName = "...";
    holder = new PolicyHolder();
    policyCount++;
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
    policyCount++;
  }

  /**
   * Sets holder object fields
   * @param firstName first name of policy holder
   * @param lastName last name of policy holder
   * @param age age of policy holder
   * @param smoker smoking status of policy holder
   * @param height holder height
   * @param weight holder weight
   */
  public Policy(String firstName, String lastName, int age, String smoker, double height,
                double weight)
  {
    holder = new PolicyHolder(firstName, lastName, age, smoker, height, weight);
    policyCount++;
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
    holder = new PolicyHolder(firstName, lastName, age, smokeStatus, height, weight);
    policyCount++;
  }

  /**
   * 
   * @return count of policy objects
   */
  public int getCount()
  {
    return policyCount;
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
  
  // policyHolder class object method

  /**
   * 
   * @return policyHolder BMI
   */
  public double getHolderBMI()
  {
    return holder.getBMI();
  }

  // calculation methods below

  /**
   * 
   * @return cost of policy
   */
  public double getPolicyCost()
  {
    final double BASE = 600;
    final double FEE_AGE = 75;
    final double FEE_SMOKING = 100;
    final double FEE_BMI = 20;

    final int THRESHOLD_AGE = 50;
    final int THRESHOLD_BMI = 35;

    double total = BASE;

    if (holder.getHolderAge() > THRESHOLD_AGE)
      total += FEE_AGE;

    if (holder.getSmokingStatus().contentEquals("smoker"))
      total += FEE_SMOKING;

    if (holder.getBMI() > THRESHOLD_BMI)
      total += (holder.getBMI() - THRESHOLD_BMI) * FEE_BMI;

    return total;
  }

  /**
   * 
   * @return output of all collected data
   */
  public String toString() 
  {
    String str = "\n\n\n+=+=+=+=+ " + holder.getHolderFirstName() + "'s Data +=+=+=+=+" + 
                 "\nPolicy Number: " + policyNum + "\nProvider Name: " + providerName +
                 holder.toString() + "\nPolicy Price: " + String.format("$%.2f", getPolicyCost());

    return str;
  }

}
