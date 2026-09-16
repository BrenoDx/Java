package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
    private double valor;
    private LocalDate data;

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Parcelas(double valor, LocalDate data){
        this.valor = valor;
        this.data = data;
    }
}
