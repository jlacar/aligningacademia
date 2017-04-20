public void validatePassword(Connection con,
    String userid, String password) throws SQLException {

  String query = "SELECT * FROM users WHERE userid ='"+ userid + "'" +
      " AND password='" + password + "'";

  try (Statement stmt = con.createStatement()) {
    ResultSet rs = stmt.executeQuery(query);

    if (rs.next()) {
      String dbpassword = rs.getString("PASSWORD");
      if (dbpassword != password) {
        throw new IllegalArgumentException("Incorrect password: expected '" +
          dbpassword + "' but user entered '" + password + "' instead");
      }
      log.info("Password '" + password + "' for user " + userid + " verified.");
    } else {
      log.error("User " + userid + " was not found in user table");
      throw new IllegalArgumentException("Unknown user: " + userid);
    }

  } catch (SQLException e) {
    log.error(e);
  }
}
