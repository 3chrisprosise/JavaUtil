package MyKeyBord;

import java.util.Scanner; // 键盘输入
public class MyKeyBord {

    public String GetInput(){
        Scanner sca = new Scanner(System.in);
        String str  = sca.next();
        System.out.println(str);
        return str;
    }

}

