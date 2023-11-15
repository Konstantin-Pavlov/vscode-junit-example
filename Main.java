
// task from here https://stepik.org/lesson/98411/step/7?auth=login&thread=solutions&unit=
// video to set the junit in vscode https://www.youtube.com/watch?v=936wHLIR4UY
// another video to set the junit in idea https://www.youtube.com/watch?v=uC6FFV8HbSw

import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public String setString(String[] a) {
        TreeSet<String> set = new TreeSet<>(Arrays.asList(a));
        StringBuilder res = new StringBuilder();
        for (String i : set) {
            res.append(i).append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public String setInt(int[] a) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : a) {
            set.add(i);
        }
        StringBuilder res = new StringBuilder();
        for (int i : set) {
            res.append(i).append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
