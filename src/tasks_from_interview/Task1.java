package tasks_from_interview;

import java.util.Map;

/*
* сбертех
* нужно написать метод который
* Map<String, Object> перевести в "одноуровневую" Map<String, Object>,
*  при этом в исходной мапе Object может быть такой же мапой (вложенной) - в этом случае необходимо
*
*
* На вход:
* {
  "a": "string",
  "b": 1,
  "c": {
    "ca": "string2",
    "cc": {
      "inner": "abc"
    }
  }
  *На выход:
  * {
  "a": "string",
  "b": 1,
  "c.ca" : "string2",
  "c.cc.inner" : "abc"
}
*
* */
public class Task1 {

    public static void main(String[] args) {

    }


    public static Map<String,Object> method (Map<String,Object> map){
        return null;
    }
}
