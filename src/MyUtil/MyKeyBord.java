package MyUtil;

import java.util.Scanner; // 键盘输入
public class MyKeyBord { //类的单继承关系，所有类都直接或间接继承自 Object 类

    public String GetInput(){
        Scanner sca = new Scanner(System.in);
        String str  = sca.next();
        System.out.println(str);
        return str;
    }

}

