package com.udemy.num10BTratamentoExercicoReservaHotel.application;

import com.udemy.num10BTratamentoExercicoReservaHotel.model.entities.Reserva;
import com.udemy.num10BTratamentoExercicoReservaHotel.model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservaHotel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int numero = sc.nextInt();
            System.out.print("Data check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data check-out (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.print("Reserva: " + reserva);

            System.out.println();
            System.out.println("Atualizar datas da reserva: ");
            System.out.print("Data check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reserva.atualizarReserva(checkIn, checkOut);
            System.out.print("Reserva: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Formatação inválida da data.");
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro Inesperado!");
        }


        sc.close();
    }
}
