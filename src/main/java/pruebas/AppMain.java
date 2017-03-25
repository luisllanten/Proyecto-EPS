/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author ASE_ALEON
 */
import modelo.Afiliado;
import modelo.Contrato;
import modelo.Departamento;
import modelo.Ips;
import modelo.Municipio;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppMain {
    
    public static void main (String[] args){
        
        EntityManagerFactory emf;
        EntityManager em; 
        
        emf = Persistence.createEntityManagerFactory("epsPU");        
        em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
   
         // Se crea objeto en memoria (sin persistir aun).
        Departamento cauca = new Departamento("19", "Cauca");
        Departamento antioquia = new Departamento("05", "Antioquia");
        
        tx.begin();
        em.persist(cauca); // Se persiste objeto en base de datos.
        em.persist(antioquia);
        tx.commit();
        
        Municipio popayan = new Municipio("001", "Popayan", cauca);
        Municipio almaguer = new Municipio("022", "Almaguer", cauca);
        Municipio medellin = new Municipio("001", "Medellin", antioquia);
        
        tx.begin();
        em.persist(popayan); // Se persiste objeto en base de datos.
        em.persist(almaguer);
        em.persist(medellin);
        tx.commit();
        
        Ips ese_popayan = new Ips("190015010001", "Ese Popayan", "817001771", "Calle 15 # 11 - 08", "8380200", "ese.popayan@gmail.com", popayan);
        
        tx.begin();
        em.persist(ese_popayan); // Se persiste objeto en base de datos.
        tx.commit();
        
        Contrato contrato_1 = new Contrato("001-2017", "Contrato de Promocion y Prevencion", (new GregorianCalendar(2017, 1, 1)).getTime(), (new GregorianCalendar(2017, 12, 31)).getTime(),500000000, ese_popayan);
        
        tx.begin();
        em.persist(contrato_1); // Se persiste objeto en base de datos.
        tx.commit();
        
        Afiliado afiliado_1 = new Afiliado("CC","4617607","LEON","SALAZAR","JOSE","ALEXANDER",(new GregorianCalendar(1980, 12, 6)).getTime(),"M","CLL 15 # 10 - 22","3132745470",(new GregorianCalendar(2017, 1, 1)).getTime(),(new GregorianCalendar(2017, 12, 31)).getTime(),1,popayan);
        afiliado_1.getContrato().add(contrato_1);
        
        Afiliado afiliado_2 = new Afiliado("CC","9876543210","ERAZO","RUBIO","JAMILSON","",(new GregorianCalendar(1983, 12, 7)).getTime(),"M","CRA 20 # 10 - 122","3103243470",(new GregorianCalendar(2017, 1, 1)).getTime(),(new GregorianCalendar(2017, 12, 31)).getTime(),1,popayan);
        afiliado_2.getContrato().add(contrato_1);
        
        tx.begin();
        em.persist(afiliado_1); // Se persiste objeto en base de datos.
        em.persist(afiliado_2); 
        tx.commit();
    }
    
}
