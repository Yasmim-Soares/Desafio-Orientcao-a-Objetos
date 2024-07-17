package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String Titulo;
    private String descrição;
    private LocalDate data;

     public Mentoria() {
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
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [Titulo=" + Titulo + ", descrição=" + descrição + ", data=" + data + "]";
    }

    
    
}
