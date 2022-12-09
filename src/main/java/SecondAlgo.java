import java.util.*;


public class SecondAlgo {
    static boolean areBracketsBalanced(String expr)
    {
        Deque<Character> qq
                = new ArrayDeque<Character>();

        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                qq.push(x);
                continue;
            }

            if (qq.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = qq.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = qq.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = qq.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (qq.isEmpty());
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "([{}])";

        // Function call
        if (areBracketsBalanced(str))
            System.out.println("ДА ");
        else
            System.out.println("Нет");
    }
}

