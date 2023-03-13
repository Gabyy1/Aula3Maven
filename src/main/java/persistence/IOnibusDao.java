package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Onibus;

public interface IOnibusDao {
	public Onibus consultarOnibus (Onibus o) throws SQLException, ClassNotFoundException;

}
