
package uvprincipiosDAO;

public class factoryDAO {
    
    public enum TypeDAO{PERSONA,DEPARTAMENTO};
    public static IDAOgeneral create(TypeDAO t){
        IDAOgeneral dao = null;
        switch(t){
            case PERSONA:
                dao = new personaDAO();
                break;
            case DEPARTAMENTO:
                dao =new departamentoDAO();
                break;
        }
        return dao;
        }
    }
    
    
    
