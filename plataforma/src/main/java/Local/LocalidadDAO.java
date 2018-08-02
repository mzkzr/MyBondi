package Local;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;
import io.reactivex.Flowable;
import Model.Localidad;

public interface LocalidadDAO {
    @Query("SELECT * FROM localidades WHERE cp=:locCp")
    Flowable<Localidad> getLocalidadByCp(int locCp);

    @Query("SELECT * FROM localidades")
    Flowable<List<Localidad>> getAllLocalidades();

    @Insert
    void insertLocalidad(Localidad... localidades);

    @Update
    void updateLocalidad(Localidad... localidades);

    @Delete
    void deleteLocalidad(Localidad localidad);

    @Query("DELETE FROM localidades")
    void deleteAllLocalidades();
}
