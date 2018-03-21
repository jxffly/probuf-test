package com.fly;

import com.example.tutorial.People;

import java.util.Arrays;


/**
 * Created by jinxiaofei.
 * Time 2018/1/18 下午8:28
 * Desc 文件描述
 */
public class EncodeTest {

    public static void main(String[] args) {
        int a=(1<<28) + (1<<12)+(1<<7);
        People people=People.newBuilder().setName("aZa").setEmail("a").setId(a).build();
        byte[] bytes = people.toByteArray();
        System.out.println(Arrays.toString(bytes));

        for (int i = 0; i < bytes.length; i++) {
            if(bytes[i]<0){
                System.out.println(Integer.toBinaryString(bytes[i]).substring(24));

            }else {
                System.out.println(Integer.toBinaryString(bytes[i]));
            }
        }
        System.out.println(bytes.length);
        System.out.println((int) 'a');
        Integer VAL= (int) '金';
        System.out.println(VAL);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Arrays.toString("金".getBytes()));

    }
}
