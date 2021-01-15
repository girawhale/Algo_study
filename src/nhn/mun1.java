package nhn;

import java.util.Scanner;

public class mun1 {
    static class Player {
        char c;
        int n;

        public Player(char c, int n) {
            this.c = c;
            this.n = n;
        }
    }
    static Player[] players;
    static char[] nosul;
    static Player sul;
    static int position, n;
    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
        n = numOfAllPlayers - 1;
        players = new Player[numOfAllPlayers - 1];
        nosul = namesOfQuickPlayers;
        sul = new Player('A', 1);
        position = 0;
        char tmp = 'B';
        for(int i = 0; i < numOfAllPlayers - 1; i++) {
            players[i] = new Player(tmp, 0);
            tmp++;
        }
        for(int t = 0; t < numOfGames; t++) {
            int cur = position + numOfMovesPerGame[t];
            System.out.println(cur);
            if(cur >= n) {
                cur = cur % n;
            }
            else if(cur < 0) {
                cur = n + (cur % n);
            }
            boolean chk = false;
            for(int i = 0; i < nosul.length; i++) {
                if(players[cur].c == nosul[i]) {
                    chk = true;
                    break;
                }
            }
            if(!chk) {
                Player p = sul;
                sul = new Player(players[cur].c, players[cur].n + 1);
                players[cur] = p;
            }
            else {
                sul.n = sul.n + 1;
            }
            position =  cur;
        }
        for(int i = 0; i < numOfAllPlayers - 1; i++) {
            System.out.println(players[i].c + " " + players[i].n);
        }
        System.out.println(sul.c + " " + sul.n);
    }

    private static class InputData {
        int numOfAllPlayers;
        int numOfQuickPlayers;
        char[] namesOfQuickPlayers;
        int numOfGames;
        int[] numOfMovesPerGame;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
            System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

            inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.numOfMovesPerGame = new int[inputData.numOfGames];
            String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            for(int i = 0; i < inputData.numOfGames ; i++){
                inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
    }
}