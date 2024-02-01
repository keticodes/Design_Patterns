package OrganisationScrtucture;

class Employee implements OrganizationalUnit {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationalUnit unit) {
        // Employees cannot have sub-elements, so this method does nothing.
    }

    @Override
    public void remove(OrganizationalUnit unit) {
        // Employees cannot have sub-elements, so this method does nothing.
    }

    @Override
    public void print() {
        System.out.println("Employee: " + name + " - Salary: $" + salary);
    }
}