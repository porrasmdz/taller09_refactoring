package com.mycompany.taller_refactoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    public List<Consulta> getConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public void addConsultas(Consulta consulta) {
        this.consultas.add(consulta);
    }
    public void removeConsultas(Consulta consulta) {
        this.consultas.remove(consulta);
    }

    public List<RecetaMedica> getRecetasMedicas() {
        return Collections.unmodifiableList(recetasMedicas);
    }

    public void addRecetasMedicas(RecetaMedica recetaMedica) {
        this.recetasMedicas.add(recetaMedica);
    }
    public void removeRecetasMedicas(RecetaMedica recetaMedica) {
        this.recetasMedicas.remove(recetaMedica);
    }
}
