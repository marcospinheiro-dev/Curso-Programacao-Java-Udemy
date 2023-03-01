package com.udemy.num10TratamentoExercicoReservaHotel.application;

import com.udemy.num10TratamentoExercicoReservaHotel.model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservaHotel {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numero = sc.nextInt();
        System.out.print("Data check-in (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Data check-out (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.print("Erro na reserva: A data de saída deve ser depois da data de entrada.");
        }
        else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.print("Reserva: " + reserva);

            System.out.println();
            System.out.println("Atualizar datas da reserva: ");
            System.out.print("Data check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reserva.atualizarReserva(checkIn, checkOut);
            if (error != null) {
                System.out.println("Erro na reserva: " + error);
            }
            else {
                System.out.print("Reserva: " + reserva);
            }


        }

        sc.close();
    }
}
