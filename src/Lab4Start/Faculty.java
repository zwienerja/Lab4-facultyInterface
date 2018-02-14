package Lab4Start;

import Lab4Start.Employee;

public class Faculty extends Employee {

    private String[] courses = new String[3];

    /**
     * constructor to establish a faculty member including name, salary, and courses
     * @param inName
     * @param inSalary
     * @param inCourses
     */
    public Faculty (String inName, double inSalary, String[] inCourses){
        super.setName ("Professor " + inName);
        super.setSalary(inSalary);
        setCourses(inCourses);
    }


    /**
     * Set the courses for this faculty member
     * @param Courses An array that holds the courses
     */
    public void setCourses(String[] Courses){
        this.courses = new String[Courses.length];
        for(int i=0; i<Courses.length; i++)
            this.courses[i] = Courses[i];
    }

    /**
     * get the array of courses using this method
     * @return Copy of Courses[]
     */
    public String[] getCourses() {
        String[] temp = new String[courses.length];
        for (int i = 0; i < courses.length; i++)
        {
            temp[i] = (courses[i]);
        }
        return temp;
    }

    /**
     * get a string of the course names
     * @return
     */
    public String getCourseNames(){
        String names = "";
        for (int i = 0; i < courses.length; i++){
            names = (names + " " + courses[1]);
        }
        return names;
    }

    /**
     * get the name of the faculty member
     * @return name
     */
    public String getName(){return name;}

    /**
     * return a string summarizing the faculty member's variables
     * @return output - faculty summary
     */
    public String toString(){
        String output = (String.format(name + " has a salary of %7.2f. Classes taught by this " +
                "faculty member are:", salary));
        for(int i = 0; i < courses.length; i++) {
            output = (output + " " + courses[i]);
            if (i<(courses.length-1)){
                output = (output + ",");
            }
        }
        return output;
    }
}
