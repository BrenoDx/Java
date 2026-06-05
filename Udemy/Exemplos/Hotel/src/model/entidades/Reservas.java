package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

    private int numQuarto;
    private Date checkIn;
    private Date checkOut;

    public Reservas(int numQuarto, Date checkIn, Date checkOut){
        this.numQuarto = numQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao(){
        // GetTime() devolver MILISEGUNDOS sobre a data
        long dif = checkOut.getTime() - checkIn.getTime();
        // Converte dif que contém MILISEGUNDOS para DIAS
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void updateDatas(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString() {
        return "Quarto: "
                + getNumQuarto()
                + ", checkIn: "
                + sdf.format(getCheckIn())
                + ", checkOut: "
                + sdf.format(getCheckOut())
                + ", "
                + duracao()
                + " noites.";
    }
}
