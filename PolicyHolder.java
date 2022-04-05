public class PolicyHolder 
{
    // fields
    private String holderFirstName;
    private String holderLastName;
    private int holderAge;
    private String holderSmoker;
    private double holderHeight;
    private double holderWeight;


    public PolicyHolder() 
    {
        holderFirstName = "john";
        holderLastName = "doe";
        holderAge = 0;
        holderSmoker = "non-smoker";
        holderHeight = 0.00;
        holderWeight = 0.00;
    }

    public PolicyHolder(String firstName, String lastName, int age, String smokeStatus,
                        double height, double weight)
    {
        holderFirstName = firstName;
        holderLastName = lastName;
        holderAge = age;
        holderSmoker = smokeStatus;
        holderHeight = height;
        holderWeight = weight;
    }


    /**
    * 
    * @param firstName first name of policy holder
    * @param lastName last name of policy holder
    */
    public void setHolderName(String firstName, String lastName)
    {
        holderFirstName = firstName;
        holderLastName = lastName;
    }

    /**
     * 
     * @param firstName first name of policy holder
     */
    public void setHolderFirstName(String firstName)
    {
        holderFirstName = firstName;
    }

    /**
     * 
     * @param lastName last name of policy holder
     */
    public void setHolderLastName(String lastName)
    {
        holderLastName = lastName;
    }

    /**
     * 
     * @return outputs policy holder full name
     */
    public String getHolderName()
    {
        String name = holderFirstName + " " + holderLastName;
        return name;
    }

    /**
     * 
     * @return outputs policy holder last name
     */
    public String getHolderLastName()
    {
        return holderLastName;
    }

    /**
     * 
     * @return outputs policy holder first name
     */
    public String getHolderFirstName()
    {
        return holderFirstName;
    }


    /**
     * 
     * @param age age of policy holder as integer
     */
    public void setHolderAge(int age)
    {
        holderAge = age;
    }

    /**
     * 
     * @param age age of policy holder as String
     */
    public void setHolderAge(String age)
    {
        holderAge = Integer.parseInt(age);
    }

    /**
     * 
     * @return outputs policy holder age
     */
    public int getHolderAge()
    {
        return holderAge;
    }


    /**
     * 
     * @param smokeStatus smoking status of policy holder
     */
    public void setSmokingStatus(String smokeStatus)
    {
        holderSmoker = smokeStatus;
    }

    /**
     * 
     * @return outputs smoking status of policy holder
     */
    public String getSmokingStatus()
    {
        return holderSmoker;
    }


    /**
     * 
     * @param height height of holder
     * @param weight weight of holder
     */
    public void setHolderAttributes(double height, double weight)
    {
        holderHeight = height;
        holderWeight = weight;
    }

    /**
     * 
     * @return outputs height
     */
    public double getHeight()
    {
        return holderHeight;
    }

    /**
     * 
     * @return outputs weight
     */
    public double getWeight()
    {
        return holderWeight;
    }

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
     * @return string output of all collected data
     */
    public String toString()
    {
        String str = "\nPolicyholder's First Name: " + holderFirstName +
                     "\nPolicyholder's Last Name: " + holderLastName +
                     "\nPolicyholder's Age: " + holderAge +
                     "\nPolicyholder's Smoking Status: " + holderSmoker +
                     "\nPolicyholder's height: " + holderHeight +
                     "\nPolicyholder's weight: " + holderWeight +
                     "\nPolicyholder's BMI: " + String.format("%.2f", getBMI());

        return str;
    }

}