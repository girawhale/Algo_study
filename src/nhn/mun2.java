package nhn;

import java.util.Scanner;

public class mun2 {
    static int[] list;
    static int ret = 0;

    private static void solution(int day, int width, int[][] blocks) {
        list = new int[width];
        for(int d = 0; d < day; d++) {
            for (int w = 0; w < width; w++) {
                list[w] += blocks[d][w];
            }
            int start = 0, end = 0;
            boolean chk = false;
            while (true) {
                if(end + 1 == width) break;
                if (!chk && (list[end] > list[end + 1])) {
                    chk = true;
                    end += 1;
                }
                else if(chk && (list[end] > list[end + 1])) {
                    int num = Math.min(list[start], list[end]);
                    for(int i = start + 1; i < end; i++) {
                        ret += (num - list[i]);
                        System.out.println(num - list[i]);
                        list[i] = num;
                    }
                    start = end;
                    chk = false;
                }
                else if(chk && (list[end] <= list[end + 1])) {
                    end += 1;
                }
                else if(!chk && (list[end] <= list[end + 1])) {
                    end += 1;
                }
            }
        }
        System.out.println(ret);
    }

    private static class InputData {
        int day;
        int width;
        int[][] blocks;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.blocks = new int[inputData.day][inputData.width];
            for (int i = 0; i < inputData.day; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.width; j++) {
                    inputData.blocks[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.day, inputData.width, inputData.blocks);
    }
}