package quiz3;

/*
7. Given the variables
String stars = "*****";
String stripes = "=====";

what do these loops print?
    i. int i = 0;
    while (i < 5){
    System.out.print(stars.substring(0, i));
    System.out.println(stripes.substring(i, 5));
    i++;
    }

    ii. int i = 0;
    while (i < 10){
    if (i % 2 == 0)
    System.out.println(stars);
    else
    System.out.println(stripes);
    }
*/
public class Solution7 {
    public static void main(String[] args) {
        String stars = "*****";
        String stripes = "=====";
        /*int i = 0;
        while (i < 5){
            System.out.print(stars.substring(0, i));
            System.out.println(stripes.substring(i, 5));
            i++;
        }
        */
        /*Output:
        =====
        *====
        **===
        ***==
        ****=
        */
        int j=0;
        while (j < 10){
            if (j % 2 == 0)
            {
                System.out.println(stars);
            }else{
                System.out.println(stripes);
            }
            j++;
        }
        
        
        /*
        *****
        =====
        *****
        =====
        *****
        =====
        *****
        =====
        *****
        =====
        */
    }
}
