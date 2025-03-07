package practica03;

public class Subtareas {

    private int id;
    private String descripcion;
    private String prioridad;
    private String fechaLimite;
    private boolean completada;

    public Subtareas(int id, String descripcion, String prioridad, String fechaLimite, boolean completada) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descripcion: " + descripcion + ", Prioridad: " + prioridad +
<<<<<<< Updated upstream
                ", Fecha Limite: " + fechaLimite + ", Completada: " + (completada ? "Si" : "No");
=======
                ", Fecha limite: " + fechaLimite + ", Completada: " + (completada ? "Si" : "No");
>>>>>>> Stashed changes
    }
	
}
