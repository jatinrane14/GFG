class twoStacks {
    twoStacks() {}
    int top1 = -1;
    int arr1[] =  new int[200];
    
    int top2 = -1;
    int arr2[] =  new int[200];
    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(top1<=200){
            arr1[++top1] = x;
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(top2<=200){
            arr2[++top2] = x;
        }
        // code here
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(top1>-1){
            int x  = arr1[top1--];
            return x;
        }
        return -1;
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2>-1){
            int x  = arr2[top2--];
            return x;
        }
        return -1;
    }
}