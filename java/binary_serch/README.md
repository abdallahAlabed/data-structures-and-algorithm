# Binary Search of Sorted Array

Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the value of the search key, or -1 if the element is not in the array.
NOTE: The search algorithm used in your function should be a binary search.
Check the Resources section for details

## Whiteboard Process

![Challenge1](img/binry-search.jpg)


# Domain:-

Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the value of the search key, or -1 if the element is not in the array.
NOTE: The search algorithm used in your function should be a binary search.
Check the Resources section for details



# Algorthim :-

 binary search is a search algorithm that finds the position of a target value within a sorted array. Binary search compares the target value to the middle element of the arra

# Visual:-

[1,2,3,4,5,6,7,8,9], (val)

-> [[].length/2] > val -> go right or [[].length/2] < val go left or [[].length/2] == val return index  ->iterate until finsh the array if there is no match return not found 


# Code :-

    public static int binarySearch(int[] arr, int value) {

        int middle = arr.length/2;

        int rightBound = arr.length;
        
        
        while (middle >= 0) {

            if (arr[middle] == value) {

                return middle;

            }else if (arr[middle] < value){

                if(middle == arr.length -1) {

                    break;

                }else{

                    middle = (middle + rightBound) / 2;

                }
            }else{
                
                if (middle == 0) {
                    break;
                }
                else {

                    rightBound = middle;
                    middle = middle / 2;

                }
            }
        }
        return -1;
    }


