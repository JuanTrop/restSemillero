package com.clearminds.jsoa.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.jsoa.dtos.Estudiante;
import com.clearminds.jsoa.excepciones.BDDException;
import com.clearminds.jsoa.servicios.ServicioEstudiante;

@Path("/estudiantes/")
public class RestService {

@POST
@Path("/insertar")
@Consumes({MediaType.APPLICATION_JSON})
public void insertarEstudiante(Estudiante estudiante){
	ServicioEstudiante servEstudiante = new ServicioEstudiante();
	try {
		servEstudiante.insertarEstudiante(estudiante);
	} catch (BDDException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
