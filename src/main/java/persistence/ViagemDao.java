package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Onibus;
import model.Viagem;

public class ViagemDao implements IViagemDao {
	private GenericDao gDao;
	public ViagemDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public Viagem consultarViagem(Viagem v) throws SQLException, ClassNotFoundException {
			Connection c = gDao.getConnection();
			String sql = "Select*From v_descricao_viagem Where Codigo = ?";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, v.getCodigo());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				v.setCodigo(rs.getInt("codigo viagem"));
				v.setPlacaOnibus(rs.getString("placa"));
				v.setCodigoMotorista(rs.getInt("codigo motorista"));
				v.setSaida(rs.getInt("saida"));
				v.setChegada(rs.getInt("chegada"));
				v.setPartida(rs.getString("partida"));
				v.setDestino(rs.getString("destino"));

			}
			rs.close();
			ps.close();
			c.close();
			
			return v;
	}
}
