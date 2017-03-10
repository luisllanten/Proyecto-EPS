/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo.eps;

import java.util.Date;

/**
 *
 * @author ASE_ALEON
 */
public class AppMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Departamento cauca =  new Departamento(1,"19","CAUCA");
                
        Municipio popayan = new Municipio(1,"001","POPAYAN",cauca);
        
        Afiliado afiliado1 = new Afiliado(1,"CC","4617607","LEON","SALAZAR","JOSE","ALEXANDER",new Date(1980, 6, 12),"M",popayan,"DIRECCION 1","3132745470",
        new Date(1980, 6, 12),new Date(1980, 6, 12),1);
        
        Ips ips1 =  new Ips(1,"19001514001","ESE POPAYAN","817001773","DIRECCION DE LA IPS","8380200","IPS@GMAIL.COM",popayan);
                
        String resultado=cauca.MostrarDepartamento();
        System.out.println(resultado);
        System.out.println("");
        
        String resultado1=popayan.MostrarMunicipio();
        System.out.println(resultado1);
        System.out.println("");
        
        String resultado2=afiliado1.MostrarAfiliado();
        System.out.println(resultado2);
        System.out.println("");
        
        String resultado3=ips1.MostrarIps();
        System.out.println(resultado3);
    }
    
}
