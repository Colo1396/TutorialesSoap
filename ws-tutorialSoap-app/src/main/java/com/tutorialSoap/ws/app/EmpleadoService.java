package com.tutorialSoap.ws.app;

import javax.jws.*;

@SuppressWarnings("restriction")
@WebService
public interface EmpleadoService {
	@WebMethod(operationName="getEmpleado")
	@WebResult(name="ResultadoOperacion") String getEmpleadoById(@WebParam(name="idEmpleado")int idEmpleado);
}
