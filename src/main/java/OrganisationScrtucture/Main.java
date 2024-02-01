package OrganisationScrtucture;

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        // Creating employees
        OrganizationalUnit employee1 = new Employee("John Doe", 50000);
        OrganizationalUnit employee2 = new Employee("Jane Smith", 60000);

        // Creating departments
        OrganizationalUnit department1 = new Department("Engineering");
        OrganizationalUnit department2 = new Department("Marketing");

        // Adding employees to departments
        ((Department) department1).add(employee1);
        ((Department) department2).add(employee2);

        // Creating the organization
        OrganizationalUnit organization = new Organization();

        // Adding departments to the organization
        ((Organization) organization).add(department1);
        ((Organization) organization).add(department2);

        // Printing the organization structure
        organization.print();
    }
}