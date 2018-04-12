package cl.kustom89.easyshiping.models;

import com.orm.SugarRecord;

/**
 * Created by kustom89 on 12-04-2018.
 */

public class User extends SugarRecord {

    private String rut;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correo;

    public User(String rut, String firsName, String lastName, String birthDay, String address, String phone, String email) {
    }

    public User(String rut, String nombres, String apellidos, String fechaNacimiento, String correo) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correo=correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
