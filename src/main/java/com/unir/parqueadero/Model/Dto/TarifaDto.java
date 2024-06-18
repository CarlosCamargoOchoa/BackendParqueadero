package com.unir.parqueadero.Model.Dto;

public class TarifaDto {
    private int tarifaID;	
    private String tipoVehiculo;	
    private Double tarifa;	
    private String unidadMedida;	
    private boolean estado;

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double getTarifa() {
        return tarifa;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean getEstado() {
        return estado;
    }

    public int getTarifaID() {
        return tarifaID;
    }

    public void setTarifaID(int tarifaID) {
        this.tarifaID = tarifaID;
    }

}
