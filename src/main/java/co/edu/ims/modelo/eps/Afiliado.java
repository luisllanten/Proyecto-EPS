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
public class Afiliado {
    
    //Atributos
        private Integer id;
        private String tipo_documento;
        private String num_documento;
        private String apellido1;
        private String apellido2;
        private String nombre1;
        private String nombre2;
        private java.util.Date fecha_nacimiento;
        private String genero;
        private Municipio municipio;
        private String direccion;
        private String telefono;
        private java.util.Date fecha_afiliacion;
        private java.util.Date fecha_retiro;
        private Integer estado;
        
        //Constructores
       
        public Afiliado(){}
      
        public Afiliado (Integer id, String tipo_documento, String num_documento, String apellido1, String apellido2, String nombre1,
                String nombre2, java.util.Date fecha_nacimiento, String genero, Municipio municipio,String direccion, String telefono, java.util.Date fecha_afiliacion,
                java.util.Date fecha_retiro, int estado){
        this.id=id;
        this.tipo_documento=tipo_documento;
        this.num_documento=num_documento;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.nombre1=nombre1;
        this.nombre2=nombre2;
        this.fecha_nacimiento=fecha_nacimiento;
        this.genero=genero;
        this.municipio=municipio;
        this.direccion=direccion;
        this.telefono=telefono;
        this.fecha_afiliacion=fecha_afiliacion;
        this.fecha_retiro=fecha_retiro;
        this.estado=estado;

        }
        
         //Métodos
        public String MostrarAfiliado(){
        return "Id: "+id+"  "+"Tipo documento: "+tipo_documento+"   "+"Num documento: "+num_documento+" "+"Apellido1: "+apellido1+" "+"Apellido2: "
                +apellido2+"    "+"Nombre1: "+nombre1+" "+"Nombre2: "+nombre2+" "+"Nacimiento: "+fecha_nacimiento+" "+"Genero: "+genero+"   "+
                "Municipio: "+municipio+"   "+"Direccion: "+direccion+" "+"Telefono: "+telefono+"   "+"Afiliacion: "+fecha_afiliacion+" "+
                "Retiro: "+fecha_retiro+"   "+"Estado: "+estado;                                      

        }
        
        public Integer getId(){
            return id;

        }

        public void setId(Integer id){
            this.id=id;

        }

        public String getTipoDocumento(){
            return tipo_documento;

        }
        
        public void setTipoDocumento(String tipo_documento){
            this.tipo_documento=tipo_documento;

        }
        
        public String getNumDocumento(){
            return num_documento;

        }
        
        public void setNumDocumento(String num_documento){
            this.num_documento=num_documento;

        }
        
        public String getApellido1(){
            return apellido1;

        }
        
        public void setApellido1(String apellido1){
            this.apellido1=apellido1;

        }
        
        public String getApellido2(){
            return apellido2;

        }
        
        public void setApellido2(String apellido2){
            this.apellido2=apellido2;

        }
        
        public String getNombre1(){
            return nombre1;

        }
        
        public void setNombre1(String nombre1){
            this.nombre1=nombre1;

        }
        
        public String getNombre2(){
            return nombre2;

        }
        
        public void setNombre2(String nombre2){
            this.nombre1=nombre2;

        }
        
        public Date getFechaNacimiento(){
            return fecha_nacimiento;

        }
        
        public void setFechaNacimiento(Date fecha_nacimiento){
            this.fecha_nacimiento=fecha_nacimiento;

        }
        
        public String getGenero(){
            return genero;

        }
        
        public void setGenero(String genero){
            this.genero=genero;

        }
        
        public Municipio getMunicipio(){
            return municipio;

        }
        
        public void setMunicipio(Municipio municipio){
            this.municipio=municipio;

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
        
        public Date getFechaAfiliacion(){
            return fecha_afiliacion;

        }
        
        public void setFechaAfiliacion(Date fecha_afiliacion){
            this.fecha_afiliacion=fecha_afiliacion;

        }
        
        public Date getFechaRetiro(){
            return fecha_retiro;

        }
        
        public void setFechaRetiro(Date fecha_retiro){
            this.fecha_retiro=fecha_retiro;

        }
        
        public Integer getEstado(){
            return estado;

        }
        
        public void setEstado(Integer estado){
            this.estado=estado;

        }

        
    
}
