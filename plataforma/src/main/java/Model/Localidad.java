package Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "localidades")
public class Localidad {
    @PrimaryKey()
    @ColumnInfo()
    private int cp;

    @ColumnInfo()
    private String nombre;

    public Localidad() {
    }

    @Ignore
    public Localidad(int cp, String nombre) {
        this.cp = cp;
        this.nombre = nombre;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return Integer.toString(this.cp) + "\n" + this.nombre;
    }
}
