class Solution {
    public int maximumSwap(int num) {

        char[] numArr = Integer.toString(num).toCharArray();  // Convert the integer 'num' to a string and then to a char array
        int n = numArr.length;  // Get the length of the char array
        int[] ind = new int[n];  // Create an array 'ind' to store the index of the maximum digit from the current position to the end
        ind[n-1] = n-1;  // The last element is always the maximum in its position, so initialize it

// Traverse the array from second last element to the first element
       for (int i = n-2; i >= 0; i--) {
    // Compare current element with the maximum element found so far from the right
        if ((int)numArr[i] <= (int)numArr[ind[i+1]]) {
           ind[i] = ind[i+1];  // If the current element is smaller or equal, update the index to the max element's index
        } else {
           ind[i] = i;  // Otherwise, the current element itself is the max at that position
        }
      }

// Traverse the array to find the first position where swapping can increase the number
     for (int i = 0; i < n; i++) {
    // Check if the current element is not the maximum and not equal to the max element found
       if (i != ind[i] && numArr[i] != numArr[ind[i]]) {
        // Swap the current element with the max element found in the remaining part
        char temp = numArr[i];
        numArr[i] = numArr[ind[i]];
        numArr[ind[i]] = temp;
        // Return the new number formed after swapping
        return Integer.parseInt(new String(numArr));
       }
    }

// If no swap is performed, return the original number
     return num;

    }
}