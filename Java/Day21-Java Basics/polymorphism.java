public class polymorphism {
    public static void main(String []args){
        //Polymorphism means -> poly = many
        //morph = shape
        //objects can identify as other objects.
        //objects can be treated as objects  of a common superclass.

        caz caz = new caz();
        bikes bik = new bikes();
        boat boa = new boat();
        
        vehicles[] vehicless = {caz,bik,boa};

        for(vehicles vehz: vehicless){
            vehz.go();
        }
    }
}