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
public class Ips {
    
    //Atributos
        private Integer id;
        private String codigo;
        private String descripcion;
        private String nit;
        private String direccion;
        private String telefono;
        private String correo;
        private Municipio municipio;
        
        public Ips(){}
      
        public Ips (Integer id, String codigo, String descripción, String nit, String direccion, String telefono, String correo, Municipio municipio){
        this.id=id;
        this.codigo=codigo;
        this.descripcion=descripción;
        this.nit=nit;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
        this.municipio=municipio;

        }

        
        //Métodos
        public String MostrarIps(){
        return "Id: "+id+"  "+"Codigo: "+codigo+"  "+"Descripcion: "+descripcion+"    "+"Nit: "+nit+"    "+"Direccion: "+direccion+"    "+"Telefono: "+
                telefono+"  "+"Correo: "+correo+"   "+"Municipio: "+municipio;                                      

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
        
        public String getDescripcion(){
            return descripcion;

        }

        public void setDescripcion(String descripcion){
            this.descripcion=descripcion;

        }
        
        public String getNit(){
            return nit;

        }

        public void setNit(String nit){
            this.nit=nit;

        }
        
        public String getDireccion(){
            return direccion;

        }

        public void setDireccion(String direccion){
            this.direccion=direccion;

        }
        
        public String getTelefono(){
            return telefono;

        }

        public void setTelefono(String telefono){
            this.telefono=telefono;

        }
        
         public Municipio getMunicipio(){
            return municipio;

        }

        public void setMunicipio(Municipio municipio){
            this.municipio=municipio;

        }
        
    
}
