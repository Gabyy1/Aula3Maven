package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Viagem;
import persistence.GenericDao;
import persistence.IViagemDao;
import persistence.ViagemDao;

@WebServlet("/Viagem")
public class ViagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViagemServlet() {
        super();
         }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String placaOnibus = request.getParameter(placaOnibus);
		String codigoMotorista = request.getParameter(codigoMotorista);
		String saida = request.getParameter(saida);
		String chegada = request.getParameter(chegada);
		String partida = request.getParameter(partida);
		String destino = request.getParameter(destino);
	//	String botao = request.getParameter("botao");
		
		
		Viagem v = new Viagem();
		GenericDao gDao = new GenericDao();
		IViagemDao oDao = new ViagemDao(gDao);
		String erro= "";
		String saidaa= "";
		
		try {
			if (botao.equals("Buscar")) {
				v = valido(codigo, botao);
				v = oDao.consultarViagem(v);
			}
		}catch(SQLException | ClassNotFoundException | IOException e) {
			erro = e.getMessage();
		}finally {
			RequestDispatcher rd = request.getRequestDispatcher("viagem.jsp");
			request.setAttribute("viagem", v);
			request.setAttribute("erro", erro);
			request.setAttribute("saida", saidaa);
			
			rd.forward(request, response);
		}
		}
	
	private Viagem valido(String codigo, String botao) throws IOException {
		Viagem v = new Viagem();
		
		if (botao.equals("Buscar")) {
			if (codigo.equals("")) {
				throw new IOException("Preencher Codigo");
			}else {
				v.setCodigo(Integer.parseInt(codigo));
			}
		
	}
		return v;

}
}

