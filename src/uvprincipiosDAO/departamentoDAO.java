
package uvprincipiosDAO;

import proyecto1.coneccionDB;

public class departamentoDAO implements IDAOgeneral <departamento> {

    @Override
    public boolean Guardar(departamento d) {
         boolean res=false;
        coneccionDB con = new coneccionDB.getInstance();
        String sql = "insert into persona (clave, nombre) values "
                + "('" + d.getClave() + "','" + d.getNombre() + "')";
        
        res = con.execute(sql);
        return res;
        
    }
    
    
    
//     public boolean guardar(departamento) d){
//            boolean res=false;
//        coneccionDB con = new coneccionDB.getInstance();
//        String sql = "insert into persona (clave, nombre) values "
//                + "('" + d.getClave() + "','" + d.getNombre() + "')";
//        
//        res=con.execute(sql);
//        return res;
//}
}
