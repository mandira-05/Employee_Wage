public class Employee_wage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int Emp_Rate_Per_Hr = 20;
    public static final int Num_of_working_day = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int Total_empWage = 0;

        for (int day = 0; day < Num_of_working_day; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * Emp_Rate_Per_Hr;
            Total_empWage=Total_empWage+empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Employee Wage: "+ Total_empWage);
    }
}
