import java.util.*;

public class Course {

    // creating a data field for Course
    String courseName;
    String courseLecturer;
    int numberOfStudents;
    
    // the construtor
    public Course(String courseName, String courseLecturer, int numberOfStudents){
        this.courseName = courseName;
        this.courseLecturer = courseLecturer;
        this.numberOfStudents = numberOfStudents;
    }

    // creating the get and set of Course
    public String getCourseName(){
        return courseName;
    }

    public String getCourseLecturer(){
        return courseLecturer;
    }

    public int getNumberOfStudent(){
        return numberOfStudents;
    }
    
    // the toString of Course
    public String DisplayCourse(){
        String output = "The name of the course: " + courseName+
        "\n The name of the lecturer is: " + courseLecturer+
        "\nThe number of students is: " + numberOfStudents;
        

        return output;
    }

    public static void main(String[] args) {

        // creating the ArrayList with the name "course1"
        ArrayList<String> course1 = new ArrayList<String>();
        
        // adding courses to the list
        course1.add("C++, P Johnson, 23");
        course1.add("Python, RM Mbelengwa, 45");
        course1.add("JavaScript, JR Smith, 58");
        course1.add("PHP, S Meyer, 44");
        course1.add("SQL, MM Nunez, 46");

        System.out.println(course1);  // printing out the list

        Collections.sort(course1);   // sorting the list into alphaphetcal order
        System.out.println("The sorted courses " + course1);  // printing out the sorted list

        // swaping courses in first and second place 
        Collections.swap(course1, 0, 1);
        System.out.println("My list after swap: " + course1);

        // creating a new list named "course2"
        ArrayList<String> course2 = new ArrayList<String>();

        // adding everything on "course1" into the new list "course2"
        course2.addAll(course1);
        System.out.println(course1);

        // adding new courses into the list
        course2.add("Java 101, Dr. P Green, 55");
        course2.add("Advanced Programming, Prof. M Milton, 93");
        
        System.out.println(course2);

        // sorting the list again
        Collections.sort(course2);
        System.out.println("The second list sorted: " + course2);

        // searching for a particular key in the list
        int index = Collections.binarySearch(course2, "Java 101");
        System.out.println("'Java 101' in List is at " + index);

        // we tring to find out if the two lists created are disjointed or not
        System.out.println("Is course1 disjointed to course2: " + Collections.disjoint(course1, course2));

        // we are trying to find the max and the min values(courses) in the list
        System.out.println("The min number of students is: " + Collections.min(course2));
        System.out.println("The max number of students is: " + Collections.max(course2));

    }
}
