package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Facultad;


public interface IFacultadService {

	//Metodos del CRUD
		public List<Facultad> listarFacultad(); //Listar All 
		
		public Facultad guardarFacultad(Facultad Facultad);	//Guarda un Facultad CREATE
		
		public Facultad FacultadXID(Long id); //Leer datos de un Facultad READ
		
		public Facultad actualizarFacultad(Facultad Facultad); //Actualiza datos del Facultad UPDATE
		
		public void eliminarFacultad(Long id);// Elimina el Facultad DELETE
	
}
