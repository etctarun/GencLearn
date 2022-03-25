
public class Vehicle implements Loan,Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	
	@Override
	public double issueLoan(){
	    double loan=0.0;
	    if(this.getVehicleType().charAt(0) == '4' ){
            loan = this.getPrice()*80/100;
	    }else if(this.getVehicleType().charAt(0) == '3' ){
            loan = this.getPrice()*75/100;
	    }else if(this.getVehicleType().charAt(0) == '2' ){
            loan = this.getPrice()*50/100;
	    } 
	    return loan;
	}
	
	@Override
	public double takeInsurance(){
	    double insurance=0.0;
	    if(this.getPrice() <= 150000){
	        insurance = 3500;
	    }else if(this.getPrice() <= 300000){
	        insurance = 4000;
	    }else{
	        insurance = 5000;
	    }
	    return insurance;
	}

}
