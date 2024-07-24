package br.com.projetoalura.modelos;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "produtos")
public class Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String nome;

    public Produto(String nome, String descricao, int preço, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preço = preço;
        this.categoria = categoria;
    }

    private String descricao;
    private int preço;
    private LocalDate dataCadastro;

    @ManyToOne
    private Categoria categoria;

    public Produto() {

    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
