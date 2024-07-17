package br.com.dio.dominio;

public class Curso {
    private String Titulo;
    private String descrição;
    private int cargahoraria;

    public Curso() {
    }

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    @Override
    public String toString() {
        return "Curso [Titulo=" + Titulo + ", descrição=" + descrição + ", cargahoraria=" + cargahoraria + "]";
    }

    
}
