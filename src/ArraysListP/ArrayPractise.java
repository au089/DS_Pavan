package ArraysListP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractise {

    public static void testing(){
        int [] intArray=new int[3];
        intArray[0]=1;intArray[1]=2;intArray[2]=3;

        int[]intArray1={5,6,7};
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray1));
        List<int[]> l=  Arrays.asList(intArray);
        System.out.println(Arrays.asList(intArray));
    }

    public static void maxSumApproach1(int[] firstArray,int []secondArray ){
        int max=0;
        for(int i=0;i<firstArray.length;i++){
            System.out.println("Parent----"+firstArray[i]);
            for(int j=0;j<secondArray.length;j++){
                System.out.println("Child----"+secondArray[j]);

                int sum=firstArray[i]+secondArray[j];
                max=Math.max(max,sum);
            }
        }
        System.out.println("Maximum sum is ----"+max);
    }

    public static void maxSumApproach2(int[] firstArray,int []secondArray){
         int max1=0;int max2=0;
         for(int i=0;i <firstArray.length;i++){                        //n
             max1=Math.max(max1,firstArray[i]);
         }

         for(int j=0;j<secondArray.length;j++){                          //n
             max2=Math.max(max2,secondArray[j]);
         }
        int output=max1+max2;
        System.out.println("Maximum sum is Approach 2----" + output);

        int[] thirdArray= Arrays.copyOf(firstArray,firstArray.length-1);
        System.out.println("Third Array"+Arrays.toString(thirdArray));

        int[]fourthArray=new int[4];
        Arrays.fill(fourthArray,9);
        System.out.println("fourth array--"+Arrays.toString(fourthArray));

        int []fifthArray=new int[5];
        Arrays.fill(fifthArray,0,3,9);
        System.out.println("Fifth Array---"+Arrays.toString(fifthArray));

        Object[]sixthArray={47,76,98};
        Object[]seventhArray={76,47,98};

        System.out.println("Whether sixth and seventh arrays are same---"+Arrays.deepEquals(sixthArray,seventhArray));
    }

    public static void listTest(List<String>input){
        for(int i=0;i<input.size();i++){
            System.out.println(input.get(i));
        }

        int indexOfAbc1=input.indexOf("abc16");
        System.out.println("indexOf abc1 ****************"+indexOfAbc1);

        System.out.println("Last index of abc2***********"+ input.lastIndexOf("abc2"));

        System.out.println("Whether list contains abc4*********"+input.containsAll(input));
        List<String>l=new ArrayList<>();
        System.out.println("Add All===="+l.addAll(input));
        System.out.println("new list--"+l);
        input.add("abc5");

        System.out.println("whether new list l contains all values of input list or not----"+l.containsAll(input));
        List<String>sublist=input.subList(0,3);
        System.out.println("sublist---"+sublist);
    }



    public static void main(String[] args) {
       /* int[] firstArray={4,5,7};
        int[] secondArray={7,8,9};
        maxSumApproach1(firstArray,secondArray);
        maxSumApproach2(firstArray,secondArray);*/

       List<String>listName= new ArrayList<>();
       listName.add("abc");listName.add("abc1");listName.add("abc2");listName.add("abc3");listName.add("abc2");listName.add("abc2");listName.add("abc3");
        listTest(listName);
    }
}
