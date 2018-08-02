package Database;

import java.util.List;
import Model.Localidad;
import io.reactivex.Flowable;

public interface ILocalidadDataSource {
    Flowable<Localidad> getLocalidadByCp(int locCp);
    Flowable<List<Localidad>> getAllLocalidades();
    void insertLocalidad(Localidad... localidades);
    void updateLocalidad(Localidad... localidades);
    void deleteLocalidad(Localidad localidad);
    void deleteAllLocalidades();
}
