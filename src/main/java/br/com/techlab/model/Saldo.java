package br.com.techlab.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.joda.money.Money;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Saldo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idPessoa;

    private Money saldo;

    @UpdateTimestamp
    private LocalDateTime updateTimestamp;
    @CreationTimestamp
    private LocalDateTime creationTimestamp;

    public Saldo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Money getSaldo() {
        return saldo;
    }

    public void setSaldo(Money saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public LocalDateTime getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(LocalDateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @Override
    public String toString() {
        return "Saldo{" +
                "id=" + id +
                ", idPessoa=" + idPessoa +
                ", saldo=" + saldo +
                ", updateTimestamp=" + updateTimestamp +
                ", creationTimestamp=" + creationTimestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Saldo saldo = (Saldo) o;

        if (!id.equals(saldo.id)) return false;
        return idPessoa.equals(saldo.idPessoa);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + idPessoa.hashCode();
        return result;
    }
}
