public class NewClass {
    public static int getLargest(int arr[], int sz){   //  1 + 1
        int iterate1 = 0;  // 1
        int iterate2 = 0; // 1
        int largest = 0; // 1
        while (iterate1 < sz - 1){     // 1 + (sz - 1)
            iterate2++;        //         sz
            if (iterate2 == sz) {    // sz - 1
                iterate1++;        // sz
                iterate2 = iterate1;  // 1
                continue;
            }
            int product = arr[iterate1] * arr[iterate2];   // 1
            if (product > largest)         // 1
                largest = product;         // 1
        }
        return largest;  // 1



        // 1 + 1 + ( 1 + (1+ (1 + (1 + (sz - 1) + sz)))) * (((((sz - 1) + sz) + 1) + 1) + 1) + 1
        // 5 + 2sz * 2sz + 3
        // 4sz^2 + 7
        //Big 0(sz^2)
    }
}

