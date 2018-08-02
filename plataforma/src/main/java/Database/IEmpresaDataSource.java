package Database;

import java.util.List;
import Model.Empresa;
import io.reactivex.Flowable;

public interface IEmpresaDataSource {
    Flowable<Empresa> getEmpresaById(int empId);
    Flowable<List<Empresa>> getAllEmpresas();
    void insertEmpresa(Empresa... empresas);
    void updateEmpresa(Empresa... empresas);
    void deleteEmpresa(Empresa empresa);
    void deleteAllEmpresas();
}
