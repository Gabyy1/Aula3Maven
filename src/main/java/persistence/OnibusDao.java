package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Onibus;

public class OnibusDao implements IOnibusDao {
	
	private GenericDao gDao;
	public OnibusDao(GenericDao gDao) {
		this.gDao = gDao;
	}
	
	

	@Override
	public Onibus consultarOnibus(Onibus o) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "Select*From v_descricao_onibus Where Codigo = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, o.getCodigo());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			o.setCodigo(rs.getInt("codigo"));
			o.setPlaca(rs.getString("placa"));
			o.setMarca(rs.getString("marca"));
			o.setAno(rs.getInt("ano"));
			o.setDescricao(rs.getString("descricao"));
		}
		rs.close();
		ps.close();
		c.close();
		
		return o;
	}


}
