import java.util.*;

public class StringP {

    public static void stringPractise(String input){
        char[]charOfStringArray=input.toCharArray();
        System.out.println(Arrays.toString(charOfStringArray));

        /**
         * Substring
         */

        String sub=input.substring(0,input.length()-2);  //0,3
        System.out.println("Substring---"+sub);
    }

    public static String stringPractise1(String input){
        char[]chars=input.toCharArray(); int max=0;Map<Character,Integer>map=new HashMap<>();String output="";
        for(int i=0;i<chars.length;i++){
            char c= chars[i];
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);  //map.get(c) => previous count of character a => previous count of a + 1
            }
            else{
                map.put(c,1);
            }

            for(Map.Entry<Character,Integer>entry:map.entrySet()){
                max=Math.max(max,entry.getValue());
            }

            for(Map.Entry<Character,Integer>entry:map.entrySet()){
              if(entry.getValue()==max){
                  output=String.valueOf(entry.getKey());
              }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input="Pavan";
     //   stringPractise(input);
        System.out.println("Max char occurence is for character==="+stringPractise1(input));
        List<String>names=new ArrayList<>();
        names.add("Pavan"); names.add("Pavan"); names.add("Pavan"); names.add("Pavan"); names.add("Pavan");names.add("Pavan1");

        Set<String>set=new HashSet<>(names);
        List<String>list2=new ArrayList<>(set);
        System.out.println("List to Set--"+set);
        System.out.println("Set to List---"+list2);
    }
}
