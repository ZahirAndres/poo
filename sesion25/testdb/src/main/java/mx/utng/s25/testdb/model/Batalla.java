package mx.utng.s25.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Batalla {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    private String direccion;

    public String getDireccion() {
        return direccion;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
