/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvPrincipiosTest;

import proyecto1.persona;
import uvprincipiosDAO.IDAOgeneral;
import uvprincipiosDAO.departamento;
import uvprincipiosDAO.factoryDAO;

/**
 *
 * @author Owner
 */
public class principal {
    public static void main(String[] args){
        IDAOgeneral daop = factoryDAO.create(factoryDAO.TypeDAO.PERSONA);
        persona p = new persona();
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("Av. 1");
        p.setTelefono("777");
        
        departamento dep = new departamento();
        dep.setClave("01");
        p.setDepartamento(dep);
        
        daop.Guardar(p);
    }
    
}
