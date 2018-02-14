package Lab4Start;

public class Employee implements Rules {

    public String name = "";
    public double salary = 0;

    /**
     * Employee constructor, takes in a name and a salary and assigns variables values
     * @param inName - employee's name
     * @param inSalary - employee's salary
     */
    public Employee(String inName, double inSalary){
        name = inName;
        salary = inSalary;
    }

    /**
     * Employee default constructor
     */
    public Employee(){
        name = null;
        salary = 0;
    }

    /**
     * changes the name of the employee to the inputted parameter
     * @param inName
     */
    public void setName(String inName){
        name = inName;
    }

    /**
     * changes the salary of the employee to the inputted parameter
     * @param inSal
     */
    public void setSalary(double inSal){
        salary = inSal;
    }

    /**
     * returns the name of the employee as a string
     * @return name
     */
    public String getName(){ return name; }

    /**
     * returns the salary of the employee as a double
     * @return salary
     */
    public double getSalary(){ return salary; }

    /**
     * summarizes variables for the employee as a string, including the name and salary
     * @return summary - string variable
     */
    public String toString(){
        String summary = (String.format(name + " has a salary of $%8.2f", salary));
        return summary;
    }
}
