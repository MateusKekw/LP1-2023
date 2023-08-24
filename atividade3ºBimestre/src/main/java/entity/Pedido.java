package entity;

import jakarta.persistence.*;

import java.util.List;

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedprod",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "prod_id"))
    private List<Produto> produtos;


    public Pedido(Pessoa pessoa, List<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    public void produto_pessoa (){

    }
}