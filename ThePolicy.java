import java.util.*;
public class ThePolicy{
//The Attributes
   private int PolicyNumber;
   private String ProviderName;
   private String PolicyholderFirstName;
   private String PolicyholderLastName;
   private int PolicyholderAge;
   private String PolicyholderSmokingStatus;
   private double PolicyholderHeightinches;
   private double PolicyholderWeightpounds;
   //no-arg construtor
   public ThePolicy()
   {
      PolicyNumber = 1234;
      ProviderName = "State Farm";
      PolicyholderFirstName = "John";
      PolicyholderLastName = "Doe";
      PolicyholderAge = 24;
      PolicyholderSmokingStatus = "non-smoker";
      PolicyholderHeightinches = 62.0;
      PolicyholderWeightpounds = 250.5;

   }
   //construtor
   public ThePolicy(int PolicyNumber, String ProviderName, String PolicyholderFirstName, String PolicyholderLastName, int PolicyholderAge, String PolicyholderSmokingStatus, double PolicyholderHeightinches, double PolicyholderWeightpounds)
   {
      PolicyNumber = PolicyNumber;
      ProviderName = ProviderName;
      PolicyholderFirstName = PolicyholderFirstName;
      PolicyholderLastName = PolicyholderLastName; 
      PolicyholderAge = PolicyholderAge;
      PolicyholderSmokingStatus = PolicyholderSmokingStatus;
      PolicyholderHeightinches = PolicyholderHeightinches;
      PolicyholderWeightpounds = PolicyholderWeightpounds; 
   }
   //Setter(Mutator) and Getter(Accessoer) 
   public void setPolicyNumber(int PolicyNumber)
   {
      PolicyNumber = PolicyNumber;
   }
   public int getPolicyNumber()
   {
      return PolicyNumber;
   }

    public void setProviderName(String ProviderName)
   {
      ProviderName = ProviderName;
   }
   public int getProviderName()
   {
      return ProviderName;
   }

   public void setPolicyholderFirstName(String PolicyholderFirstName)
   {
      PolicyholderFirstName = PolicyholderFirstName;
   }
   public String getPolicyholderFirstName()
   {
      return PolicyholderFirstName;
   }
   
      public void setPolicyholderLastName(String PolicyholderLastName)
   {
      PolicyholderLastName = PolicyholderLastName;
   }
   public String getPolicyholderLastName()
   {
      return PolicyholderLastName;
   }

   public void setPolicyholderAge(int PolicyholderAge)
   {
      PolicyholderAge = PolicyholderAge;
   }
   public int getPolicyholderAge()
   {
      return PolicyholderAge;
   }

   public void setPolicyholderSmokingStatus( String PolicyholderSmokingStatus)
   {
      PolicyholderSmokingStatus = PolicyholderSmokingStatus;
   }
   public int getPolicyholderSmokingStatus()
   {
      return PolicyholderSmokingStatus;
   }

   public void setPolicyholderHeightinches( double PolicyholderHeightinches)
   {
      PolicyholderHeightinches = PolicyholderHeightinches;
   }
   public double getPolicyholderHeightinches()
   {
      return PolicyholderHeightinches;
   }


      public void setPolicyholderWeightpounds( double PolicyholderWeightpounds)
   {
      PolicyholderWeightpounds = PolicyholderWeightpounds;
   }
   public double getPolicyholderWeightpounds()
   {
      return PolicyholderWeightpounds; 
   }
   //Method to calculates and returns the BMI of the policyholder
   //BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
   public double getBMI()
   {
      return (62.0 * 703 ) / (250.5^2 );
   }
   // public double getPolicyPrice()
   // {
   //    double InsurancePolicy = 600.0; 
   // }
   // Method to calculate insurance policy price
   public double calculatePolicyPrice() {
      double baseFee = 600.0;
      double additionalFee = 0.0;
    
    // Additional fee for policyholders over 50 years old
      if (PolicyholderAge > 50) {
        additionalFee += 75.0;
    }
    
    // Additional fee for smokers
      if (PolicyholderSmokingStatus.equalsIgnoreCase("smoker")) {
        additionalFee += 100.0;
    }
    
    // Calculate BMI
      double bmi = getBMI();
    
    // Additional fee for high BMI (over 35)
      if (bmi > 35) {
        additionalFee += (bmi - 35) * 20;
    }
    
      return baseFee + additionalFee;
}


   



}



   
