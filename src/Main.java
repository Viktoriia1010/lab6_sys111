
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

class Main {
    public static void main(String[] args) {
        try {
            URL song = new URL("https://dn710307.ca.archive.org/0/items/angora-overdrive-2005/Ashbury%20Heights%20-%20Angora%20Overdrive%20%28Demo%29/3%20-%20Ashbury%20Heights%20-%20World%20Coming%20Down%20%28Demo%29%20%5Bml6oynxSgkQ%5D.mp3");
            URLConnection connection = song.openConnection();

            // OutputStream out = connection.getOutputStream(); // для записи

            InputStream input = connection.getInputStream();
            Files.copy(input, new File("C:/Users/Привет/song.mp3").toPath());
            System.out.println("файл скачан");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




