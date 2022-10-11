class Solution {
    public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    String[] K = path.split("/");
    for (int i = 0; i < K.length; i++) {
        if (!stack.empty() && K[i].equals(".."))
            stack.pop();
        else if (!K[i].equals(".") && !K[i].equals("") && !K[i].equals(".."))
            stack.push(K[i]);
    }
    List<String> list = new ArrayList(stack);
    return "/"+String.join("/", list);
}
}
