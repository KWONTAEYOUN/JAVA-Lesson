package object.자습;

public class Menu {
    private String name; // 식당 이름
    private String[] menu;  // 메뉴 이름
    private int[] prices;   // 음식 가격
    private int PricesSum;    // 주문한 음식의 총합
    // getter
    public String getName() {
        return name;
    }
    public String[] getMenu() {
        return menu;
    }
    public int[] getPrices() {
        return prices;
    }
    public int getPricessum() {
        return PricesSum;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setMenu(String[] menu) {
        this.menu = menu;
    }
    public void setPrices(int[] prices) {
        this.prices = prices;
    }
    public void setPricessum(int[] select) {
        int sum = 0;
        for (int i = 0; i < select.length; i++) {
            int temp = select.length;
            if(temp == -1) break;
            sum += prices[temp];
       } this.PricesSum = sum;
    }

    
                
            
            
    }
    



