package practica03;

import java.util.ArrayList;
import java.util.List;

public class Tareas {
	 private int id;
	    private String descripcion;
	    private String prioridad;
	    private String fechaLimite;
	    private boolean completada;
	    private List<Subtareas> subtareas;

	    public Tareas(int id, String descripcion, String prioridad, String fechaLimite, boolean completada) {
	        this.id = id;
	        this.descripcion = descripcion;
	        this.prioridad = prioridad;
	        this.fechaLimite = fechaLimite;
	        this.completada = completada;
	        this.subtareas = new ArrayList<>();
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

	    public List<Subtareas> getSubtareas() {
	        return subtareas;
	    }

	    public void agregarSubtarea(Subtareas subtarea) {
	        subtareas.add(subtarea);
	    }

	    public void eliminarSubtarea(int id) {
	        subtareas.removeIf(subtarea -> subtarea.getId() == id);
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Descripcion: " + descripcion + ", Prioridad: " + prioridad +
	                ", Fecha Limite: " + fechaLimite + ", Completada: " + (completada ? "Si" : "No");
	    }

}
