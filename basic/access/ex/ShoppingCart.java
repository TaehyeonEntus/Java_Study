package access.ex;

public class ShoppingCart {
    private Item[] cart = new Item[10];
    private int count;
    public void addItem(Item item){
        if(count<cart.length){
            this.cart[count++] = item;
        }
        else System.out.println("장바구니가 가득 찼습니다.");
    }
    public void displayItems() {
        for (int i = 0; i < count; i++) {
            Item item = cart[i];
            System.out.println("상품명 : " + item.getName() + " 가격 : " + item.getPrice() + " 수량 : " + item.getQuantity());
        }
    }

}
