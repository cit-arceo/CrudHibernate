package org.uv.dao;

import java.util.List;
import org.uv.model.Empleados;
import org.uv.model.Departamentos;

/**
 *
 * @author citla
 */
public class Main {
    public static void main(String args[]) {
        Idao dao = factoryDao.getDao(factoryDao.DAOTYPE.EMPLEADOS);
        daoEmpleado empDao = new daoEmpleado();
        Empleados emp = new Empleados();
        

        emp.setNombre("Eva");
        emp.setDireccion("Cordoba");
        emp.setTelefono("123");
        emp.setClave(1);
        System.out.println(empDao.update(emp));
        
//        System.out.println("Se agrego con etsito...");
//        System.out.println("Se elimino con etsito...");
        System.out.println("Se actualizo con etsito...");

//Mostrar uno        
//        Empleados empleado = (Empleados) dao.readOne(1);
//        System.out.println(empleado.getClave() + " " +  empleado.getNombre());
        
//Mostrar todos        
//        List<Empleados> registros  = dao.readAll();
//        
//        for(Empleados empleado : registros ){
//            System.out.println(empleado.getClave() + " " + empleado.getNombre()
//                    + " " + empleado.getDireccion() + " " + empleado.getTelefono());
//        }
    }
}
