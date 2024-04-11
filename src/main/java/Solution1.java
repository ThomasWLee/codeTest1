



public class Solution1 {

    void solveCore(String s, int type){
        int len;
        boolean foundThreeIdenticalChars = true;
        while(foundThreeIdenticalChars){
            foundThreeIdenticalChars = false;

            len = s.length();
            if(len < 3){
                return;
            }
            int j;
            for(int i = 0; i + 2 < len; i++){
                if(s.charAt(i + 1) == s.charAt(i) && s.charAt(i+2) == s.charAt(i)){
                    foundThreeIdenticalChars = true;
                }
                if(foundThreeIdenticalChars){
                    j = i + 1;
                    while(j < len && s.charAt(j) == s.charAt(i)){
                        j ++;
                    }
                    // 新字符串的左右两个子字符串
                    String left = "";
                    String right = "";
                    // 连续3个或以上个一样字母的前部分
                    left = s.substring(0, i);
                    // 连续3个或以上个一样字母的后部分
                    if(j < len){
                        right = s.substring(j, len);
                    }
                    if(type == 2){
                        // 连续字符串的字母的前一个字母
                        char preChar;
                        // 如果是'a'呢，它的前一个字母是什么？
                        if(s.charAt(i) == 'a'){
                            preChar = 'z';
                        }else{
                            // java: incompatible types: possible lossy conversion from int to char
                            preChar = (char)(s.charAt(i) - 1);
                        }
                        s = left + preChar + right;
                    }else{
                        s = left + right;
                    }

                    System.out.println(s);
                    // 绝对不能漏
                    break;
                }

            }
        }
    }

    void solve1(String s, int type){
        solveCore(s, 1);
    }
    void solve2(String s, int type){
        solveCore(s, 2);
    }

    public static void main(String[] args){

//        Solution1 solution1 = new Solution1();




        System.out.println("above test 1 ---------------------------");

    }

}
