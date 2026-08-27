public class Constructor {
    public static void main(String [] args){
        //constructor = A special method to intiialize objects
        //You can pass arguments to a constructor
        //and set up intital values
        Students student1 = new Students("Janavi",22,8.03);
        Students student2 = new Students("Sowjanya",29,8.5);
        Students student3 = new Students("Sandy",27,4.0);

        student1.study();
        student2.study();
        student3.study();





        // System.out.println(student1.name);
        // System.out.println(student1.age);
        // System.out.println(student1.gpa);
        // System.out.println(student1.isEnrolled);
        // System.out.println(student2.name);
        // System.out.println(student2.age);
        // System.out.println(student2.gpa);
        // System.out.println(student2.isEnrolled);
        // System.out.println(student3.name);
        // System.out.println(student3.age);
        // System.out.println(student3.gpa);
        // System.out.println(student3.isEnrolled);
    }
}