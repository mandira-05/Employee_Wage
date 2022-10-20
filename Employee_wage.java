public class Employee_wage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;

        int Emp_Rate_Per_Hr = 20;
        int empHrs = 0;
        int empWage = 0 ;

        double empCheck = Math.floor(Math.random()*10)%3;
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        } else if (empCheck == IS_PART_TIME) {
            empHrs = 4;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * Emp_Rate_Per_Hr;
        System.out.println("Emp Wage: " + empWage);
    }
}
