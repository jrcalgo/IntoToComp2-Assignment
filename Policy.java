

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
    providerName = "";
    holderFirstName = "";
    holderLastName = "";
    holderAge = 00;
    holderSmoker = "non-smoker";
    holderHeight = 0.0;
    holderWeight = 0.0;
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
                String smoker, double height, double weight)
  {
    policyNum = num;
    providerName = provider;
    holderFirstName = firstName;
    holderLastName = lastName;
    holderAge = age;
    holderSmoker = smoker;
    holderHeight = height;
    holderWeight = weight;
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


  public void setSmokingStatus(String smoker)
  {
    holderSmoker = smoker;
  }

  public String getSmokingStatus()
  {
    return holderSmoker;
  }


  public void setAttributes(double height, double weight)
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
    double numerator = (holderWeight * 703);
    double denominator = (holderHeight * holderHeight);

    double bmi = numerator / denominator;
    return bmi;
  }

  public double getPolicyCost(int age, String smoker, double bmiValue)
  {
    double cost = 600;

    if (age > 50)
      cost += 75;

    if (smoker.equalsIgnoreCase("smoker"))
      cost += 100;

    if (bmiValue > 35)
      cost += (bmiValue - 35) * 20;

    return cost;
  }
}
