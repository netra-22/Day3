package pay;

public class Emp {
	 private int id;
	 private String name;
	 private String dept;
	 private double basicPay;
     
	 private double hra;
	 private double ta;
	 private double grossPay;
	 private double pf;
	 private double netPay;
	 
	 public Emp(int id, String name, String dept, double basicPay) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.basicPay = basicPay;
	 }

	 public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getDept() {
		 return dept;
	 }

	 public void setDept(String dept) {
		 this.dept = dept;
	 }

	 public double getBasicPay() {
		 return basicPay;
	 }

	 public void setBasicPay(double basicPay) {
		 this.basicPay = basicPay;
	 }

	 public double getHra() {
		 return hra;
	 }

	 public double getTa() {
		 return ta;
	 }

	 public double getGrossPay() {
		 return grossPay;
	 }

	 public double getPf() {
		 return pf;
	 }

	 public double getNetPay() {
		 return netPay;
	 }
	 
	 void calculate() {
		 hra = basicPay * 0.20;
	     ta = basicPay * 0.10;
	     grossPay = basicPay + hra + ta;
         pf = basicPay * 0.12;
         netPay = grossPay - pf;
	 }
	 
	 public void display() {
	     System.out.println("ID: " + id+"\nName: " + name+"\nDepartment: "+dept+"\nBasic Pay: "+basicPay+"\nHRA: " + hra+"\nTA: "+ta+"\nGross Pay: "+grossPay+"\nPF: "+pf+"\nNet Pay: "+netPay);
	 }

}
