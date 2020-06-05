
package proyecto1;


public class Proyecto1 {

    public static void main(String[] args) {
        
        System.out.println("hola mundo");
        coneccionDB con;
        con=coneccionDB.getInstance();
        con=new coneccionDB();
        
        persona p = new persona();
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("Av 1");
        p.setTelefono("555");
        
        DAOpersona daop=new DAOpersona();
         daop.guardar(p);
    }
    
}
