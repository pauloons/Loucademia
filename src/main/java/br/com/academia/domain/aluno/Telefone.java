package br.com.academia.domain.aluno;

import java.util.Objects;

public class Telefone {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return numero == telefone.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
