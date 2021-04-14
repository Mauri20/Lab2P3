package com.laboratorio2p3.negocio;

import com.laboratorio2p3.entidades.Login;

public class ClsLogin {
	public int Acceso(Login log) {
		int acceso=0;
		if(log.getUser().equals("Mauri") && log.getPass().equals("123")) {
			acceso=1;
		}
		return acceso;
	}
}
