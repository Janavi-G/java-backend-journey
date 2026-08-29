public class Consm {
    public static void main(String []args){
        Mobile mo1 = new Mobile("Vivo","Y81",10000.0,50);
        Mobile mo2 = new Mobile("Samsung","M31",20000.0,67);
    
                   mo1.showDetails();
                    mo1.makeCall();
                    mo1.chargeBattery(54);
                    mo1.useBattery(4);
                     mo1.showDetails();
                System.out.println("");
                    mo2.showDetails();
                    mo2.makeCall();
                    mo2.chargeBattery(54);
                    mo2.useBattery(53);
                   System.out.println("");

                    mo2.showDetails();
                }
}