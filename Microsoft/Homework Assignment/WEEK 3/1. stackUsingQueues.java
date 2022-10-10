class MyStack {
    Queue<Integer> s = new LinkedList<Integer>();
    
    public void push(int x) {
        s.add(x);
        
        int t = s.size();
        while (t-- > 1)
            s.add(s.poll());
    }

    public int pop() {
        return s.poll();
    }

    public int top() {
        return s.peek();
    }

    public boolean empty() {
        return s.isEmpty();
    }
}
