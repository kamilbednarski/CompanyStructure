public class TechnicalLead extends TechnicalEmployee {
    private int headcount;
    private SoftwareEngineer[] directReports = new SoftwareEngineer[headcount];
    private int teamMembers;

    public TechnicalLead(String name) {
        super(name);
        setBaseSalary(75000 * 1.3);
        headcount = 4;
        teamMembers = 0;
    }

    public boolean hasHeadCount() {
        if (teamMembers < headcount) {
            return true;
        }else
            return false;
    }

    public boolean addReport(SoftwareEngineer engineer) {
        if (hasHeadCount()) {
            directReports[teamMembers] = engineer;
            teamMembers++;
            return true;
        } else
            return false;
    }

    public boolean approveCheckIn(SoftwareEngineer engineer) {
        if (engineer == directReports[0] || engineer == directReports[1] || engineer == directReports[2] || engineer == directReports[3] && engineer.checkInCode() == true ) {
            return true;
        }else
            return false;
    }

    public boolean requestBonus(Employee employee, double bonus) {
        if() {
            employee.addBonus(bonus);
            return true;
        }else
            return false;
    }

    public void getTeamStatus() {
        if (teamMembers > 0) {
            System.out.println(employeeStatus() + " and is managing: ");
            for (int i = 0; i < teamMembers; i++) {
                System.out.println(directReports[i].employeeStatus();
            }
        } else
            System.out.println(employeeStatus() + " and no direct reports yet.");
    }
}
