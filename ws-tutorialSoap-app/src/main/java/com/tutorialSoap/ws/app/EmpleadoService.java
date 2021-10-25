package com.tutorialSoap.ws.app;

import javax.jws.*;

import com.tutorialSoap.ws.app.response.EmpleadoResponse;

@SuppressWarnings("restriction")
@WebService
public interface EmpleadoService {
	@WebMethod(operationName="getEmpleado")
	@WebResult(name="ResultadoOperacion") String getEmpleadoById(@WebParam(name="idEmpleado")int idEmpleado);

	@WebMethod(operationName="getEmpleadoResponse")
	@WebResult(name="ResultadoOperacionResp") EmpleadoResponse getEmpleadoByIdResponse(@WebParam(name="idEmpleadoResp")int idEmpleadoResp);

}
