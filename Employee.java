public abstract class Employee {
    private String name;
    private double baseSalary;
    private int id;
    private Employee manager;
    private int checkIns;


    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        id++;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) { baseSalary = salary; }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return id;
    }

    public Employee getManager() {
        return manager;
    }

    public boolean equals(Employee other) {
        boolean result = other.getEmployeeId() == this.getEmployeeId();
        return result;
    }

    public String toString() {
        return getEmployeeId() + " " + getName();
    }

    public int getCheckIns() {
        return checkIns;
    }

    public void addCheckIn() { checkIns++; }

    abstract String employeeStatus();
}
