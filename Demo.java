import java.io.*;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<Policy> policies = new ArrayList<>();

        // Read from file
        try {
            File file = new File("PolicyInformation.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                int policyNumber = Integer.parseInt(scanner.nextLine().trim());
                String providerName = scanner.nextLine().trim();
                String firstName = scanner.nextLine().trim();
                String lastName = scanner.nextLine().trim();
                int age = Integer.parseInt(scanner.nextLine().trim());
                String smokingStatus = scanner.nextLine().trim();
                double heightInches = Double.parseDouble(scanner.nextLine().trim());
                double weightPounds = Double.parseDouble(scanner.nextLine().trim());

                // Create Policy object and add to list
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                           age, smokingStatus, heightInches, weightPounds);
                policies.add(policy);

                // Skip empty line between policies
                if (scanner.hasNextLine()) {
                    scanner.nextLine(); // Skip the blank line
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Display policies (optional)
        for (Policy policy : policies) {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height (inches): " + policy.getHeightInches());
            System.out.println("Policyholder's Weight (pounds): " + policy.getWeightPounds());
            System.out.println();
        }
    }
}

