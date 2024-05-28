public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{ID:" + getId() + " Name: " + getName() +
                " Salary: " + monthlySalary +
                '}';
    }
}
