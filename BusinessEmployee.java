public abstract class BusinessEmployee extends Employee {
    private int bonusBudget;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    public double getBonusBudget() {
        return  bonusBudget;
    }

    public void setBonusBudget(int budget) { bonusBudget = budget; }

    public String employeeStatus() {
        return super.toString() + " with a budget of " + getBonusBudget();
    }
}
