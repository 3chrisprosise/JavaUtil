package MyUtil;

public class MyObject {
    Object obj = new Object();
    public boolean Equal(){
        boolean result = this.obj.equals(this.obj);
        System.out.println(result);
        return result;
    }
    public String GetMemoryStorage(){
        String Memstor = obj.toString();
        System.out.println(Memstor);
        return Memstor;
    }
}


