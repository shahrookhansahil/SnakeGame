import java.util.Arrays;

public class awesome_team {
public static int alpha (int[] keys) {
int n = keys.length;
if (n == 1) {
return keys[0];
}
int mid = n / 2;
int[] left = Arrays.copyOfRange(keys, 0, mid);
int[] right = Arrays.copyOfRange(keys, mid, n);
int leftSum = alpha(left);
int rightSum = alpha(right);
int leftMax = 0;
int leftRunningSum = 0;
for (int i = mid-1; i >= 0; i -= 2) {
leftRunningSum += keys[i];
leftMax = Math.max(leftMax, leftRunningSum);
}
int rightMax = 0;
int rightRunningSum = 0;
for (int i = mid+1; i < n; i += 1) {
rightRunningSum += keys[i];
rightMax = Math.max(rightMax, rightRunningSum);
}
return Math.max(leftSum + rightMax, rightSum + leftMax);
}

public static void main(String[] args) {
    int[] keys1 = {3};
    System.out.println("Output: " + alpha(keys1));
    int[] keys2 = {3,1,2,1};
    System.out.println("Output: " + alpha(keys2));
    int[] keys3 = {1,7,3,4,7,6,2,9};
    System.out.println("Output: " + alpha(keys3));
}
}