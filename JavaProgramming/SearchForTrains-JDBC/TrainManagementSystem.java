import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrainManagementSystem {

  public ArrayList<Train> viewTrain(
    String coachType,
    String source,
    String destination
  ) {
    // Fill your code here
    ArrayList<Train> trains = new ArrayList<>();

    try {
      Connection conn = DB.getConnection();
      PreparedStatement ps = conn.prepareStatement(
        "select * from train where source = ? and destination = ? and " +
        coachType.toUpperCase() +
        ">0 order by train_number;"
      );
      ps.setString(1, source);
      ps.setString(2, destination);

      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        int trainNumber = rs.getInt(1);
        String trainName = rs.getString(2);
        String src = rs.getString(3);
        String dest = rs.getString(4);
        int ac1 = rs.getInt(5);
        int ac2 = rs.getInt(6);
        int ac3 = rs.getInt(7);
        int sleeper = rs.getInt(8);
        int seater = rs.getInt(9);

        trains.add(
          new Train(
            trainNumber,
            trainName,
            src,
            dest,
            ac1,
            ac2,
            ac3,
            sleeper,
            seater
          )
        );
      }
    } catch (ClassNotFoundException | SQLException err) {
      err.printStackTrace();
    }
    return trains;
  }
}
