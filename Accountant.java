public class Accountant extends BusinessEmployee {
    private TechnicalLead teamSupported;

    public Accountant(String name) {
        super(name);
    }

    public TechnicalLead getTeamSupported() {
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead) {
        teamSupported = lead;
        setBonusBudget(0); // aktualizacja - budzet = il.soft.eng pod tech.lead * ich budzet + 10%
    }

    public boolean approveBonus(double bonus) {
        if (bonus > getBonusBudget() || getTeamSupported() == null)
            return false;
        else
            return true;
    }

    public String employeeStatus() {
        return super.toString() + " with a budget of " + getBonusBudget() + " is supporting " + teamSupported.getName();
    }
}
