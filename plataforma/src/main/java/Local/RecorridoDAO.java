package Local;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;
import Model.Recorrido;
import io.reactivex.Flowable;

public interface RecorridoDAO {
    @Query("SELECT * FROM recorridos WHERE id=:recId")
    Flowable<Recorrido> getRecorridoById(int recId);

    @Query("SELECT * FROM recorridos")
    Flowable<List<Recorrido>> getAllRecorridos();

    @Insert
    void insertRecorrido(Recorrido... recorridos);

    @Update
    void updateRecorrido(Recorrido... recorridos);

    @Delete
    void deleteRecorrido(Recorrido recorrido);

    @Query("DELETE FROM recorridos")
    void deleteAllRecorridos();
}
