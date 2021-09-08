package FavouriteSong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] databaseSongs = scan.nextLine().split("_");
            String type = databaseSongs[0];
            String name = databaseSongs[1];
            String time = databaseSongs[2];
            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);
        }
        String typeList = scan.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            List<Song> filterSongs = songs.stream().filter(e -> e.getTypeList().equals(typeList))
                    .collect(Collectors.toList());
            for (Song song : filterSongs) {
                System.out.println(song.getName());
            }
        }
    }
}
