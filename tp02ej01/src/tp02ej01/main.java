package tp02ej01;

import java.time.LocalDate;

public class main {
	public static void main(String[] args) {
		Empresa empresaDePrueba = new Empresa("Empresa de prueba", "20-12345678-9");
		EmpleadoPlantaPermanente empleadoPermanente = new EmpleadoPlantaPermanente("Juan Perez", "Calle Ficticia 123", "Casado", LocalDate.of(1980, 3, 15), 50000.0, 2, 10);
		EmpleadoPlantaTemporaria empleadoTemporal = new EmpleadoPlantaTemporaria("Maria Lopez", "Calle Ficticia 456", "Soltera", LocalDate.of(1990, 7, 20), 40000.0, LocalDate.of(2025, 7, 20), 5);
		empresaDePrueba.agregarEmpleado(empleadoPermanente);
		empresaDePrueba.agregarEmpleado(empleadoTemporal);
		
		System.out.println("El calculo total de sueldos neto es de $" + empresaDePrueba.calcularTotalSueldosNeto());
		
		ReciboDeHaberes reciboDeHaberes = new ReciboDeHaberes(LocalDate.now(), empleadoPermanente);
		System.out.println("La liquidación de sueldo del empleado " + empleadoPermanente.obtenerNombre() + ", correspondiente a la fecha " + reciboDeHaberes.obtenerFechaDeEmision() +" es: ");
		reciboDeHaberes.liquidarSueldo();
		
	}

	
}
