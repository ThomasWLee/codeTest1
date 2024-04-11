import org.junit.Test;

public class Solution1Test{


    @Test
    // test for stage 1
    public void test1() {
        Solution1 solution1 = new Solution1();
        String s;
        s = "aabcccbbad";
        s = "aabbbad";
        s = "caaa";
        s = "caaad";
        s = "zaaab";
        s = "aaab";
        s = "faaa";
        s = "faaaxxxxx";
        solution1.solve1(s, 1);
    }



    @Test
    // test for stage 2
    public void test2(){
        Solution1 solution1 = new Solution1();
        String s;
        s = "abcccbad";
        s = "ccccccfb";
        s = "cccecccfb";
        s = "bbcccecccfb";
        s = "ccfbbbb";
        solution1.solve2(s, 2);
    }


}
