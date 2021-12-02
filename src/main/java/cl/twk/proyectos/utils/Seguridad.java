package cl.twk.proyectos.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Seguridad {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		String passwordEncode = bCryptPasswordEncoder.encode("matias123");
		
		System.out.println("PASSWORD: " + passwordEncode);
	}

}
