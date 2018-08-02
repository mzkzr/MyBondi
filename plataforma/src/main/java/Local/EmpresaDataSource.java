package Local;

import java.util.List;
import Database.IEmpresaDataSource;
import Model.Empresa;
import io.reactivex.Flowable;

public class EmpresaDataSource implements IEmpresaDataSource {

    private EmpresaDAO empresaDAO;
    private static EmpresaDataSource mInstance;

    public EmpresaDataSource(EmpresaDAO empresaDAO) {
        this.empresaDAO = empresaDAO;
    }

    public static EmpresaDataSource getInstance(EmpresaDAO empresaDAO) {
        if (mInstance == null) {
            mInstance = new EmpresaDataSource(empresaDAO);
        }
        return mInstance;
    }

    @Override
    public Flowable<Empresa> getEmpresaById(int empId) {
        return empresaDAO.getEmpresaById(empId);
    }

    @Override
    public Flowable<List<Empresa>> getAllEmpresas() {
        return empresaDAO.getAllEmpresas();
    }

    @Override
    public void insertEmpresa(Empresa... empresas) {
        empresaDAO.insertEmpresa(empresas);
    }

    @Override
    public void updateEmpresa(Empresa... empresas) {
        empresaDAO.updateEmpresa(empresas);
    }

    @Override
    public void deleteEmpresa(Empresa empresa) {
        empresaDAO.deleteEmpresa(empresa);
    }

    @Override
    public void deleteAllEmpresas() {
        empresaDAO.deleteAllEmpresas();
    }
}
