public class Modelo{
    // instance variables - replace the example below with your own
    private String usuario, contraseña;
    
    public Modelo(){
    }
    
    public Modelo(String usuario, String contraseña){
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie usuario*/
    public String getUsuario(){
        return this.usuario;
    }//end method getUsuario

    /**SET Method Propertie usuario*/
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }//end method setUsuario

    /**GET Method Propertie contraseña*/
    public String getContraseña(){
        return this.contraseña;
    }//end method getContraseña

    /**SET Method Propertie contraseña*/
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }//end method setContraseña

//End GetterSetterExtension Source Code


}//End class