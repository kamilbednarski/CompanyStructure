public class BusinessLead extends BusinessEmployee {
    private int headcount;
    private Accountant[] directReports = new Accountant[headcount];
    private int teamMembers;

    public BusinessLead(String name) {
        super(name);
        setBaseSalary(100000);
        headcount = 10;
    }

    public boolean hasHeadCount() {
        return teamMembers < headcount;
    }

    public boolean addReport(Accountant accountant, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            directReports[teamMembers] = accountant;
            teamMembers++;
            accountant.supportTeam(supportTeam);
            return true;
        } else
            return false;
    }

    public boolean requestBonus(Employee employee, double bonus) {
        return true;
    }
}
