import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {

  public List<String> playersBasedOnHeightWeight(
    double minHeight,
    double maxWeight
  ) {
    // Fill your code here
    List<String> players = new ArrayList<>();
    try {
      Connection conn = DB.getConnection();
      PreparedStatement ps = conn.prepareStatement(
        "select playerName from player where height >= ? and weight <= ? order by playerName"
      );
      ps.setDouble(1, minHeight);
      ps.setDouble(2, maxWeight);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        String player = rs.getString(1);
        players.add(player);
      }
    } catch (ClassNotFoundException | SQLException err) {
      err.printStackTrace();
    }
    return players;
  }
}
