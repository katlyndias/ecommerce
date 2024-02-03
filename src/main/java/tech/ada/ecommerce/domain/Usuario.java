package tech.ada.ecommerce.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity // Anotação que mostra que a classe é uma entidade do banco de dados
@Table // Anotação do JPA que mostra que a classe é uma tabela do banco de dados
@Getter // Anotaçã do Lombok que realiza os gets dos campos
@Setter // Anotação do Lombok que realiza os sets dos campos
@EqualsAndHashCode // Anotação do Lombok que realiza o Equals e HashCode da classe
@AllArgsConstructor // Anotação que faz um construtor com todos os campos da classe
@NoArgsConstructor // Anotação que faz um construtor sem nenhum campo da classe

public class Usuario {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
    private String nome;
    private String endereco;
    private String cpf;
    private String cidade;
    private String uf;

//    // construtor
//    public Usuario(){
//    }

//    // getter
//    public Long getId() {
//        return id;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public String getEndereco() {
//        return endereco;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public String getUf() {
//        return uf;
//    }
//
//    // setter
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void setEndereco(String endereco) {
//        this.endereco = endereco;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public void setUf(String uf) {
//        this.uf = uf;
//    }
//
//    // Equals e Hash Code
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(id, usuario.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
