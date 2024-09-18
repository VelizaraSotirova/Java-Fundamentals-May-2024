package Lab.Songs;

import java.util.*;

public class Songs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int songsCount = Integer.parseInt(sc.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < songsCount; i++) {
            String[] data = sc.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = sc.nextLine();

        if(typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }

//        List<Song> filterSong = songs.stream().filter(e -> e.getTypeList().equals(typeList))
//                .toList();
//
//        for (Song song : filterSong) {
//            System.out.println(song.getName());
//        }
    }
}

