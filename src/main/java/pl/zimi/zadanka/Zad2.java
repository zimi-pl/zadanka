package pl.zimi.zadanka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* source:
https://leetcode.com/problems/missing-number/submissions/
input ex.:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */

//DANE TESTOWE KTORYCH NIE OGARNIA
/*
[674,908,187,622,556,525,11,884,861,934,797,508,457,799,956,735,490,61,34,590,667,606,415,348,725,418,409,371,92,943,802,347,180,181,529,374,7,157,515,437,947,702,255,949,297,780,922,383,604,121,730,905,664,142,482,296,463,870,539,542,291,179,250,767,103,707,566,352,107,796,598,477,631,57,228,642,648,537,96,659,830,679,245,645,615,847,787,167,445,116,283,196,260,112,387,829,26,105,591,464,486,910,595,939,993,175,747,919,754,362,819,318,476,293,657,811,104,97,608,145,10,992,229,710,119,138,243,333,837,899,763,56,748,925,85,302,706,857,314,278,485,745,711,759,298,982,518,41,932,522,478,259,120,417,392,101,354,921,389,933,574,962,723,238,204,704,983,853,623,742,117,413,868,365,158,774,66,757,914,873,308,129,613,599,455,351,264,842,558,47,917,989,995,224,326,108,251,841,578,401,396,483,859,332,564,223,338,459,488,571,575,628,59,915,16,217,345,212,573,203,882,335,698,570,701,494,816,403,9,461,50,43,330,382,42,928,115,58,600,739,746,81,222,2,670,506,22,311,122,809,588,768,141,265,605,193,734,812,510,489,632,143,262,894,568,28,758,89,507,856,111,288,385,821,587,136,860,630,536,546,865,955,21,654,369,130,185,715,994,159,789,717,708,534,285,682,147,124,562,887,164,863,538,629,153,186,140,428,356,390,210,194,584,553,306,760,596,294,693,123,621,864,55,784,35,514,106,144,736,160,753,889,958,69,535,258,671,997,49,712,38,341,827,201,794,779,430,785,272,70,695,929,872,470,420,263,434,209,807,900,244,761,970,214,979,336,643,195,511,960,441,594,127,926,62,242,651,902,890,662,73,572,954,686,133,113,363,51,627,425,854,231,358,139,391,517,468,410,149,793,503,790,948,550,791,678,234,307,208,924,169,848,977,27,324,275,959,331,636,543,63,579,215,676,449,581,65,256,766,465,380,661,493,33,165,731,426,886,299,337,741,953,554,134,360,207,495,254,637,617,235,205,835,414,427,340,805,656,305,798,743,456,268,46,541,991,368,800,492,199,713,498,649,20,60,406,183,967,206,931,709,274,421,737,190,68,481,966,852,772,422,327,239,697,878,981,582,444,504,353,898,888,191,471,740,148,88,778,386,849,593,443,764,804,240,876,218,951,220,469,170,906,945,429,817,891,826,6,641,379,694,398,343,806,453,53,916,399,836,376,583,281,609,684,252,102,619,547,611,700,792,689,248,439,969,501,569,416,963,941,211,555,114,4,25,361,653,334,313,166,565,135,935,86,267,965,442,184,703,15,257,310,892,303,580,79,990,321,616,839,815,844,279,513,650,226,855,738,30,132,720,749,500,475,271,270,548,771,871,339,724,603,526,213,927,843,328,301,350,913,944,833,312,109,840,99,37,325,976,527,225,126,751,497,29,782,532,151,801,696,869,972,45,912,172,851,458,287,447,317,64,32,810,384,198,14,261,394,404,820,395,681,54,295,540,71,669,52,246,577,82,316,968,192,227,909,663,946,174,150,247,545,866,266,561,795,146,237,342,618,282,94,973,918,12,614,776,940,284,411,277,549,756,450,241,460,161,813,319,474,424,675,176,624,673,370,893,516,91,936,137,100,290,323,975,950,44,769,13,36,400,18,31,638,635,154,752,473,344,831,911,273,832,499,402,479,777,814,714,128,633,373,269,156,920,438,808,289,907,765,744,173,727,879,726,77,118,834,0,372,320,462,533,803,3,722,467,825,885,658,177,300,48,952,846,349,999,895,454,930,718,576,877,412,523,530,978,110,435,597,505,719,236,901,672,985,957,988,76,531,162,446,563,883,1,850,292,5,640,452,155,961,655,828,221,84,691,755,448,773,286,647,178,152,472,502,750,528,78,626,732,544,781,8,171,315,762,329,601,858,818,232,83,845,509,405,366,90,867,322,304,625,512,620,639,431,998,559,677,163,40,880,692,230,491,685,729,276,182,378,487,359,19,964,72,688,520,188,984,233,189,586,589,652,971,690,592,557,419,17,496,249,862,388,375,996,39,733,367,896,364,280,200,687,552,125,432,770,634,683,823,665,660,381,897,786,74,838,95,705,610,131,93,602,788,728,721,408,423,644,440,357,87,202,699,822,407,67,567,436,560,980,519,881,938,355,874,433,607,168,309,680,824,666,75,646,903,904,937,393,253,974,585,775,98,875,480,986,80,987,466,524,197,397,923,24,716,783,942,484,346,377,612,521,551,451,216,23,668]

 */


public class Zad2 {
    static List<Integer> getInput() {
        List<Integer> inputNumbers = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.next();

        String inputLineNoBrackets = inputLine.replaceAll("[\\]\\[]", "");
        String[] splicedString = inputLineNoBrackets.split(",");
        for (String s : splicedString) {
            inputNumbers.add(Integer.parseInt(s));
        }
        return inputNumbers;
    }

    public int missingNumber(int[] nums) {
        List<Integer> l = new ArrayList<>(nums.length);
        for (int i : nums) {
            l.add(i);
        }
        Collections.sort(l);
        Integer i = 0;

        if (l.get(0).equals(0)) {
            while (l.get(i).equals(i)) {
                i++;

                if (i.equals(l.size())) {
                    break;
                }
            }
        }
        return i;
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers = getInput();
        //        Integer x = findMissingNumber(inputNumbers);
        System.out.println(new Solution().missingNumber(inputNumbers.toArray(new Integer[inputNumbers.size()]))););
    }

    private static class Solution {
    }
}