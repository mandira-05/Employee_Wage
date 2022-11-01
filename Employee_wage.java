public class Employee_wage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;

    private final String companyName;
    private final int Emp_Rate_Per_Hr;
    private final int Num_of_working_day;
    private final int Max_hrs_in_month;
    private int Total_empWage;

    public Employee_wage(String companyName, int Emp_Rate_Per_Hr, int Num_of_working_day, int Max_hrs_in_month) {
        this.companyName=companyName;
        this.Emp_Rate_Per_Hr=Emp_Rate_Per_Hr;
        this.Num_of_working_day=Num_of_working_day;
        this.Max_hrs_in_month=Max_hrs_in_month;
    }

    public int computeEmployeeWage() {
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
        Total_empWage = totalEmp_hrs * Emp_Rate_Per_Hr;
        return Total_empWage;
    }

    public String toString() {
        return "Emp Wage per Month for company " +companyName+ " is : " +Total_empWage;
    }

    public static void main(String[] args) {


        Employee_wage parle = new Employee_wage("Parle-G",20,20,100);
        parle.computeEmployeeWage();
        System.out.println(parle);

        Employee_wage tiger = new Employee_wage("Tiger",22,22,120);
        tiger.computeEmployeeWage();
        System.out.println(tiger);


    }
}
