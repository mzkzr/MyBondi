package Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import java.util.List;

@Entity(tableName = "empresas")
public class Empresa {
    @PrimaryKey()
    @ColumnInfo()
    private int id;

    @ColumnInfo()
    private String nombre;

    @ColumnInfo()
    private List<Recorrido> recorridos;

    public Empresa() {
    }

    @Ignore
    public Empresa(String nombre, List<Recorrido> recorridos) {
        this.nombre = nombre;
        this.recorridos = recorridos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public void addRecorrido(Recorrido recorrido) {
        this.recorridos.add(recorrido);
    }
}
