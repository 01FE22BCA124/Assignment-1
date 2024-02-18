public class StudentJob  extends StudentCourses{

        public static void main(String[] args) {
            StudentCourses s=new StudentCourses();
            // Hardcoded student information
            String name = "John Doe";
            String department = "Computer Science";
            String[] courses = {"Introduction to Java", "Data Structures", "Algorithms"};
    
            // Displaying student information
            System.out.println("Student Information:");
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Courses Registered:");
    
            for (String course : courses) {
                System.out.println(" - " + course);
            }

            s.displayStudentMarks();
        
    }
    
    
}
