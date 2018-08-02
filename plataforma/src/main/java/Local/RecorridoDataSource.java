package Local;

import java.util.List;
import Database.IRecorridoDataSource;
import Model.Recorrido;
import io.reactivex.Flowable;

public class RecorridoDataSource implements IRecorridoDataSource {
    private RecorridoDAO recorridoDAO;
    private static RecorridoDataSource mInstance;

    public RecorridoDataSource(RecorridoDAO recorridoDAO) {
        this.recorridoDAO = recorridoDAO;
    }

    public static RecorridoDataSource getInstance(RecorridoDAO recorridoDAO) {
        if (mInstance == null) {
            mInstance = new RecorridoDataSource(recorridoDAO);
        }
        return mInstance;
    }

    @Override
    public Flowable<Recorrido> getRecorridoById(int recId) {
        return recorridoDAO.getRecorridoById(recId);
    }

    @Override
    public Flowable<List<Recorrido>> getAllRecorridos() {
        return recorridoDAO.getAllRecorridos();
    }

    @Override
    public void insertRecorrido(Recorrido... recorridos) {
        recorridoDAO.insertRecorrido(recorridos);
    }

    @Override
    public void updateRecorrido(Recorrido... recorridos) {
        recorridoDAO.updateRecorrido(recorridos);
    }

    @Override
    public void deleteRecorrido(Recorrido recorrido) {
        recorridoDAO.deleteRecorrido(recorrido);
    }

    @Override
    public void deleteAllRecorridos() {
        recorridoDAO.deleteAllRecorridos();
    }
}
