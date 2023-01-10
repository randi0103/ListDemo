package userdao;

import userdao.purchasedgoods;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    static ArrayList<String> list = new ArrayList<>();
    private ArrayList<purchasedgoods> purchasedgoodsArrayList;/*创建对象*/
    private final int weightlimit = 2000;/*容量限制*/
    private int existweight;/*投进去的容量*/

    public ShoppingCart() {
        this.purchasedgoodsArrayList = new ArrayList<>();
    }

    public Boolean isOverweightOf() {
        return existweight >= weightlimit;
    }
    /*开始添加商品*/
  /*  public static Boolean add(purchasedgoods chase){
        Boolean flag=false;
        /*数量乘以质量+存在的质量*/
     /*   if(existweight+chase.getCom().getQuality()*chase.getAmount()>=weightlimit){
            System.out.println("超重！");
        }else{
                System.out.println("请输入您要添加的商品：");
                Scanner sc = new Scanner(System.in);
                String goods1 = sc.next();
                String stringArray1[] = goods1.split(" ");

                for (int i = 0; i < stringArray1.length; i++) {
                    list.add(stringArray1[i]);
                }
            }*/

    public static void add(){


        System.out.println("请输入您想要加入购物车的商品：");
        Scanner sc = new Scanner(System.in);
        String goods = sc.next();
        String stringArray[] = goods.split(" ");
        //    ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            list.add(stringArray[i]);
        }
        System.out.println("添加成功"+"\n"+"添加商品有：");
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            System.out.println(s);
        }
    }


    /*删除商品*/
    public static void delete(){
        System.out.println("请输入您要删除的商品：");
        Scanner sc = new Scanner(System.in);
        String goods1 = sc.next();
        String stringArray1[] = goods1.split(" ");

        for (int i = 0; i < stringArray1.length; i++) {
            list.remove(stringArray1[i]);
        }
        System.out.println("已成功删除");
    }

    public static void show(){
        String result="";
            result+=list;
            result+="\n";
        /*遍历*/
       if(result.equals("")){/*equals进行判断*/
            result="购物车空";
        }
        System.out.println(result);
    }

}