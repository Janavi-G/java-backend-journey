public enum Role {
    DEVELOPER("To develop projects from scratch"),
    TESTER("To test the developed project"),
    MANAGER("To co ordinate works between employees"),
    HR("To manage the company");

    private final String roles;

    Role(String roles){
        this.roles = roles;
    }

    public String getRoles(){
        return this.roles;
    }
}