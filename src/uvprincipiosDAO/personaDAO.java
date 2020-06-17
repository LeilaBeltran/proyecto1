
package uvprincipiosDAO;

import proyecto1.coneccionDB;

public class personaDAO implements IDAOgeneral <persona>{

    @Override
    public boolean Guardar(persona pojo) {
        boolean res=false;
         coneccionDB con = new coneccionDB.getInstance();
        String sql = "insert into persona (clave, nombra, direccion, telefono,departamento) values "
                + "('" + pojo.getClave() + "','" + pojo.getNombre() + "','" + pojo.getDireccion()+ "','" +
                pojo.getTelefono() + "','" + pojo.getDepartamento()+ "')";
        
        res=con.execute(sql);
        return res;
    }


    
//     public boolean guardar(persona p){
//            boolean res=false;
//        coneccionDB con = new coneccionDB.getInstance();
//        String sql = "insert into persona (clave, nombra, direccion, telefono) values "
//                + "('" + p.getClave() + "','" + p.getNombre() + "','" + p.getDireccion()+ "','" +
//                p.getTelefono() + "')";
//        
//        res=con.execute(sql);
//        return res;
//    }
    
}
