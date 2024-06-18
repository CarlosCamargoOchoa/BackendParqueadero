package com.unir.parqueadero.Model.Dto;

import java.time.LocalDateTime;

public class ControlDto {
    private int controlID;
    private String placa;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private int tarifaID;
    private Double total;


    public void setControlID(int controlID) {
        this.controlID = controlID;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    public void setTarifaID(int tarifaID) {
        this.tarifaID = tarifaID;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getPlaca() {
        return placa;
    }
    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }
    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }
    public int getTarifaID() {
        return tarifaID;
    }
    public Double getTotal() {
        return total;
    }
    public int getControlID()
    {
        return controlID;
    }


}
