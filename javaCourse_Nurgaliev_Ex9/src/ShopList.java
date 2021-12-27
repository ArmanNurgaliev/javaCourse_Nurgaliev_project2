public class ShopList<T extends Available> {
    private T product;

    public ShopList() {
    }

    public ShopList(T product) {
        this.product = product;
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ShopList{" +
                "product=" + product +
                '}';
    }
}
