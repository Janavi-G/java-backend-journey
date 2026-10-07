public enum TL {
    RED("Stop"),
    YELLOW("Steady"),
    GREEN("Go");

    private final String number;

    TL(String number){
        this.number = number;
    }

    public String getnumber(){
        return this.number;
    }
}