package com.carmotors.modelo.reporte;

import com.carmotors.modelo.TipoMantenimiento;

import java.time.LocalDateTime;

/** Proyección de los datos necesarios para calcular el tiempo de un servicio completado. */
public class ServicioCompletado {
    private final TipoMantenimiento tipoMantenimiento;
    private final LocalDateTime fechaRecepcion;
    private final LocalDateTime fechaEntrega;

    public ServicioCompletado(TipoMantenimiento tipoMantenimiento, LocalDateTime fechaRecepcion,
                              LocalDateTime fechaEntrega) {
        this.tipoMantenimiento = tipoMantenimiento;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaEntrega = fechaEntrega;
    }

    public TipoMantenimiento getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public LocalDateTime getFechaRecepcion() {
        return fechaRecepcion;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }
}
