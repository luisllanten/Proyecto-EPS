/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo.eps;

/**
 *
 * @author ASE_ALEON
 */
public class Departamento {
    
    
        //Atributos
        private Integer id;
        private String codigo;
        private String descripcion;

        //Constructores
        public Departamento(){}
        public Departamento (Integer id, String codigo, String descripción){
        this.id=id;
        this.codigo=codigo;
        this.descripcion=descripción;

        }

       
        //Métodos
        public String MostrarDepartamento(){
        return "Id: "+id+"  "+"Descripcion: "+descripcion+"    "+"Codigo: "+codigo+ "";                                      

        }

        
        public Integer getId(){
            return id;

        }

        public void setId(Integer id){
            this.id=id;

        }
        
        public String getCodigo(){
            return codigo;

        }

        public void setCodigo(String codigo){
            this.codigo=codigo;

        }

        public String getdDescripcion(){
            return descripcion;
        }
        public void setDescripcion(String descripcion){
            this.descripcion=descripcion;
        }

}
