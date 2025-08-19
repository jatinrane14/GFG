class MyStack {
    int top = -1;
    int arr[] = new int[150];
    public void push(int x) {
        // code here
        arr[++top] = x;
        
    }

    public int pop() {
        if(top>-1){
            int x = arr[top--];
            return x;
        }
        return -1;
        // code here
    }
}
