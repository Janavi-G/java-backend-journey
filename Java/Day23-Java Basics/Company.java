public class Company {
    String company;
    Det department;
    Add adr;
    Emplo employ;
    Company(String company,Emplo employ,Add adr){
        this.company = company;
        department = new Det("IT");
        this.employ = employ;
        this.adr = adr;
    }

    void companydetails(){
        System.out.println("Comapny Name:  "+ company);
        System.out.println("Department: "+department.dept);
        employ.display();
        adr.address();
    }
}
