package com.carmotors.modelo.reporte;

import com.carmotors.modelo.TipoMantenimiento;

import java.time.Duration;

/** Duración promedio de finalización para un tipo de mantenimiento. */
public class TiempoPromedioReparacion {
    private final TipoMantenimiento tipoMantenimiento;
    private final Duration duracionPromedio;

    public TiempoPromedioReparacion(TipoMantenimiento tipoMantenimiento, Duration duracionPromedio) {
        this.tipoMantenimiento = tipoMantenimiento;
        this.duracionPromedio = duracionPromedio;
    }

    public TipoMantenimiento getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public Duration getDuracionPromedio() {
        return duracionPromedio;
    }
}
