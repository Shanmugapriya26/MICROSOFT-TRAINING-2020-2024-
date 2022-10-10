class Solution {
    public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    String[] k = path.split("/");
    for (int i = 0; i < k.length; i++) {
        if (!stack.empty() && k[i].equals(".."))
            stack.pop();
        else if (!k[i].equals(".") && !k[i].equals("") && !k[i].equals(".."))
            stack.push(k[i]);
    }
    List<String> list = new ArrayList(stack);
    return "/"+String.join("/", list);
}
}
