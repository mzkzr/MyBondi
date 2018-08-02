package Database;

import java.util.List;
import Model.Recorrido;
import io.reactivex.Flowable;

public interface IRecorridoDataSource {
    Flowable<Recorrido> getRecorridoById(int recId);
    Flowable<List<Recorrido>> getAllRecorridos();
    void insertRecorrido(Recorrido... recorridos);
    void updateRecorrido(Recorrido... recorridos);
    void deleteRecorrido(Recorrido recorrido);
    void deleteAllRecorridos();
}
