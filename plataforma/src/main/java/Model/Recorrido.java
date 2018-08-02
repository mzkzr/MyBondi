package Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Arrays;
import java.util.List;

@Entity(tableName = "recorridos")
public class Recorrido {
    @PrimaryKey()
    @ColumnInfo()
    private int id;

    @ColumnInfo()
    private Localidad origen;

    @ColumnInfo()
    private Localidad destino;

    @ColumnInfo()
    private List<String> dias = Arrays.asList("Semana", "Sabado", "Domingo/Feriado");

    public Recorrido() {
    }

    @Ignore
    public Recorrido(Localidad origen, Localidad destino, List<String> dias) {
        this.origen = origen;
        this.destino = destino;
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Localidad getOrigen() {
        return origen;
    }

    public void setOrigen(Localidad origen) {
        this.origen = origen;
    }

    public Localidad getDestino() {
        return destino;
    }

    public void setDestino(Localidad destino) {
        this.destino = destino;
    }

    public List<String> getDias() {
        return dias;
    }

    public void setDias(List<String> dias) {
        this.dias = dias;
    }
}
