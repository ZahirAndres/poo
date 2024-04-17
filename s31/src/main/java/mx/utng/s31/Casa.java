package mx.utng.s31;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Casa {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jefeFamilia;
    
    @ElementCollection
    @Column(name="Integrantes")
    private Collection<String> otros;

    public Long getId() {
        return id;
    }
    public String getJefeFamilia() {
        return jefeFamilia;
    }
    public Collection<String> getOtros() {
        return otros;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public void setJefeFamilia(String jefeFamilia) {
        this.jefeFamilia = jefeFamilia;
    }
    public void setOtros(Collection<String> otros) {
        this.otros = otros;
    }
    @Override
    public int hashCode() { //SAcar un numero que represente un objeto (Para comparar)
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((jefeFamilia == null) ? 0 : jefeFamilia.hashCode());
        result = prime * result + ((otros == null) ? 0 : otros.hashCode());
        return result;
    }
    @Override //Compara para que sea el mismo objeto
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Casa other = (Casa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (jefeFamilia == null) {
            if (other.jefeFamilia != null)
                return false;
        } else if (!jefeFamilia.equals(other.jefeFamilia))
            return false;
        if (otros == null) {
            if (other.otros != null)
                return false;
        } else if (!otros.equals(other.otros))
            return false;
        return true;
    }
    @Override
    public String toString() { //Representacion en texto del objeto, represeantacion en una cadena del objeto
        return "Casa [id=" + id + ", jefeFamilia=" + jefeFamilia + ", otros=" + otros + "]";
    }
}
