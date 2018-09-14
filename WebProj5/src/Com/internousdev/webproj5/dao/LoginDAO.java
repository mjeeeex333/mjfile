package Com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Com.internousdev.webproj5.dto.LoginDTO;
import Com.internousdev.webproj5.util.DBConnector;

public class LoginDAO {

	public String username;
	public String password;

	public List<LoginDTO> select(String username,String password){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from users where use_name=? and password=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
		}
	}

}
