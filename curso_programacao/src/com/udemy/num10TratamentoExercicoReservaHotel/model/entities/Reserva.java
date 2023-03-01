package com.udemy.num10TratamentoExercicoReservaHotel.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numQuarto, Date checkIn, Date checkOut) {
        this.numQuarto = numQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    // Sem setCheckIn e sem setCheckOut, pois há um método para essas alterações

    public long duracao() { // long = inteiro mais longo
        long diff = checkOut.getTime() - checkIn.getTime(); // getTime = milissegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        // TimeUnit = tipo enumerado complexo para converter milisseg em dias
    }

    public String atualizarReserva(Date checkIn, Date checkOut) {
        Date agora = new Date();
        if (checkIn.before(agora) || checkOut.before(agora)) {
            return "As datas de reserva devem ser futuras.";
        }
        if (!checkOut.after(checkIn)){
            return "A data de saída deve ser depois da data de entrada.";
        }
        this.checkIn = checkIn;  // objeto recebe argumento
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return  "Quarto: "
                + numQuarto
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duracao()
                + " noites";
    }
}
