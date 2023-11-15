import org.junit.*;

public class Tester {

    @Test
    public void t0() {
        Greet greet = new Greet();
        Assert.assertEquals("hello", greet.says());
    }

    @Test
    public void t1() {
        // this only shows that error occures
        // assert (new Main().setString(new String[] {"aa", "ab", "Ac", "BBB"}).equals("aa ab Ac BBB"));

        // this shows an actual error, it's better way
        Assert.assertEquals("aa ab Ac BBB", new Main().setString(new String[] { "aa", "ab", "Ac", "BBB" }));
    }

    @Test
    public void t2() {
        Assert.assertEquals("12 130 33333 7", new Main().setString(new String[] { "12", "33333", "7", "130" }));
    }

    @Test
    public void t3() {
        Assert.assertEquals("1 3 3 3 4 7 12", new Main().setInt(new int[] { 1, 7, 12, 3, 3, 3, 4 }));
    }

    @Test
    public void t4() {
        Assert.assertEquals("7 12 130 33333", new Main().setString(new String[] { "12", "33333", "7", "130" }));
    }

    @Test
    public void t5() {
        Assert.assertEquals("Ac BBB aa ab", new Main().setString(new String[] { "aa", "ab", "Ac", "BBB" }));
    }

    @Test
    public void t6() {
        Assert.assertEquals("7 12 130 33333", new Main().setInt(new int[] { 12, 33333, 7, 130 }));
    }

    @Test
    public void t7() {
        Assert.assertEquals("1 3 5 7 12", new Main().setInt(new int[] { 1, 12, 12, 3, 5, 7 }));
    }
}
