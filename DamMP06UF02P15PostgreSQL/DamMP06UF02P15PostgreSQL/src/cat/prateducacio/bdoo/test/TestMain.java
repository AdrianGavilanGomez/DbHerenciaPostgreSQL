package cat.prateducacio.bdoo.test;

import cat.prateducacio.bdoo.Repository.CommonRepository;
import cat.prateducacio.bdoo.Repository.EstudianteRepository;
import cat.prateducacio.bdoo.Repository.PersonaRepository;
import cat.prateducacio.bdoo.Repository.ProfessorRepository;
import cat.prateducacio.bdoo.domain.Estudiante;
import cat.prateducacio.bdoo.domain.Persona;
import cat.prateducacio.bdoo.domain.Professor;

/*

https://jdbc.postgresql.org/download/

CREATE DATABASE mp06;

CREATE TABLE personas (
    id SERIAL PRIMARY KEY,
    nombre TEXT,
    apellido TEXT
);

CREATE TABLE estudiantes (
    curso INTEGER
) INHERITS (personas);

CREATE TABLE profesores (
    especialidad TEXT
) INHERITS (personas);

INSERT INTO estudiantes (nombre, apellido, curso) VALUES ('Pedro', 'Fernández', 2);


INSERT INTO profesores (nombre, apellido, especialidad) VALUES ('Marta', 'Ramírez', 'Latín');


SELECT * FROM personas;

Obtendremos todos los registros de la tabla padre personas, así como todos los registros de las tablas hijas estudiantes y profesores.

También podemos ejecutar consultas en una tabla hija específica utilizando la sintaxis de SELECT estándar. 

Por ejemplo, si queremos recuperar todos los registros de la tabla estudiantes, podemos ejecutar la siguiente consulta:

SELECT * FROM estudiantes;

Esta consulta solo incluirá los registros de la tabla estudiantes, no los de la tabla profesores o personas.

Y lo mismo ocurrirá si recuperamos los registros de la tabla profesores:

SELECT * FROM profesores;



*/

public class TestMain {

	public static void main(String[] args) {
		//TestPersona();
		//TestProfessor();
		//TestEstudiante();

	}

	private static void TestPersona() {
		PersonaRepository repository = new PersonaRepository();
		try {
			repository.getConnection();
			repository.getRowsCount(CommonRepository.Taula.Persones);

			repository.getRowsTaula(CommonRepository.Taula.Persones);
//
//			Persona p1 = new Persona();
//			p1.setNombre("Montse");
//			p1.setApellido("Gonzalez");
//			repository.insertPersona(p1);
//
//			repository.getRowsTaula(CommonRepository.Taula.Persones);
////
//			Persona p2 = new Persona();
//			p2.setId(1);
//			p2.setNombre("Montserrat");
//			p2.setApellido("Gonzalvez");
//			repository.updatePersona(p2);
//			repository.getRowsTaula(CommonRepository.Taula.Persones);

			repository.deletePersona(1);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());

		}

	}

	private static void TestProfessor() {
		ProfessorRepository repository = new ProfessorRepository();
		try {
			repository.getConnection();
			repository.getRowsCount(CommonRepository.Taula.Professors);
			
			repository.getRowsTaula(CommonRepository.Taula.Professors);
//
//			Professor p1 = new Professor();
//			p1.setNombre("Marta");
//			p1.setApellido("Ramirez");
//			p1.setEspecialidad("Latin");
//			repository.insertProfessor(p1);
//			repository.getRowsTaula(CommonRepository.Taula.Professors);

//			Professor p2 = new Professor();
//			p2.setId(2);
//			p2.setNombre("Martita");
//			p2.setApellido("Rodriguez");
//			p2.setEspecialidad("Biologia");
//			repository.updateProfessor(p2);
//			repository.getRowsTaula(CommonRepository.Taula.Professors);
//
//			repository.deleteProfessor(2);
//			repository.getRowsTaula(CommonRepository.Taula.Professors);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());

		}

	}

	private static void TestEstudiante() {
		EstudianteRepository repository = new EstudianteRepository();
		try {
			repository.getConnection();
			repository.getRowsCount(CommonRepository.Taula.Estudiants);

//			Estudiante e1 = new Estudiante();
//			e1.setNombre("Pedro");
//			e1.setApellido("Fernandez");
//			e1.setCurso(2);
//			repository.insertEstudiante(e1);
//			repository.getRowsTaula(CommonRepository.Taula.Estudiants);
//
//			Estudiante e2 = new Estudiante();
//			e2.setId(3);
//			e2.setNombre("Pedrito");
//			e2.setApellido("Gonzalez");
//			e2.setCurso(3);
//			repository.updateEstudiante(e2);
//			repository.getRowsTaula(CommonRepository.Taula.Estudiants);
//
//			repository.deleteEstudiante(3);
//			repository.getRowsTaula(CommonRepository.Taula.Estudiants);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());

		}
	}

}
