package tp02ej01;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Empresa empresaDePrueba = new Empresa("Empresa de prueba", "20-12345678-9");
		EmpleadoPlantaPermanente empleadoPermanente = new EmpleadoPlantaPermanente("Juan Perez", "Calle Falsa 123", "Casado", LocalDate.of(1980, 3, 15), 1200000.0, 2, 10);
		EmpleadoPlantaTemporaria empleadoTemporal = new EmpleadoPlantaTemporaria("Maria Lopez", "Calle Falsa 456", "Soltera", LocalDate.of(1990, 7, 20), 1000000.0, LocalDate.of(2025, 7, 20), 5);
		EmpleadoContratado empleadoContratado = new EmpleadoContratado("Carlos Gómez", "Calle Falsa 555", "Divorciado", LocalDate.of(1988, 10, 20), 1250000.0, 8543, "TRANSFERENCIA BANCARIA");
		empresaDePrueba.agregarEmpleado(empleadoPermanente);
		empresaDePrueba.agregarEmpleado(empleadoTemporal);
		empresaDePrueba.agregarEmpleado(empleadoContratado);
		
		System.out.println("El calculo total de sueldos neto es de $" + empresaDePrueba.calcularTotalSueldosNeto() + "\n");
		
		ReciboDeHaberes reciboDeHaberesPermanente = new ReciboDeHaberes(LocalDate.now(), empleadoPermanente);
		System.out.println("La liquidación de sueldo del empleado " + empleadoPermanente.obtenerNombre() + ", correspondiente a la fecha " + reciboDeHaberesPermanente.obtenerFechaDeEmision() +" es: ");
		reciboDeHaberesPermanente.liquidarSueldo();
		
		ReciboDeHaberes reciboDeHaberesContratado = new ReciboDeHaberes(LocalDate.now(), empleadoContratado);
		System.out.println("La liquidación de sueldo del empleado " + empleadoContratado.obtenerNombre() + ", correspondiente a la fecha " + reciboDeHaberesContratado.obtenerFechaDeEmision() +" es: ");
		reciboDeHaberesContratado.liquidarSueldo();
		
	}
}
