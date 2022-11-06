public class Employee_wage {

    public final String companyName;
    public final int Emp_Rate_Per_Hr;
    public final int Num_of_working_day;
    public final int Max_hrs_in_month;
    public int Total_empWage;

    public Employee_wage(String companyName, int Emp_Rate_Per_Hr, int Num_of_working_day, int Max_hrs_in_month) {
        this.companyName=companyName;
        this.Emp_Rate_Per_Hr=Emp_Rate_Per_Hr;
        this.Num_of_working_day=Num_of_working_day;
        this.Max_hrs_in_month=Max_hrs_in_month;
    }

    public void setTotal_empWage(int total_empWage) {
        this.Total_empWage = total_empWage;
    }

    public String toString() {
        return "Emp Wage per Month for company " +companyName+ " is : " +Total_empWage;
    }


}
