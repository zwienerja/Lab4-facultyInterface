package Lab4Start;

/**
 * Test the Lab4Start.Faculty, Lab4Start.Employee classes and Lab4Start.Rules interface
 *
 * @author harmssk
 */
public class TestLab4 {

    public static void main(String[] args) {

        System.out.println("**********   Lab4Start.Faculty Class Test Start **********");
        // Create a faculty member and his/her set of courses
        System.out.println("Lab4Start.Faculty test, should show name and courses.");
        String[] testCourses = new String[]{"150", "441"};
        Faculty sherri = new Faculty("Sherri", 65000, testCourses);
        System.out.println(sherri);//be sure you have a toString method for faculty
        System.out.println("Lab4Start.Faculty get name and get salary tests.");
        System.out.println("Lab4Start.Faculty Name: " + sherri.getName()); // print the faculty name
        System.out.println("Lab4Start.Faculty Salary: " + sherri.getSalary()); // print the salary of faculty
        System.out.println("Test faculty constructor, should show name and courses (should NOT contain XYZ).");
        testCourses[1] = "XYZ";
        System.out.println(sherri);
        System.out.println("Test faculty getCourses should show name and courses (should NOT contain ABC).");
        testCourses = sherri.getCourses();  //remember to return a copy
        testCourses[1] = "ABC";
        System.out.println(sherri);
        System.out.println("See the copy of the faculty's getCourses (should contain ABC).");
        for (String c : testCourses) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Test faculty set courses, should show name and courses (should contain three new courses).");
        String addCourses[] = {"130", "425", "834"}; // create courses array
        sherri.setCourses(addCourses); // set the courses for faculty
        System.out.println(sherri);

        System.out.println("Test faculty set courses, should show name and courses (should NOT contain PQR).");
        addCourses[1] = "PQR";
        System.out.println(sherri);
        System.out.println("**********   Lab4Start.Faculty Class Test End **********");
        System.out.println();

        System.out.println("********** Lab4Start.Faculty as Lab4Start.Employee Test Begin **************************");
        // Create a faculty member as an Lab4Start.Employee
        System.out.println("Test faculty as an employee. Should show name and courses.");
        String[] shahramCourses = new String[]{"188", "223", "448"};
        Employee shahram = new Faculty("Shahram", 65000, shahramCourses);
        System.out.println(shahram);
        System.out.println("Test faculty as an employee get name and get salary tests.");
        System.out.println("Lab4Start.Employee Name: " + shahram.getName()); // print the faculty name
        System.out.println("Lab4Start.Employee Salary: " + shahram.getSalary()); // print the salary of faculty
        System.out.println("Test faculty as an employee, get courses.");
        if (shahram instanceof Faculty)// why is this needed?
        {
            testCourses = ((Faculty) shahram).getCourses();//cast
            for (String c : testCourses)
                System.out.print(c + " ");
            System.out.println();

            System.out.println("Test faculty set courses, should show name and courses (should contain four new courses).");
            String springCourses[] = {"111", "301", "428", "458"}; // create courses array
            ((Faculty) shahram).setCourses(springCourses); // set the courses for faculty
            System.out.println(shahram);
        }
        System.out.println("******** Lab4Start.Faculty as Lab4Start.Employee Test End **************************");
        System.out.println();

        System.out.println("********** Lab4Start.Faculty as a member of Lab4Start.Rules interface Test Begin **************************");
        // Create a faculty member as an Lab4Start.Rules
        System.out.println("Test faculty as a member of Lab4Start.Rules interface. Should show name and courses.");
        String[] johnCourses = new String[]{"180", "330", "408"};
        Rules john = new Faculty("John", 65000, johnCourses);
        System.out.println(john);
        System.out.println("Test faculty as an a member of Lab4Start.Rules interface get name and get salary tests.");
        System.out.println("Lab4Start.Rules Name: " + john.getName()); // print the faculty name
        System.out.println("Lab4Start.Rules Salary: " + john.getSalary()); // print the salary of faculty
        System.out.println("Test faculty as a member of Lab4Start.Rules interface, get courses.");
        if (john instanceof Faculty) {
            testCourses = ((Faculty) john).getCourses(); //cast
            for (String c : testCourses)
                System.out.print(c + " ");
            System.out.println();
        }
        System.out.println("Test faculty set courses, should show name and courses (should contain three new courses).");
        String fallCourses[] = {"330", "404", "496-497"}; // create courses array
        ((Faculty) john).setCourses(fallCourses); // set the courses for faculty
        System.out.println(john);
        System.out.println("********** Lab4Start.Faculty as a member of Lab4Start.Rules interface Test End **************************");
        System.out.println();

        System.out.println("********** Lab4Start.Employee Test Begin **************************");
        System.out.println("Lab4Start.Employee test, should show name and salary.");
        Employee marla = new Employee("Marla", 35000); // employee object
        System.out.println(marla);
        System.out.println("Lab4Start.Employee get name and get salary tests.");
        System.out.println("Lab4Start.Employee Name: " + marla.getName());
        System.out.println("Lab4Start.Employee Salary: " + marla.getSalary());
        System.out.println("******** Lab4Start.Employee Test End **************************");
        System.out.println();

        System.out.println("********** Lab4Start.Employee as a member of Lab4Start.Rules Interface Test Begin **************************");
        System.out.println("Lab4Start.Rules test, should show name and salary.");
        Rules ben = new Employee("Ben", 25000); // employee object
        System.out.println(ben.toString());
        System.out.println("Lab4Start.Rules get name and get salary tests.");
        System.out.println("Lab4Start.Rules Name: " + ben.getName());
        System.out.println("Lab4Start.Rules Salary: " + ben.getSalary());
        System.out.println("********** Lab4Start.Employee as a member of Lab4Start.Rules Interface Test End **************************");

    }
}
