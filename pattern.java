

public class pattern {
     public static void main(String[] args) {
        int n=4;/*rows */
        int m=5;/*columns */
        int num=1;//for floyd's triangle
        int diamond=1;
        //simple 4 star pattern
        // for(int i=1;i<=4;i++){
        //     System.out.println("*");
        // }
        //2)
        // ****
        // ****
        // ****
        // ****
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //3)
        //   *****
        //   *   *
        //   *   *
        //   *****
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=m;j++){
            //         if(i==1||i==n||j==1||j==m){
            //             System.out.print("*");
                        
            //         }
            //         else{
            //             System.out.print(" ");
            //         }

            //     }
            //     System.out.println();
            // }
// *
// **
// ***
// ****
                // for(int i=1;i<=n;i++){
                //     for(int j=1;j<=i;j++){
                //         System.out.print("*");

                //     }
                //     System.out.println();

                // }
// ****
// ***
// **
// *
//                 for(int i=n;i>=1;i--){
//                     for(int j=1;j<=i;j++){
//                         System.out.print("*");
//                     }
//                     System.out.println();
//                 }
//     }
// }
// *
// **
// ***
// ****
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
        
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
        // for(int i=m;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
//Floyds triangle
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num + " ");
        //         num++;

        //     }
        //     System.out.println();
        // }
 //1
// 01
// 101
 //0101
// 10101  
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         int s = i+j;
        //         if(s%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
    //     *
    //     **
    //    ***
    //   ****
    //  *****
    //  ****
    //  ***
    //  **
    //  *
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=m-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
        
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
//         for(int i=1;i<=n;i++){
//                 for(int j=1;j<=i;j++){
//                         System.out.print("*");
//                 }
//                 int space=2*(n-i);
//                 for(int j=1;j<=space;j++){
//                         System.out.print(" ");
//                 }
//                 for(int j=1;j<=i;j++){
//                         System.out.print("*");
//                 }
//                 System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//                 for(int j=1;j<=i;j++){
//                         System.out.print("*");
//                 }
//                 int space=2*(n-i);
//                 for(int j=1;j<=space;j++){
//                         System.out.print(" ");
//                 }
//                 for(int j=1;j<=i;j++){
//                         System.out.print("*");
//                 }
//                 System.out.println();
// //         }
//                 *****
//                *****
//              *****
//           *****
        // for(int i=1;i<=n;i++){
        //         int sp=n-i;
        //         for(int j=1;j<=sp;j++){
        //                 System.out.print(" ");
        //         }
        //         for(int j=1;j<=5;j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
//         for(int i=1;i<=m;i++){
//                 int sp=m-i;
//                 for(int j=1;j<=sp;j++){
//                         System.out.print(" ");

//                 }
//                 for(int j=1;j<=i;j++){
//                         System.out.print(i + " ");
//                 }
//                 System.out.println();

//         }
//     1
//    212
//   32123
//  4321234
// 543212345
// we can also add 1 in the last for loop if we want to add one in the sencond half as we started the loop from 2
//         for(int i=1;i<=m;i++){
//                 int sp=m-i;
//                 for(int j=1;j<=sp;j++){
//                         System.out.print(" ");
//                 }
//first half
//                 for(int j=i;j>=1;j--){
//                         System.out.print(j);
//                 }
//second half
//                 for(int j=2;j<=i;j++){
//                         System.out.print(j);
//                 }
//                 System.out.println();
//         }
// Star diamond pattern
        for(int i=1;i<=n;i++){
                int sp=n-i;
                for(int j=1;j<=sp;j++){
                        System.out.print(" ");
                }
                int mul=2*i-1;
                for(int j=1;j<=mul;j++){
                        System.out.print("*");
                        
                }
                System.out.println();
        }
        for(int i=n;i>=1;i--){
                int sp=n-i;
                for(int j=1;j<=sp;j++){
                        System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                        System.out.print("*");
                }
                System.out.println();

        }
  }
 }

