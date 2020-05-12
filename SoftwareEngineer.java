public class SoftwareEngineer extends TechnicalEmployee {
    private boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
        codeAccess = false;
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        codeAccess = access;
    }

    public int getSuccessfulCheckIns() {
        return getCheckIns();
    }

    public boolean checkInCode() {
        if (codeAccess)
            addCheckIn();
        return codeAccess;
    }
}
