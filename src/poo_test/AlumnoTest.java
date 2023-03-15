package poo_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poo_modelo.Alumno;

class AlumnoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotaNoAprobada() {
		Alumno jesus = new Alumno(4);
		assertEquals(jesus.estoyAprobado(), false);

	}

	@Test
	void testNotaCualitativaSuspenso() {
		Alumno jesus = new Alumno(4);
		assertEquals(jesus.notaCualitativa(), "Suspenso");
	}

	@Test
	void testNotaBien() {
		Alumno jesus = new Alumno(6);
		assertEquals(jesus.estoyAprobado(), true);

	}

	@Test
	void testNotaCualitativaBien() {
		Alumno jesus = new Alumno(6);
		assertEquals(jesus.notaCualitativa(), "Bien");
	}

	@Test
	void testNotaNotable() {
		Alumno jesus = new Alumno(8);
		assertEquals(jesus.estoyAprobado(), true);
	}

	@Test
	void testNotaCualitativaNotable() {
		Alumno jesus = new Alumno(8);
		assertEquals(jesus.notaCualitativa(), "Notable");
	}

	@Test
	void testNotaSobresaliente() {
		Alumno jesus = new Alumno(10);
		assertEquals(jesus.estoyAprobado(), true);
	}

	@Test
	void testNotaCualitativaSobresaliente() {
		Alumno jesus = new Alumno(10);
		assertEquals(jesus.notaCualitativa(), "Sobresaliente");
	}

	@Test
	void testCualitativaInválida() {
		Alumno jesus = new Alumno(-4);
		assertEquals(jesus.notaCualitativa(), "Suspenso");
	}

}
