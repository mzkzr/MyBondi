package Local;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;
import Model.Empresa;
import io.reactivex.Flowable;

public interface EmpresaDAO {
    @Query("SELECT * FROM empresas WHERE id=:empId")
    Flowable<Empresa> getEmpresaById(int empId);

    @Query("SELECT * FROM empresas")
    Flowable<List<Empresa>> getAllEmpresas();

    @Insert
    void insertEmpresa(Empresa... empresas);

    @Update
    void updateEmpresa(Empresa... empresas);

    @Delete
    void deleteEmpresa(Empresa empresa);

    @Query("DELETE FROM empresas")
    void deleteAllEmpresas();
}
