import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> elencoFilme = new ArrayList<String>();
        elencoFilme.add("Ator 1");
        elencoFilme.add("Atriz 1");
        Filmes filme = new Filmes("A volta dos que nao foram", "Diretor 1", elencoFilme, "Drama", "Sinopse do Filme 1", 2022, "16");

        ArrayList<String> elencoSerie = new ArrayList<String>();
        elencoSerie.add("Ator 2");
        elencoSerie.add("Atriz 2");
        Series serie = new Series("Dark", "Criador 1", elencoSerie, "Comédia", "Sinopse da Série 1", 2020, "14", 3, 20);

        Usuario usuario = new Usuario("João", "joao@gmail.com", "123456");

        boolean sair = false;
        while (!sair) {
            System.out.println("\n### MENU PRINCIPAL ###");
            System.out.println("1 - Filmes");
            System.out.println("2 - Séries");
            System.out.println("3 - Favoritos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    boolean sairFilmes = false;
                    while (!sairFilmes) {
                        System.out.println("\n### FILMES ###");
                        System.out.println("1 - Ver informações do filme");
                        System.out.println("2 - Adicionar filme aos favoritos");
                        System.out.println("3 - Voltar");
                        System.out.print("Escolha uma opção: ");

                        int opcaoFilmes = sc.nextInt();
                        sc.nextLine();

                        switch (opcaoFilmes) {
                            case 1:
                                System.out.println("\n### INFORMAÇÕES DO FILME ###");
                                System.out.println("Título: " + filme.getTitulo());
                                System.out.println("Diretor: " + filme.getDiretor());
                                System.out.println("Elenco: " + filme.getElenco());
                                System.out.println("Gênero: " + filme.getGenero());
                                System.out.println("Sinopse: " + filme.getSinopse());
                                System.out.println("Ano de lançamento: " + filme.getAnoLancamento());
                                System.out.println("Classificação: " + filme.getClassificacao());
                                break;
                            case 2:
                                usuario.getFavoritos().add(filme.getTitulo());
                                System.out.println("\nFilme adicionado aos favoritos!");
                                break;
                            case 3:
                                sairFilmes = true;
                                break;
                            default:
                                System.out.println("\nOpção inválida!");
                        }
                    }
                    break;
                case 2:
                    boolean sairSeries = false;
                    while (!sairSeries) {
                        System.out.println("\n### SÉRIES ###");
                        System.out.println("1 - Ver informações da série");
                        System.out.println("2 - Adicionar série aos favoritos");
                        System.out.println("3 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        int opcaoSeries = sc.nextInt();
                        sc.nextLine();

                        switch (opcaoSeries) {
                            case 1:
                                System.out.println("\n### INFORMAÇÕES DA SÉRIE ###");
                                System.out.println("Título: " + serie.getTitulo());
                                System.out.println("Criador: " + serie.getCriador());
                                System.out.println("Elenco: " + serie.getElenco());
                                System.out.println("Gênero: " + serie.getGenero());
                                System.out.println("Sinopse: " + serie.getSinopse());
                                System.out.println("Ano de lançamento: " + serie.getAno_lancamento());
                                System.out.println("Classificação: " + serie.getClassificacao());
                                System.out.println("Temporadas: " + serie.getTemporadas());
                                System.out.println("Episódios por temporada: " + serie.getEpisodios());
                                break;
                            case 2:
                                usuario.getFavoritos().add(serie.getTitulo());
                                System.out.println("\nSérie adicionada aos favoritos!");
                                break;
                            case 3:
                                sairSeries = true;
                                break;
                            default:
                                System.out.println("\nOpção inválida!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n### FAVORITOS ###");
                    if (usuario.getFavoritos().size() == 0) {
                        System.out.println("Nenhum filme ou série foi adicionado aos favoritos.");
                    } else {
                        for (String favorito : usuario.getFavoritos()) {
                            System.out.println(favorito);
                        }
                    }
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
        System.out.println("\nPrograma finalizado.");
        sc.close();
    }
}

