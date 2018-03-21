package com.fly;

import com.google.protobuf.InvalidProtocolBufferException;

import com.example.tutorial.JavaPerson;
import com.example.tutorial.People;
import com.example.tutorial.Person;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InvalidProtocolBufferException {
        Person person = Person.newBuilder().setName("张三").setPage(15).setPageNum(20).build();
        System.out.println(person);
        System.out.println(person.getNameBytes().toString(StandardCharsets.UTF_8));

        Person.PhoneType phoneType = Person.PhoneType.forNumber(0);
        System.out.println(phoneType);
        byte[] javaByte = person.toByteArray();
        System.out.println(javaByte.length);
        System.out.println(Arrays.toString(javaByte));
        JavaPerson javaPerson = new JavaPerson();
        javaPerson.setName("张三");
        People person1 = People.parseFrom(javaByte);
        System.out.println(person1.toString());
        byte[] bytes = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(javaPerson);
            oos.flush();
            bytes = bos.toByteArray ();
            oos.close();
            bos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(bytes.length);;
    }
}
