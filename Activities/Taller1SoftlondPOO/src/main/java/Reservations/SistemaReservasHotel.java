package Reservations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaReservasHotel {
    public static void main(String[] args) {
        List<Hotel> hoteles = new ArrayList<>();
        hoteles.add(new Hotel("HOTEL LA LUCURA ACALORADA", 5));
        hoteles.add(new Hotel("HOTEL DE LAS PASIONES", 10));

        Scanner scanner = new Scanner(System.in);

        List<Reserva> reservas = new ArrayList<>();

        while (true) {
            System.out.println("");
            System.out.println("************************************");
            System.out.println("MENU:");
            System.out.println("1. Listar habitaciones disponibles");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Mostrar reservas");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Hoteles disponibles:");
                    for (int i = 0; i < hoteles.size(); i++) {
                        System.out.println((i + 1) + ". " + hoteles.get(i).getNombre());
                    }
                    System.out.print("Selecciona un hotel: ");
                    int hotelIndex = scanner.nextInt() - 1;
                    Hotel selectedHotel = hoteles.get(hotelIndex);

                    System.out.print("Habitaciones disponibles en " + selectedHotel.getNombre() + ": [");
                    List<Habitacion> habitacionesDisponibles = selectedHotel.getHabitacionesDisponibles();
                    // System.out.print("Habitaciones disponibles: [");
                    for (Habitacion habitacion : habitacionesDisponibles) {
                        System.out.print(" " + habitacion.getNumero() + " ");
                    }
                    System.out.println("]");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingrese la cédula del cliente: ");
                    String cedulaCliente = scanner.nextLine();

                    System.out.println("Hoteles disponibles:");
                    for (int i = 0; i < hoteles.size(); i++) {
                        System.out.println((i + 1) + ". " + hoteles.get(i).getNombre());
                    }
                    System.out.print("Selecciona un hotel: ");
                    hotelIndex = scanner.nextInt() - 1;
                    selectedHotel = hoteles.get(hotelIndex);

                    System.out.println("Habitaciones disponibles en " + selectedHotel.getNombre() + ":");
                    habitacionesDisponibles = selectedHotel.getHabitacionesDisponibles();
                    for (Habitacion habitacion : habitacionesDisponibles) {
                        System.out.println("Habitación " + habitacion.getNumero());
                    }

                    System.out.print("Selecciona una habitación: ");
                    int habitacionNumero = scanner.nextInt();
                    Habitacion selectedHabitacion = null;
                    for (Habitacion habitacion : habitacionesDisponibles) {
                        if (habitacion.getNumero() == habitacionNumero) {
                            selectedHabitacion = habitacion;
                            break;
                        }
                    }

                    if (selectedHabitacion != null) {
                        Cliente nuevoCliente = new Cliente(nombreCliente, cedulaCliente);
                        Reserva nuevaReserva = new Reserva(nuevoCliente, selectedHotel, selectedHabitacion);
                        reservas.add(nuevaReserva);
                        System.out.println("Reserva realizada con éxito.");
                    } else {
                        System.out.println("Habitación no válida.");
                    }
                    break;

                case 3:
                    if (reservas.isEmpty()) {
                        System.out.println("No hay reservas para cancelar.");
                    } else {
                        System.out.println("Reservas disponibles:");
                        for (int i = 0; i < reservas.size(); i++) {
                            System.out.println((i + 1) + ". " + reservas.get(i).getCliente().getNombre() +
                                    " en " + reservas.get(i).getHotel().getNombre() +
                                    ", Habitación " + reservas.get(i).getHabitacion().getNumero());
                        }
                        System.out.print("Selecciona una reserva para cancelar: ");
                        int reservaIndex = scanner.nextInt() - 1;
                        Reserva reservaCancelar = reservas.get(reservaIndex);
                        reservaCancelar.cancelar();
                        reservas.remove(reservaIndex);
                        System.out.println("Reserva cancelada con éxito.");
                    }
                    break;

                case 4:
                    if (reservas.isEmpty()) {
                        System.out.println("No hay reservas.");
                    } else {
                        System.out.println("Reservas:");
                        for (Reserva reserva : reservas) {
                            System.out.println("Empresa: " + reserva.getCliente().getNombre());
                            System.out.println("Hotel: " + reserva.getHotel().getNombre());
                            System.out.println("Cédula: " + reserva.getCliente().getCedula());
                            System.out.println("Habitación: " + reserva.getHabitacion().getNumero());
                            System.out.println("-----------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    return;


                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
        }
    }

}
