class ProductOfNumbers {
    List<Integer> stream;

    public ProductOfNumbers() {
        stream = new ArrayList<>();
        stream.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            stream.clear();
            stream.add(1);
        } else
            stream.add(stream.get(stream.size() - 1) * num);
    }

    public int getProduct(int k) {
        if(k>= stream.size()) return 0;
        return stream.get(stream.size() - 1) / stream.get(stream.size() - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */