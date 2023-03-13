package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Onibus;
import model.Viagem;

public interface IViagemDao {
	public Viagem consultarViagem(Viagem v) throws SQLException, ClassNotFoundException;
}