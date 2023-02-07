import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class task2 {
    public static  void main(String[] args) {
// 1
        System.out.println("==========================");
        int a = 5;
        int b = 10;

        a = a + b;//15
        b = a - b;//10 = 15 - 10 = 5
        a = a - b; //15 -5

        System.out.println(a);
        System.out.println(b);

        String str1 = "hello";
        String str2 = "world";

        str1 = str1.concat(str2); // helloworld
        str2 = str1.substring(0, str2.length());

        str1 = str1.substring(str2.length());
        System.out.println(str1); //world
        System.out.println(str2); //hello

        //2
        System.out.println("==========================");

        int[] nums = {3, 2, 1, 5, 4};
        Arrays.sort(nums);
        int secondLarger = nums[nums.length - 2];
        int max = nums.length;
        int min = nums[0];
        System.out.println(secondLarger);
        System.out.println(max);
        System.out.println(min);

        //3
        System.out.println("==========================");
        String str = "qwerTY123";

        int counterAlpha = 0;

        for (int i = 0; i < str.length(); i++) {
//            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z' )||( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
//            counterAlpha += 1;
//            counterAlpha = ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
//                    (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) ? 1 + counterAlpha : counterAlpha;
        }
        System.out.println(counterAlpha);

        // 6
        System.out.println("==========================");
        String str3 = "civic";
        String str3rev = "";

        for (int i = str3.length() - 1; i >= 0; i--) {
            str3rev += str3.charAt(i);

        }
        //System.out.println(str3rev);
        String palindrome = (str3.equals(str3rev)) ? ("palindrome") : ("not palindrome");
        System.out.println(palindrome);


        //7 Prime
        System.out.println("==========================");

        int num =11;

        boolean primebool = false;


        for (int i = 2; i <= num/2  ; i++) {
            if (num % i == 0) {
                primebool = true;
                break;
            }
            //System.out.println(primebool);

        }

        if (!primebool) {
            System.out.println("prime " + num);
        } else {
            System.out.println("NOT prime " + num);
        }
        //System.out.println(i);

        System.out.println("---------------");

        // 8 fibonacchi

        int aa = 0, bb = 1, cc;
        for (int i = 0; i < 10; i++) {
            System.out.print(aa + " ");
            cc = aa + bb;
            aa = bb;
            bb = cc;
        }

        // 9 duplicates in array list

        System.out.println("\n---------------");
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        ArrayList newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
         if(!newList.contains(list.get(i))){
             newList.add(list.get(i));
         }
        }
        System.out.println(newList);

        // 10 sort array with out sort method
        System.out.println("---------------------------");
        int [] arr = {3,2,1,5,4};

//        TreeSet<Integer> soretedSet = new TreeSet<>();
//        for (int n : arr){
//            soretedSet.add(n);
//        }
//        for (int i = 0 ; i < arr.length; i++){
        //int temp = 0;
//            for(int k = i+1; k < arr.length ; k++){
//                if(arr[i]> arr[k]){
//                    temp = arr[i];
        //             arr[i] = arr[k]
        //              arr[k] = temp;
//                }
//            }
//        }
   //     System.out.println(Arrays.toString(sorted));
      //  System.out.println(soretedSet);

        //11 reversed array

//        int [] arr1 = {3,2,1,5,4};
//        int [] rev2 = new int[arr1.length];
//         for (int i = arr1.length-1; i>0;i--){
//             int k = 0;
//             ++k;
//            rev2[k] = arr1[i];
//
//        }
//        System.out.println(Arrays.toString(rev2));
        int [] arr1 = {3,2,1,5,4};
        int [] rev2 = new int[arr1.length];
        for (int i = arr1.length-1; i >= 0; i--){
            int k = arr1.length-1-i;
            rev2[k] = arr1[i];
        }
        System.out.println(Arrays.toString(rev2));
        //strar tree 15

        int size = 5;
        for(int i=0; i<size; i++) {
            for(int k=0; k<size-i; k++) {
                System.out.print(" ");
            }
            for(int j=0; j<=(2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// perfect
        int n = 28;
        int sum = 1;
        for(int i = 2; i*i<n;i++){
            if (n%i ==0){
                if(i*i!=n)
                    sum = sum +i + n/i;
                else
                    sum = sum +i;
            }
        }

        if(sum == n && n != 1){
            System.out.println(true);
        }else System.out.println(false);
    }
}
