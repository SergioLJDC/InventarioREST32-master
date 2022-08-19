package com.bave.inventariorest.MultipleKey;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Access (AccessType.FIELD)
public class CustomerId implements Serializable {


    @Column(name = "EMPLEADO_ID" )
    int idEmpleado;
    @Column(name = "FUNCION")
    int funcion ;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerId that = (CustomerId) o;
        return idEmpleado == that.idEmpleado && funcion == that.funcion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado, funcion);
    }

    public int getFuncion() {
        return funcion;
    }

    public void setFuncion(int funcion) {
        this.funcion = funcion;
    }

    public CustomerId() {
    }

    public CustomerId(int idEmpleado, int rut) {
        this.idEmpleado = idEmpleado;

    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    public int getIdEmpleado() {
        return idEmpleado;
    }





}
