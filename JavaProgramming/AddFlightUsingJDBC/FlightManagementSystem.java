import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem {

  public boolean addFlight(Flight flightObj) {
    try {
      Connection conn = DB.getConnection();
      String query =
        "insert into flight (flightId, source , destination , noofseats, flightfare) values (?,?,?,?,?);";
      PreparedStatement ps = conn.prepareStatement(query);
      ps.setInt(1, flightObj.getFlightId());
      ps.setString(2, flightObj.getSource());
      ps.setString(3, flightObj.getDestination());
      ps.setInt(4, flightObj.getNoOfSeats());
      ps.setDouble(5, flightObj.getFlightFare());

      ps.execute();
      return true;
    } catch (ClassNotFoundException | SQLException err) {
      err.printStackTrace();
    }
    return false;
  }
}
