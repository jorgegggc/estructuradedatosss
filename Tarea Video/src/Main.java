import java.util.ArrayList;
import java.util.Scanner;

class Video {
    private String titulo;
    private String autor;
    private String url;
    private boolean activo;

    public Video(String titulo, String autor, String url, boolean activo) {
        this.titulo = titulo;
        this.autor = autor;
        this.url = url;
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", URL: " + url + ", Activo: " + activo;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Video> videos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese los detalles del video");
            
            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            
            System.out.print("URL: ");
            String url = scanner.nextLine();
            
            System.out.print("Esta activo (si/no): ");
            boolean activo = scanner.nextLine().trim().equalsIgnoreCase("si");
            
            Video video = new Video(titulo, autor, url, activo);
            videos.add(video);
            
            System.out.print("Desea agregar otro video (si/no): ");
            if (!scanner.nextLine().trim().equalsIgnoreCase("si")) {
                break;
            }
        }
        
        System.out.println("\nLista:");
        for (Video video : videos) {
            System.out.println(video);
        }
        
        scanner.close();
    }
}
