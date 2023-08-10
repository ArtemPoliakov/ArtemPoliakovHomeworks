package org.example;

public class Homework_2 {
}
class NameEncoderDecoder{
    public String encode(String name){
        name = name.replace('e', '1')
                .replace('u', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('a', '5');
        return "NOTFORYOU" + name + "YESNOTFORYOU";
    }
    public String decode(String name){
        name = name.replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a');
        name = name.replaceFirst("NOTFORYOU", "");
        name = name.replace("YESNOTFORYOU", "");
        return name;

        // по-нормальному треба обрізати по індексам (ім'я теоретично може бути YESNOTFORYOU)
    }
}
