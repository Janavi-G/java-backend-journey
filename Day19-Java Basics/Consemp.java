public class Consemp {
    public static void main(String [] args){
        Employee emp1 = new Employee("Janavi",101,425000,"IT");
        // Employee emp2 = new Employee("Rahul",102,500000,"HR");

        emp1.showDetails();
        // emp2.showDetails();
        emp1.giveRaise(100);
        emp1.showDetails();
    }
}