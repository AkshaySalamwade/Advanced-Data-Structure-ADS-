import java.util.Scanner;

class Stack{
    final int max ;
    int [] a;
    private int top;
    Stack(int n)
    {
        top=-1;
        max=n;
        a = new int[max];
    }
    public void push(int ele)
    {
        a[++top]=ele;
    }
    public int pop()
    {
        if(top==-1)
            return -1;
        return a[top--];
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
}
class Bracketing{

    public boolean bracket(String s){
        Stack st = new Stack(s.length());
        char t;
        for (int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
//            if(c=='{')
//                st.push(c);
//            else if(c=='}') {
//                t = (char) st.pop();
//                if (t == -1) {
//                    return false;
//                }
            switch (c)
            {
                case '{':
                case '(':
                case '[':
                    st.push(c);
                    break;
                case '}':
                    t=(char)st.pop();
                    if(t==-1||t!='{')
                        return false;
                    break;
                case ')':
                    t=(char)st.pop();
                    if(t==-1||t!='(')
                        return false;
                    break;
                case ']':
                    t=(char)st.pop();
                    if(t==-1||t!='[')
                        return false;
                    break;
                default:
                    System.out.println("Invalid input");
                    return false;
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
       Bracketing b = new Bracketing();
        Scanner sc=new Scanner(System.in);
        System.out.println(b.bracket(sc.nextLine()));
    }
}