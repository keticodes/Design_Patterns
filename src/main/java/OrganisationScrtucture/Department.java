package OrganisationScrtucture;

import java.util.*;
class Department implements OrganizationalUnit {
    private String name;
    private List<OrganizationalUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationalUnit unit) {
        units.add(unit);
    }

    @Override
    public void remove(OrganizationalUnit unit) {
        units.remove(unit);
    }

    @Override
    public void print() {
        System.out.println("Department: " + name);

        for (OrganizationalUnit unit : units) {
            unit.print();
        }
    }
}
