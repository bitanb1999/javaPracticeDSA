package practiceDSA;

//to get maximum active clients at earliest time
public class clientServerMaxInt {
    public static void EarliestInteraction(int[] start, int[] end) {
        int n = start.length;
        int max_cli = Integer.MIN_VALUE;
        int cli_in = 0;
        int i = 1, j = 0;
        int time = start[0];
        java.util.Arrays.sort(start);
        java.util.Arrays.sort(end);
        while (i < n && j < n) {
            if (start[i] < end[j]) {
                cli_in++;
                i++;
                if (max_cli < cli_in) {
                    max_cli = cli_in;
                    time = start[i];
                }
            } else {
                cli_in--;
                j++;
            }
        }
        System.out.println("earliest interaction" + time);
    }

}
