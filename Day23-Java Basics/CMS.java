public class CMS {
    public static void main(String []args){
        Emplo employee = new Emplo("Janavi",101,56000);
        Add address = new Add("Bangalore","Karnataka");
        Company comp = new Company("HCL Tech",employee,address);
        comp.companydetails();
    }
    }