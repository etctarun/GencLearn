public class Student{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;
    
    public int getStudentId() {
		return this.studentId;
	}
    public void setStudentId(int input) {
		this.studentId = input;
	}
    public String getStudentName() {
		return this.studentName;
	}
    public void setStudentName(String input) {
    	this.studentName = input;
	}
    public String getStudentAddress() {
    	return this.studentAddress;
    }
    public void setStudentAddress(String input) {
		this.studentAddress = input;
	}
    public String getCollegeName() {
		return this.collegeName;
	}
    public void setCollegeName(String input) {
		this.collegeName = input;
	}
	
	public Student(int studentId , String studentName ,String studentAddress){
	    this.studentId = studentId;
	    this.studentName = studentName;
	    this.studentAddress = studentAddress;
	    this.collegeName = "NIT";
	}
	public Student(int studentId , String studentName ,String studentAddress, String collegeName){
	    this.studentId = studentId;
	    this.studentName = studentName;
	    this.studentAddress = studentAddress;
	    this.collegeName = collegeName;
	}
	
}