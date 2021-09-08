import java.util.*;
import java.util.stream.Collectors;

public class SoftUniKaraoke_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> participantsInKaraoke = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        List<String> songsInKaraoke = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String, Participants> karaoke = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("dawn")) {
            String[] tokens = input.split(",\\s+");
            String participant = tokens[0];
            String song = tokens[1];
            String award = tokens[2];
            if (participantsInKaraoke.contains(participant) && songsInKaraoke.contains(song) && !karaoke.containsKey(participant)) {
                Participants newParticipant = new Participants(song, new ArrayList<>());
                karaoke.put(participant, newParticipant);
                karaoke.get(participant).getAwards().add(award);
            } else if (participantsInKaraoke.contains(participant) && songsInKaraoke.contains(song) && karaoke.containsKey(participant)) {
                if (!karaoke.get(participant).getAwards().contains(award)) {
                    karaoke.get(participant).getAwards().add(award);
                }
            }
            input = scan.nextLine();
        }
        if (karaoke.size() > 0) {
            karaoke
                    .entrySet()
                    .stream()
                    .sorted((a, b) -> {
                        int result = Integer.compare(b.getValue().getAwards().size(), a.getValue().getAwards().size());
                        if (result == 0) {
                            return a.getKey().compareTo(b.getKey());
                        }
                        return result;
                    }).forEach(entry -> {
                        System.out.printf("%s: %d awards%n", entry.getKey(), entry.getValue().getAwards().size());
                        entry.getValue().getAwards().sort(String::compareTo);
                        for (int i = 0; i <= entry.getValue().getAwards().size() - 1 ; i++) {
                            String award = entry.getValue().getAwards().get(i);
                            System.out.printf("--%s%n", award);
                        }
                    });
        } else {
            System.out.println("No awards");


        }
    }

}
class Participants {
    private String song;
    private List<String> awards;

    public List<String> getAwards() {
        return awards;
    }
    public Participants(String song, List<String> awards) {
        this.song = song;
        this.awards = awards;
    }
}
