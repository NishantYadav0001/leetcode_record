class ProductOfNumbers {    
    List<Integer> stream;
    public ProductOfNumbers() {
        stream = new ArrayList<>();
    }
    
    public void add(int num) {
        stream.add(num);
    }
    
    public int getProduct(int k) {
        int size = stream.size();
        int product = 1;
        while(k-- > 0){
            product *= stream.get(size-1);
            size--;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */