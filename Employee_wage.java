public class Employee_wage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int Emp_Rate_Per_Hr = 20;
    public static final int Num_of_working_day = 20;
    public static final int Max_hrs_in_month = 100;

    public static void computeEmployeeWage() {
        int empHrs = 0;
        int totalEmp_hrs = 0;
        int total_working_days = 0;

        while ( totalEmp_hrs <= Max_hrs_in_month &&
                total_working_days < Num_of_working_day) {
            total_working_days++;
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
            totalEmp_hrs=totalEmp_hrs+empHrs;
            System.out.println("Day# " + total_working_days + " Employee hrs: " +empHrs );
        }
        int Total_empWage = totalEmp_hrs * Emp_Rate_Per_Hr;
        System.out.println("Total Employee Wage: "+ Total_empWage);
    }

    public static void main(String[] args) {
        computeEmployeeWage();
    }
}
