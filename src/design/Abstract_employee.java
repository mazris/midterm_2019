package design;

public class Abstract_employee implements Employee {

    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 10000;
    }

    @Override
    public void benefitLayout() {

    }
}
