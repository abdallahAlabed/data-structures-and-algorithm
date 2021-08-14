package queue;

public class MultiBracket {

    private Stack<Character> stack;

    public MultiBracket() {
        this.stack = new Stack<>();
    }

    boolean areBracketsBalanced(String str) throws Exception {

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                this.stack.push(current);
                continue;
            }

            if (this.stack.isEmpty())
                return false;
            char check;
            switch (current) {
                case ')':
                    check = this.stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = this.stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = this.stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (this.stack.isEmpty());
    }

}