package org.uv.dao;

/**
 *
 * @author citla
 */
public class factoryDao {
    public enum DAOTYPE{EMPLEADOS,DEPARTAMENTOS}
    
    public static Idao getDao(DAOTYPE t){
        Idao dao = null;
        switch(t){
            case EMPLEADOS:
                dao = new daoEmpleado();
            break;
            case DEPARTAMENTOS:
                dao = new daoDepartamento();
            break;
        }
        return dao;
    }
}
