public class EmployeeBuilderArray {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;

    private int numberOfCompany = 0;
    private Employee_wage[] companyEmpWageArray;

    public EmployeeBuilderArray() {
        companyEmpWageArray = new Employee_wage[5];
    }

    private void addCompanyEmpWage(String companyName, int Emp_Rate_Per_Hr, int Num_of_working_day, int Max_hrs_in_month) {
        companyEmpWageArray[numberOfCompany] = new Employee_wage(companyName, Emp_Rate_Per_Hr, Num_of_working_day, Max_hrs_in_month);
        numberOfCompany++;
    }

    private void computeEmployeeWage() {
        for (int i = 0; i < numberOfCompany; i++) {
            companyEmpWageArray[i].setTotal_empWage(this.computeEmployeeWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int computeEmployeeWage(Employee_wage Employee_wage) {
        int empHrs = 0;
        int totalEmp_hrs = 0;
        int total_working_days = 0;
        while (totalEmp_hrs <= Employee_wage.Max_hrs_in_month &&
                total_working_days < Employee_wage.Num_of_working_day) {
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
            totalEmp_hrs = totalEmp_hrs + empHrs;
            System.out.println("Day# " + total_working_days + " Employee hrs: " + empHrs);
        }

        return totalEmp_hrs * Employee_wage.Emp_Rate_Per_Hr;

    }

    public static void main(String[] args) {
        EmployeeBuilderArray employeeBuilderArray = new EmployeeBuilderArray();
        employeeBuilderArray.addCompanyEmpWage("Parle-G",20,20,100);
        employeeBuilderArray.addCompanyEmpWage("Tiger",22,22,120);
        employeeBuilderArray.computeEmployeeWage();
    }


}
