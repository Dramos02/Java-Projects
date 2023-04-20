package Encapsulation1;

public class EmployeeSlip {
	
	//this will initialize the employee's personal data
	private String employeeID;
	private String Lname;
	private String Fname;
	private String Mname;
	//this will initialize the employee's earnings data
	private float basic;
	private float incentivesPay;
	private float houseRentAllowance;
	private float mealAllowance;
	//this will initialize the employee's deductions data
	private float providentFund;
	private float professionalTax;
	private float loan;
	//this will initialize the employee's information
	private float totalEarnings;
	private float totalDeductions;
	private float netPay;
	
	EmployeeSlip(String employeeID, String Lname, String Fname, String Mname, float basic, float incentivesPay, float houseRentAllowance, float mealAllowance, float providentFund, float professionalTax, float loan, float totalEarnings, float totalDeductions, float netPay){
		//This will give the access of global variable
		//Employee's Personal Data
		this.employeeID = employeeID;
		this.Lname = Lname;
		this.Fname = Fname;
		this.Mname = Mname;
		//EARNINGS
		this.basic = basic;
		this.incentivesPay = incentivesPay;
		this.houseRentAllowance = houseRentAllowance;
		this.mealAllowance = mealAllowance;
		//DEDUCTIONS
		this.providentFund = providentFund;
		this.professionalTax = professionalTax;
		this.loan = loan;
		//TOTALS
		this.totalEarnings = totalEarnings;
		this.totalDeductions = totalDeductions;
		this.netPay = netPay;
		
	}
	//automated by source to have getters and setters
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}

	public float getIncentivesPay() {
		return incentivesPay;
	}

	public void setIncentivesPay(float incentivesPay) {
		this.incentivesPay = incentivesPay;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getMealAllowance() {
		return mealAllowance;
	}

	public void setMealAllowance(float mealAllowance) {
		this.mealAllowance = mealAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getProfessionalTax() {
		return professionalTax;
	}

	public void setProfessionalTax(float professionalTax) {
		this.professionalTax = professionalTax;
	}

	public float getLoan() {
		return loan;
	}

	public void setLoan(float loan) {
		this.loan = loan;
	}

	public float getTotalEarnings() {
		return totalEarnings;
	}

	public void setTotalEarnings(float totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	public float getTotalDeductions() {
		return totalDeductions;
	}

	public void setTotalDeductions(float totalDeductions) {
		this.totalDeductions = totalDeductions;
	}

	public float getNetPay() {
		return netPay;
	}

	public void setNetPay(float netPay) {
		this.netPay = netPay;
	}
	
	public void displayEmployeesInfo() {
		//Prints out the Employee's Personal Data		
		System.out.println("---------------------------------------------------------\n" +
				   		   "-------------------EMPLOYEES PAYSLIP---------------------\n" +
				           "---------------------------------------------------------\n");
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Employee Name: " + " "+ getFname().toUpperCase() + " "+ getMname().toUpperCase() + " " + getLname().toUpperCase());
		//Prints out the Employee's EARNINGS
		System.out.println("---------------------------------------------------------\n" +
				           "EARNINGS\n" +
				           "---------------------------------------------------------");
		System.out.println("Basic: \t\t\t" + getBasic());
		System.out.println("Incentive pay: \t\t" + getIncentivesPay());
		System.out.println("House Rent Allowance: \t"+ getHouseRentAllowance());
		System.out.println("Meal Allowance: \t"+ getMealAllowance());
		//Prints out the Employee's DEDUCTIONS
		System.out.println("---------------------------------------------------------\n" +
				           "DEDUCTIONS\n" +
		   		           "---------------------------------------------------------");
		System.out.println("Provident Fund: \t" + getProvidentFund());
		System.out.println("Professional Tax: \t" + getProfessionalTax());
		System.out.println("Loan: \t\t\t" + getLoan());
		//Prints out the Employee's TOTALS
		System.out.println("---------------------------------------------------------");
		System.out.println("Total Earnings=>\t" + getTotalEarnings());
		System.out.println("Total Deductions=>\t" + getTotalDeductions());
		System.out.println("NET PAY=>\t\t" + getNetPay());
		
		
	}

}
