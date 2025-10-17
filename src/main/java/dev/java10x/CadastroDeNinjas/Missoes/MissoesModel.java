package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.DificuldadeMissao;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private DificuldadeMissao dificuldade;

    //OneToMany - Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel(String nome, String descricao, DificuldadeMissao dificuldade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public MissoesModel() {
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

    public DificuldadeMissao getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(DificuldadeMissao dificuldade) {
        this.dificuldade = dificuldade;
    }
}
