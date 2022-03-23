public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    
    public String getHostelName() {
	    return this.hostelName;
	}
    public void setHostelName(String input){
	    this.hostelName = input;
	}
    public int getRoomNumber() {
		return this.roomNumber;
	}
    public void setRoomNumber(int input){
	    this.roomNumber = input;
	}
	
	@Override
	public String toString(){
	    return this.studentId +" " + this.name + " "+ this.departmentId + " "+ this.gender + " "+ this.hostelName + " " + this.roomNumber;
	}
}