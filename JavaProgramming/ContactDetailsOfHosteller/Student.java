public class Student{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    
    public int getStudentId() {
		return this.studentId;
	}
    public void setStudentId(int input){
	    this.studentId = input;
	}
    public String getName() {
		return this.name;
	}
    public void setName(String input){
	    this.name = input;
	}
    public int getDepartmentId() {
		return this.departmentId;
	}
    public void setDepartmentId(int input){
	    this.departmentId = input;
	}
    public String getGender() {
	    return this.gender;
    }
    public void setGender(String input){
	    this.gender = input;
    }
    public String getPhone() {
	    return this.phone;
	}
    public void setPhone(String input){
	    this.phone = input;
	}
}