package br.com.voearlines.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.voearlines.model.ModeloAeronave;

public class AeronaveDAO {
	
	public void cadastraTipoAeronave(ModeloAeronave modeloaero) {

		Connection con = ConnectionFactory.getConnection();
		String sql = "INSERT INTO aeronave(id, fabricante, modelo, codigo, tipo) VALUES( ?, ?, ?, ?, ?)";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, modeloaero.getId());
			preparador.setString(2, modeloaero.getFabricante());
			preparador.setString(3, modeloaero.getModelo());
			preparador.setString(4, modeloaero.getCodigo());
			preparador.setString(5, modeloaero.getTipo());

			preparador.execute();
			preparador.close();

			System.out.println("Aeronave Cadastrada com sucesso");

		} catch (SQLException e) {
			System.out.println("Não foi possível salvar os dados " + e.getMessage());

		}

	}

}
