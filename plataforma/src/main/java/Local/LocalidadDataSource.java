package Local;

import java.util.List;
import Database.ILocalidadDataSource;
import Model.Localidad;
import io.reactivex.Flowable;

public class LocalidadDataSource implements ILocalidadDataSource {

    private LocalidadDAO localidadDAO;
    private static LocalidadDataSource mInstance;

    public LocalidadDataSource(LocalidadDAO localidadDAO) {
        this.localidadDAO = localidadDAO;
    }

    public static LocalidadDataSource getInstance(LocalidadDAO localidadDAO) {
        if (mInstance == null) {
            mInstance = new LocalidadDataSource(localidadDAO);
        }
        return mInstance;
    }

    @Override
    public Flowable<Localidad> getLocalidadByCp(int locCp) {
        return localidadDAO.getLocalidadByCp(locCp);
    }

    @Override
    public Flowable<List<Localidad>> getAllLocalidades() {
        return localidadDAO.getAllLocalidades();
    }

    @Override
    public void insertLocalidad(Localidad... localidades) {
        localidadDAO.insertLocalidad(localidades);
    }

    @Override
    public void updateLocalidad(Localidad... localidades) {
        localidadDAO.updateLocalidad(localidades);
    }

    @Override
    public void deleteLocalidad(Localidad localidad) {
        localidadDAO.deleteLocalidad(localidad);
    }

    @Override
    public void deleteAllLocalidades() {
        localidadDAO.deleteAllLocalidades();
    }
}
