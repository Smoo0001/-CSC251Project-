public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double heightInches;
    private double weightPounds;

    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double heightInches, double weightPounds) {
        policyNumber = policyNumber;
        providerName = providerName;
        firstName = firstName;
        lastName = lastName;
        age = age;
        smokingStatus = smokingStatus;
        heightInches = heightInches;
        weightPounds = weightPounds;
    }

    // Getters (omitted setters for brevity)
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeightInches() {
        return heightInches;
    }

    public double getWeightPounds() {
        return weightPounds;
    }
}
