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
public class Municipio {
    
    //Atributos
        private Integer id;
        private String codigo;
        private String descripcion;
        private Departamento departamento;

        //Constructores
       
        public Municipio(){}
      
        public Municipio (Integer id, String codigo, String descripción, Departamento departamento){
        this.id=id;
        this.codigo=codigo;
        this.descripcion=descripción;
        this.departamento=departamento;

        }

        
        //Métodos
        public String MostrarMunicipio(){
        return "Id: "+id+"  "+"Descripcion: "+descripcion+"    "+"Codigo: "+codigo+"    "+"Departamento: "+departamento;                                      

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
        
        public Departamento getDepartamento(){
            return departamento;
        }
        
        public void setDepartamento(Departamento departamento){
            this.departamento=departamento;
        }

    void setDepartamento(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
