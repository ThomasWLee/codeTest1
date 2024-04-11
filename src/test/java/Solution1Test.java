import org.junit.Test;

public class Solution1Test{

    @Test
    public void test1() {
        Solution1 solution1 = new Solution1();
        // test for stage 1
        String s;
        s = "aabcccbbad";
//    s = "aabbbad";
//    s = "caaa";
//    s = "caaad";
        s = "zaaab";
        s = "aaab";
        s = "faaa";
        s = "faaaxxxxx";
        solution1.solve1(s, 1);
    }


}
