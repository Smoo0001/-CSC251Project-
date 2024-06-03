import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PolicyNumber;
        String ProviderName;
        String PolicyholderFirstName;
        String PolicyholderLastName;
        int PolicyholderAge;
        String PolicyholderSmokingStatus;
        double PolicyholderHeightinches;
        double PolicyholderWeightpounds;

        System.out.print("Please enter the Policy Number: ");
        PolicyNumber = scanner.nextInt();
        
        System.out.print("Please enter the Provider Name: ");
        ProviderName = scanner.next();
        
        System.out.print("Please enter the Policyholder’s First Name: ");
        PolicyholderFirstName = scanner.next();
        
        System.out.print("Please enter the Policyholder’s Last Name: ");
        PolicyholderLastName = scanner.next();
        
        System.out.print("Please enter the Policyholder’s Age: ");
        PolicyholderAge = scanner.nextInt();
        
        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        PolicyholderSmokingStatus = scanner.next();
        
        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        PolicyholderHeightinches = scanner.nextDouble();
        
        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        PolicyholderWeightpounds = scanner.nextDouble();

        // Instantiate object
        ThePolicy policy = new ThePolicy(PolicyNumber, ProviderName, PolicyholderFirstName, PolicyholderLastName, PolicyholderAge, PolicyholderSmokingStatus, PolicyholderHeightinches, PolicyholderWeightpounds);
        
        // Output Policy Number
        System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.geProvider Name());
          System.out.println("Policyholder’s First Name: " + policy.getPolicyholder’s First Name());
           System.out.println("Policyholder’s Last Name: " + policy.getPolicyholder’s Last Name());
            System.out.println("Policyholder’s Age: " + policy.getPolicyholder’s Age());
             System.out.println("Policyholder’s Smoking Status: non-smoker: " + policy.getPolicyholder’s Smoking Status: non-smoker());
              System.out.println("Policyholder’s Height: " + policy.getPolicyholder’s Height());
               System.out.println("Policyholder’s Weight: " + policy.getPolicyholder’s Weight());
        
        // Output Policyholder's BMI
        System.out.println("Policyholder's BMI: " + policy.getBMI());
        
        // Calculate and output Policy Price
        System.out.println("Policy Price: $" + policy.calculatePolicyPrice());
    }
}
