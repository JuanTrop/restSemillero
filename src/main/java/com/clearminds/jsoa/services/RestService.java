package com.clearminds.jsoa.services;

import com.clearminds.jsoa.dtos.Estudiante;
import com.clearminds.jsoa.excepciones.BDDException;
import com.clearminds.jsoa.servicios.ServicioEstudiante;

public class RestService {

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
