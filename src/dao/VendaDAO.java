package dao;
import model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.ConexaoMySQL;

public class VendaDAO {
	
	public void criarvenda(Venda venda) {
		Connection conexao = ConexaoMySQL.iniciarConexao();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement("INSERT INTO vendas (valor) VALUES (?)");
			stmt.setDouble(1, venda.getTotal());
			stmt.executeUpdate();
		} catch (SQLException erro) {
			erro.printStackTrace();
		} finally {
			ConexaoMySQL.encerrarConexao(conexao, stmt);
		}
	}
}
