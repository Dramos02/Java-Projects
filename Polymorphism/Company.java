package Polymorphism;

class Company {
    private String Fname;
    private String Lname;
    private String Mname;
    private String id;
	private int age;
	private String streetBrgy;
	private String cityMunicipality;
	private String province;
	private String email;
	private String contactNum;
	private String sssNo;
	private String tinNo;
	private String pagibigNo;
	private String philhealthNo;
	private float basic;
	private float incentivesPay;
	private float houseRentAllowance;
	private float mealAllowance;
	private float providentFund;
	private float professionalTax;
	private float loan;
	private float totalEarnings;
	private float totalDeductions;
	private float netPay;
    
    Company(String Fname, String Lname, String Mname, String id, String streetBrgy, String cityMunicipality,  String province, String email,
    		String contactNum, int age, String sssNo, String tinNo, String pagibigNo, String philhealthNo, float basic, float incentivesPay, float houseRentAllowance, 
    		float mealAllowance, float providentFund, float professionalTax, float loan, float totalEarnings, float totalDeductions, float netPay) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Mname = Mname;
        this.id = id;
        this.streetBrgy = streetBrgy;
        this.cityMunicipality = cityMunicipality;
        this.province = province;
        this.email = email;
        this.contactNum = contactNum;
        this.age = age;
        this.sssNo = sssNo;
		this.tinNo = tinNo;
		this.pagibigNo = pagibigNo;
		this.philhealthNo = philhealthNo;
		this.basic = basic;
		this.incentivesPay = incentivesPay;
		this.houseRentAllowance = houseRentAllowance;
		this.mealAllowance = mealAllowance;
		this.providentFund = providentFund;
		this.professionalTax = professionalTax;
		this.loan = loan;
		this.totalEarnings = totalEarnings;
		this.totalDeductions = totalDeductions;
		this.netPay = netPay;
    }
    
    public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getStreetBrgy() {
		return streetBrgy;
	}

	public void setStreetBrgy(String streetBrgy) {
		this.streetBrgy = streetBrgy;
	}

	public String getCityMunicipality() {
		return cityMunicipality;
	}

	public void setCityMunicipality(String cityMunicipality) {
		this.cityMunicipality = cityMunicipality;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}
	
    public String getSssNo() {
		return sssNo;
	}

	public void setSssNo(String sssNo) {
		this.sssNo = sssNo;
	}

	public String getTinNo() {
		return tinNo;
	}

	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}

	public String getPagibigNo() {
		return pagibigNo;
	}

	public void setPagibigNo(String pagibigNo) {
		this.pagibigNo = pagibigNo;
	}

	public String getPhilhealthNo() {
		return philhealthNo;
	}

	public void setPhilhealthNo(String philhealthNo) {
		this.philhealthNo = philhealthNo;
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

	void employeeCode () {

		System.out.println("Employee Code [ 1 - Employee || 2 - Manager ] ");
		
	}
	
	public void displayInfo() {
		System.out.println("\n---------------------------------------------------------\n" +
		   		   "----------------------DATA ENTRY-------------------------\n" +
		           "---------------------------------------------------------\n");
		System.out.println("---------------------------------------------------------\n" + 
				"PERSONAL DATA\n" + "---------------------------------------------------------\n");
        System.out.println("Employee's Name: \t\t\t" + getFname().toUpperCase() + " " + getMname().toUpperCase() + " " + getLname().toUpperCase());
        System.out.println("Employee's ID: \t\t\t\t" + getId());
        System.out.println("Employee's Age: \t\t\t" + getAge());
        System.out.println("Employee's Address: \t\t\t" + getStreetBrgy() + " " + getCityMunicipality());
        System.out.println("Employees's Province: \t\t\t" + getProvince());
		System.out.println("Employees's Email: \t\t\t" + getEmail());
		System.out.println("Employees's Contact Number: \t\t" + getContactNum());
		System.out.println("---------------------------------------------------------\n" + 
				"GOVERNMENT ID\n" + "---------------------------------------------------------\n");
		System.out.println("Employees's SSS#: \t\t\t" + getSssNo());
		System.out.println("Employees's TIN#: \t\t\t" + getTinNo());
		System.out.println("Employees's PAGIBIG#: \t\t\t" + getPagibigNo());
		System.out.println("Employees's PHILHEALTH#: \t\t" + getPhilhealthNo());
		
		System.out.println("\n---------------------------------------------------------\n" +
		   		   "-------------------EMPLOYEES PAYSLIP---------------------\n" +
		           "---------------------------------------------------------\n");
		System.out.println("---------------------------------------------------------\n" +
		           "EARNINGS\n" +
		           "---------------------------------------------------------");
		System.out.println("Employee's Basic Salary: \t\t" + getBasic());
		System.out.println("Employee's Incentive pay: \t\t" + getIncentivesPay());
		System.out.println("Employee's House Rent Allowance: \t"+ getHouseRentAllowance());
		System.out.println("Employee's Meal Allowance: \t\t"+ getMealAllowance());
		System.out.println("---------------------------------------------------------\n" +
		           "DEDUCTIONS\n" +
		           "---------------------------------------------------------");
		System.out.println("Employee's Provident Fund: \t\t" + getProvidentFund());
		System.out.println("Employee's Professional Tax: \t\t" + getProfessionalTax());
		System.out.println("Employee's Loan: \t\t\t" + getLoan());
		System.out.println("---------------------------------------------------------");
		System.out.println("Employee's Total Earnings=>\t\t" + getTotalEarnings());
		System.out.println("Employee's Total Deductions=>\t\t" + getTotalDeductions());
		System.out.println("Employee's NET PAY=>\t\t\t" + getNetPay());
		System.out.println("---------------------------------------------------------\n");
    }
}