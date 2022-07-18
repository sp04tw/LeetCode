public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits_toBinaryString(int n) {      //5.15%
        //approach1
        // convert to binary string array
        String[] nString=Integer.toBinaryString(n).split("");
        //complement count to 32
        String[] bit32=new String[32];
        Arrays.fill(bit32,"0");
        int diff=32-nString.length;
        for(int i=nString.length-1;i>=0;i--){
            bit32[i+diff]=nString[i];
        }

        long result=0;
        for(int i=0;i<32;i++){
            result +=(long)(Integer.parseInt(bit32[i])*Math.pow(2,i));
        }
        return (int)result;
    }
    public int reverseBits_WithIntegerBuildFunction(int n){   //98.63%
        return Integer.reverse(n);
    }
}
