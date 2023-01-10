package userdao;

import goods.Kind.commidity;
public class purchasedgoods {
    private int amount;
    private commidity com;

    @Override
    public  String toString() {
        return "userdao.purchasedgoods{" +
                "amount=" + amount +
                ", com=" + com +
                '}';
    }
    public purchasedgoods(){
        this.com=com;
        this.amount=amount;
    }

    public commidity getCom() {
        return com;
    }

    public void setCom(commidity com) {
        this.com = com;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
