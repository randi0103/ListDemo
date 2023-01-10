package test;

import java.util.ArrayList;
import java.util.LinkedList;
import goods.bread.Bread;
import goods.bread.panpan;
import goods.bread.qiepian;
import goods.drinks.Drinks;
import goods.drinks.cola;
import goods.drinks.juice;
import goods.drinks.xuebi;
import userdao.ShoppingCart;
import userdao.purchasedgoods;
import java.util.Scanner;
public class Main {
    /*创建对象*/
    public static ArrayList<Bread> breads;
    public static LinkedList<Drinks>drinks;
    /*封装：*/
    static{
        breads=new ArrayList<>();
        breads.add(new panpan());
        breads.add(new qiepian());
        drinks=new LinkedList<>();
        drinks.add(new juice());
        drinks.add(new xuebi());
        drinks.add(new cola());
    }
    public static void main(String[] args) {
        System.out.println("欢迎购物：");
        System.out.println("......菜单......");
        System.out.println("1......查看面包类"+"\n"+
                "2......查看饮料类"+"\n"+
                "3......添加商品"+"\n"+
                "4......删除商品"+"\n"+
                "5......查看购物车中的商品"+"\n"+
                "6......结账");
        while(true){
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            switch(i){
                case 1:
                    for(Bread bread:breads){
                        System.out.println(breads.toString());
                    }
                    break;
                case 2:
                    for(Drinks drinks1:drinks){
                        System.out.println(drinks.toString());
                    }
                    break;
                case 3:
                    ShoppingCart.add();
                    break;
                case 4:
                    ShoppingCart.delete();
                    break;
                case 5:
                    ShoppingCart.show();
                    break;
                case 6:


            }
        }

        /*遍历集合*/
      /*  ShoppingCart shoppingCart=new ShoppingCart();
        purchasedgoods purchasedgoods=new purchasedgoods();*/


        /*解决异常*/
      /*  shoppingCart.show();/*调用方法，显示购物车中的货物*/
    }
}