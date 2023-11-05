// Infinity size stack.

public class DynamicStack extends MyStack {
    public DynamicStack(){
        super();  // it will call MyStack();
    }

    // push
    @Override
    public boolean push(int item){
        if(this.isFull()){
            // make a double size array
            int temp[] = new int[data.length * 2];

            // copy all elements in the temp array
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }


    public static void main(String[] args) throws StackExp {
        DynamicStack ds = new DynamicStack();

        ds.push(5);
        ds.push(6);
        ds.push(7);
        ds.push(8);

        System.out.println(ds.pop());
        System.out.println(ds.peek());
    }
}
