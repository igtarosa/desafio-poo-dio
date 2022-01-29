package br.com.desafio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargahoraria() {
        return cargaHoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargaHoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargaHoraria +
                '}';
    }

}
