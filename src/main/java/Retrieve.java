class Retrieve extends AccountOperation {
    Retrieve(double amount) {
        super(- Math.abs(amount));
        if(amount<0){
            throw new IllegalArgumentException("Amount can not be negative");
        }
    }
}
