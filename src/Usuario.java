import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<String> favoritos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.favoritos = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<String> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<String> favoritos) {
        this.favoritos = favoritos;
    }
}