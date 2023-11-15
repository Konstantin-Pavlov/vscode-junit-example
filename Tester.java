import org.junit.*;

public class Tester {

    @Test
    public void t0() {
        Greet greet = new Greet();
        Assert.assertEquals("hello", greet.says());
    }

    @Test
    public void t1() {
         Assert.assertEquals("aa ab Ac BBB", new Main().setString(new String[] { "aa", "ab", "Ac", "BBB" }));
        //assert (new Main().setString(new String[] { "aa", "ab", "Ac", "BBB" }).equals("aa ab Ac BBB"));
    }

    @Test
    public void t2() {
        assert (new Main().setString(new String[] { "12", "33333", "7", "130" }).equals("12 130 33333 7"));
    }

    @Test
    public void t3() {
        assert (new Main().setInt(new int[] { 1, 7, 12, 3, 3, 3, 4 }).equals("1 3 3 3 4 7 12"));
    }

    @Test
    public void t4() {
        assert (new Main().setString(new String[] { "12", "33333", "7", "130" }).equals("7 12 130 33333"));
    }

    @Test
    public void t5() {
        assert (new Main().setString(new String[] { "aa", "ab", "Ac", "BBB" }).equals("Ac BBB aa ab"));
    }

    @Test
    public void t6() {
        assert (new Main().setInt(new int[] { 12, 33333, 7, 130 }).equals("7 12 130 33333"));
    }

    @Test
    public void t7() {
        assert (new Main().setInt(new int[] { 1, 12, 12, 3, 5, 7 }).equals("1 3 5 7 12"));
    }
}
