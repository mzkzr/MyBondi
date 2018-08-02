package Database;

import java.util.List;
import Model.Localidad;
import io.reactivex.Flowable;

public class LocalidadRepository implements ILocalidadDataSource {

    private ILocalidadDataSource mLocalDataSource;
    private static LocalidadRepository mInstance;

    public LocalidadRepository(ILocalidadDataSource mLocalDataSource) {
        this.mLocalDataSource = mLocalDataSource;
    }

    public static LocalidadRepository getInstance(ILocalidadDataSource mLocalDataSource) {
        if (mInstance == null) {
            mInstance = new LocalidadRepository(mLocalDataSource);
        }
        return mInstance;
    }

    @Override
    public Flowable<Localidad> getLocalidadByCp(int locCp) {
        return mLocalDataSource.getLocalidadByCp(locCp);
    }

    @Override
    public Flowable<List<Localidad>> getAllLocalidades() {
        return mLocalDataSource.getAllLocalidades();
    }

    @Override
    public void insertLocalidad(Localidad... localidades) {
        mLocalDataSource.insertLocalidad(localidades);
    }

    @Override
    public void updateLocalidad(Localidad... localidades) {
        mLocalDataSource.updateLocalidad(localidades);
    }

    @Override
    public void deleteLocalidad(Localidad localidad) {
        mLocalDataSource.deleteLocalidad(localidad);
    }

    @Override
    public void deleteAllLocalidades() {
        mLocalDataSource.deleteAllLocalidades();
    }
}
