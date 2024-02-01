package OrganisationScrtucture;

import java.util.ArrayList;
import java.util.List;


// Composite class representing the entire organization
class Organization implements OrganizationalUnit {
    private List<OrganizationalUnit> units = new ArrayList<>();

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
        System.out.println("Organization:");

        for (OrganizationalUnit unit : units) {
            unit.print();
        }
    }
}
