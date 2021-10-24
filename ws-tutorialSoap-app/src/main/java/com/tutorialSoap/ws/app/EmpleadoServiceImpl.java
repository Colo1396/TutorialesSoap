package com.tutorialSoap.ws.app;

import javax.jws.*;

@SuppressWarnings("restriction")
@WebService(endpointInterface="com.tutorialSoap.ws.app.EmpleadoService")
public class EmpleadoServiceImpl implements EmpleadoService{

	public String getEmpleadoById(int idEmpleado) {
		String resultado =(idEmpleado==10)?"Empleado encontrado":"Error";
		return resultado;
	}

}
