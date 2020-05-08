package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author yw
 * @date 2020/5/7
 * 1、IDEA中代码模板所处的位置：settings-Editor-live Templates/Postfix Completion
 */
public class TemplateTest {

    //模板一：psvm
    public static void  main (String[] args){
        //模板二：sout
        System.out.println("hello!");
        //变形：soutp/soutm/soutv(输出变量，当出现两个时，选择就近的)/xxx.out
        int num1 = 10;
        System.out.println("num1 = " + num1);
        //System.out.println("args = [" + args + "]");
        //模板三：fori
        String[] arr = new String[]{"Tom","jerry","lilei"};
        for (int i = 0; i <arr.length ; i++) {
            
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        //变形： iter
        for (String s : arr) {
            
        }
        //模板四： list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("提交");
        }

    }
}
