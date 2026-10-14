public class Constructortwo {
    public static void main(String[] args){
        Student student1 = new Student("Janavi",22,"Java");
        Student student2 = new Student("Rahul",21,"Python");
        
        System.out.println("Student 1:");
        System.out.println("Name:"+student1.name);
        System.out.println("Age:"+student1.age);
        System.out.println("Course:"+student1.course);
        System.out.println("Student2:");
        System.out.println("Name:"+student2.name);
        System.out.println("Age:"+student2.age);
        System.out.println("Course:"+student2.course);
    }
}
