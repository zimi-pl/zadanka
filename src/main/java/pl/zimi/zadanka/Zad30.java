package pl.zimi.zadanka;

//https://leetcode.com/problems/container-with-most-water/
public class Zad30 {
    public int maxArea(int[] height) {
        return twoPoint(height);
    }

    int twoPoint(int[] height) {
        int maxVolume = 0;
        int l = 0;
        int r = height.length-1;
        int calculated = 0;
        int min;
        while (l != r) {
            min = height[l]<height[r]?l:r;
            maxVolume = Math.max((r-l)*height[min],maxVolume);
            if (min == l){
                l+=1;
            }
            else {
                r-=1;
            }
            System.out.println(calculated);
        }
        return maxVolume;
    }

    int bruteForce(int[] height) {
        int n = height.length;
        int maxVolume = 0;
        int calculatedVolume = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                calculatedVolume = (j - i) * Math.min(height[j], height[i]);
                if (calculatedVolume > maxVolume) {
                    maxVolume = calculatedVolume;
                }
            }
        }
        return maxVolume;
    }
}
