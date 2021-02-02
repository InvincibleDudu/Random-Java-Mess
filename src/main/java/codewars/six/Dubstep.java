package codewars.six;

/**
 * Created by InvincibleDudu on 10/09/2020 at 12:27
 * <p>
 * one-liner using regex... After seeing the discussion...
 * <p>
 * completed at 10-09 14:11:33
 */
public class Dubstep {
    public static String SongDecoder(String song) {
        // Your code is here...
//        var sb = new StringBuilder();
//        for (int i = 2; i < song.length(); i++) {
//            if (song.charAt(i - 2) == 'W' && song.charAt(i - 1) == 'U' && song.charAt(i) == 'B')
//                break;
//            else
//                sb.append(song.charAt(i - 2));
//        }
//        System.out.println(sb);
//        return sb.toString();
        System.out.println(song.replaceAll("(WUB){1,}", " ").trim());
        return song.replaceAll("(WUB){1,}", " ").trim();
    }

    public static void main(String[] args) {
        System.out.println("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB".replaceAll("(WUB){1,}", " ").trim());
    }
}
