package br.com.academia.domain.aluno;

import java.time.LocalDate;
import java.util.Objects;

public class Acesso {
    private int id;
    private Aluno aluno = new Aluno();
    private LocalDate dataEntr;
    private LocalDate dataSaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDate getDataEntr() {
        return dataEntr;
    }

    public void setDataEntr(LocalDate dataEntr) {
        this.dataEntr = dataEntr;
    }

    public LocalDate getDataSaid() {
        return dataSaid;
    }

    public void setDataSaid(LocalDate dataSaid) {
        this.dataSaid = dataSaid;
    }

    @Override
    public String toString() {
        return "Acesso{" +
                "id=" + id +
                ", aluno=" + aluno +
                ", dataEntr=" + dataEntr +
                ", dataSaid=" + dataSaid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acesso acesso = (Acesso) o;
        return id == acesso.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
