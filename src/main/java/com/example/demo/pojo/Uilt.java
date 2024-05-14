package com.example.demo.pojo;

public class Uilt {
    public static String major_case(Integer i){
        switch(i)
        {
            case 1 :
                return "语文";
            case 2 :
                return "数学";
            case 3 :
                return "英语";
            case 4 :
                return "物理";
            case 5 :
                return "化学";
            case 6 :
                return "生物";
            case 7 :
                return "历史";
            case 8 :
                return "政治";
            case 9 :
                return "地理";
        }
        return null;
    }
    public static void test(String i){
        System.out.println(i);
        Integer max=Integer.getInteger(i);
        System.out.println(max);
    }
}
