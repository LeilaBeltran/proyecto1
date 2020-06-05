
package proyecto1;


public class DAOpersona {
    
    public boolean guardar(persona p){
            boolean res=false;
        coneccionDB con = new coneccionDB.getInstance();
        String sql = "insert into persona (clave, nombra, direccion, telefono) values "
                + "('" + p.getClave() + "','" + p.getNombre() + "','" + p.getDireccion()+ "','" +
                p.getTelefono() + "')";
        
        res=con.execute(sql);
        return res;
    }
    
    
}
