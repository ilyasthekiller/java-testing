package tp_02;

public class Employee {
private String name; 
private int age;
private double salary;
public Employee() {
	this.name="Unkown";
	this.age=0;
	this.salary=0;
}//in case of no attributes being sent to the object it will intiliaze it at 0
public Employee(String name) {
	this.name=name;
	this.age=0;
	this.salary=0;
}
public Employee(String name,int age,double salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
}//makes the object with the attributes given by the user
String getName() {
	return name;
}//returns object name
int getAge() {
	return age;
}//retuns object Age
double getSalary() {
	return salary;
}//returns object salary
void setName(String name) {
	this.name=name;
}//changes object's name
void setAge(int age) {
	this.age=age;
}//changes objects Age
void setSalary(double salary) {
	this.salary=salary;
}//changes objects salary
void salaryinc(double p) {
	this.salary=this.salary+((this.salary/100)*p);
}//inceares the objects salary by p% by dividing current salary by 100 and multiplying it by p
void salaryinc(int p) {
	this.salary=this.salary+p;
}//increases the objects slaray by p
String Tostring() {
	return "Name="+name+"/Age="+age+"/Salary="+salary;
}//returns the objects details as a string
}
