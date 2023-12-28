package subString;

import java.util.Arrays;
import java.util.Objects;

public class maxSlideWindows {
    public static int[] maxSlideWindow(int[] nums, int k){
        int [] tem=new int[k];
        for (int i=0;i<tem.length;i++)tem[i]=Integer.MIN_VALUE;
        int [] result= new int [nums.length-k+1];
        int removeNum=0;
        int back=0;
        result[0]=nums[0];
        for (int t=0;t<k;t++){
            tem[t]=nums[t];
            if (result[0]<nums[t])result[0]=nums[t];
        }
        for (int i=k;i<nums.length;i++){
            back=tem[removeNum];
            if (nums[i]>back)
                result[i-k+1]=Math.max(result[i-k],nums[i]);
            else {
                if (nums[i] < back && back!= result[i - k]) result[i - k + 1] = result[i - k];
                if (nums[i] < back && back == result[i - k]) {
                    tem[removeNum] = nums[i];
                    int[] t=tem.clone();
                    Arrays.sort(t);
                    result[i - k + 1] = t[k - 1];
                }
            }

            tem[removeNum]=nums[i];
            removeNum=(removeNum+1)%k;

        }
        return result;
    }


    public static void main(String[] args) {
        int []nums={7157,9172,7262,-9146,3087,5117,4046,7726,-1071,6011,5444,-48,-1385,-7328,3255,1600,586,-5160,-371,-5978,9837,3255,-6137,8587,-3403,9775,260,6016,9797,3371,2395,6851,2349,-7019,9318,1211,-3110,8735,-7507,1784,7400,-5799,3169,-7696,-8991,-2222,-9434,-4490,4034,-831,-9656,5488,-4395,9339,4104,-9058,-4072,-1172,1758,6878,-5570,-6380,9550,-9389,1411,2298,3516,551,9196,5215,-237,-4146,1682,4418,-4639,7759,9593,-9588,3041,9208,-7331,-797,-2529,7738,-2944,4351,5091,-9448,-5404,6200,-1425,-3983,678,8456,-8085,5162,7165,4692,-494,-9249,8514,521,-8835,6745,-5775,-575,1876,-5464,5053,5567,3456,5873,1965,4316,2126,9462,-59,6544,-1547,7015,-8928,-3903,-3020,5865,-9479,6723,9214,5705,5136,7725,945,-1995,-2288,4579,7103,9938,4495,-730,-3180,7717,6824,794,-894,-1439,-1641,-4577,9362,-8817,-6035,-7980,-1278,-1928,-5390,-2342,1189,-2340,4788,-1814,5927,3115,9017,6801,7884,-5719,5992,7477,-486,-2734,-1557,3169,5288,-8295,-5651,2491,-3394,8302,-8822,5638,7654,7350,9884,-5392,881,-4874,5582,8309,-8514,2682,-6081,5602,4963,3538,9558,-6401,-2641,6223,-7107,-2772,5873,78,-7934,-7641,7872,7901,7436,-3815,-1540,-3387,3558,-8030,-6637,9609,8594,83,7984,-3286,7211,5877,-8655,6700,9855,-7521,903,1024,4051,4044,4044,8650,-2932,-134,-8167,-5338,-1014,391,1913,-9914,-9100,7108,-9250,1705,5615,641,6809,6619,7782,9062,3030,603,-2528,-5493,-1237,8428,1231,6701,202,641,-5351,-5366,-3347,7659,-3953,5518,1575,-3514,999,-6631,-934,-1119,1749,-9533,-8528,-9425,-9138,-6498,-1546,-8501,7668,-8135,-6234,7236,1722,-7690,7339,-5205,698,3680,7741,-9067,8739,-7658,-2518,3967,-128,620,-4571,780,5989,-6220,-1932,6629,-733,-6978,-68,-3295,9075,-297,7648,-7645,2301,-4641,-8443,6935,-6257,7067,-9046,5474,6833,6924,8516,-213,-9210,-9605,-5798,4710,-9258,-7736,944,5194,-7465,5978,-6840,3735,4392,9218,-5571,2944,-5864,2995,-5234,5036,-4999,-9883,5493,4646,9574,3528,291,-4799,-3099,7639,5144,-2560,-7573,433,2464,-3484,4673,3283,-6459,-1194,8122,7314,-3389,-1899,8362,-1046,-1751,-2140,7642,-6274,-8056,3925,-397,1641,5762,8099,-9683,2533,1333,3295,7413,-8538,-8585,8412,1958,-8487,7248,4987,-6079,9427,-6207,-7873,688,224,6792,-4150,3345,826,1885,6463,-5269,3068,9649,-1354,3159,4975,514,-3071,-4355,-1615,9427,8343,978,7914,-1876,1160,-898,-8431,6245,8760,8514,9857,9505,-3602,-4124,-4124,209,855,-253,-7232,-7598,6813,-565,-8739,2886,3289,-4339,7846,-3820,3001,-3235,-3146,-2535,-1444,8976,-8434,8190,-4185,5847,-1020,-6020,-3935,-4267,2030,6882,-7707,-5213,5284,-2061,-325,2911,2346,1080,-2111,-4929,-9101,1548,-4817,-7526,2688,-3589,-4414,6269,-1423,-6735,-7204,-6624,-7561,7775,-2650,-6843,735,3824,4592,-5199,-1922,1757,5662,-1272,4208,400,2883,720,9179,1056,3310,-7095,-3834,-2683,4422,-2599,-6124,1449,-5001,-5874,-7396,9158,2926,4281,-9423,8492,-1542,1197,6023,-9627,4970,28,7002,5204,5292,3901,4640,2994,-4487,-2102,-4481,-5347,1164,6773,6277,5759,-4250,-3920,4843,7763,-791,8478,-7750,7243,-4640,6252,8699,2001,9799,-5555,-3183,-6124,4787,1378,-4618,3349,-5561,-2392,-1764,9774,-5698,1775,-9616,-6353,-3622,-4907,1356,5728,-1902,-3203,5268,4414,1096,-1268,-940,179,-7824,9845,6093,9096,-163,3713,-297,6100,6544,6167,6209,-5476,4519,6391,289,1823,7256,5528,9069,-4861,2571,-5339,2657,-1383,-3771,-4709,-1915,-8712,-816,2266,-8078,-2451,-6189,-5910,-8027,4915,-5900,-2979,2028,4015,-2885,8665,3121,8692,-2479,-2824,-5047,-3116,-5621,-7248,-1462,1114,-907,5481,6605,8767,-506,3412,-7848,7333,-634,3219,-3273,3031,-1867,1765,1522,-7747,-7195,-9110,6320,-3756,5207,1190,6370,-3143,6745,-2833,1926,-985,-3126,-9019,9744,-9202,8817,-3722,-2002,8111,4457,4973,4275,7125,3828,-3613,-3104,6544,6764,6585,-4240,-3961,-2756,-5445,-1143,-9788,-6964,3690,-1158,-6795,9726,7048,8414,-4774,8405,-8837,3163,-9265,877,-6371,-5901,5427,243,-8247,-2653,-2356,-1228,-3403,-9628,4430,1937,-8435,3876,-9615,-1366,-8793,2136,496,3957,-1316,822,7134,-8320,-8789,-33,1803,-2617,4625,-4334,-46,6870,-9895,-3381,-6536,7742,6356,-1725,2283,-2267,532,-3571,4288,-40,4714,2145,-8173,-9782,-2821,8418,7097,-7187,-2945,830,-1110,7886,-821,-3453,-4313,-7945,7020,-2473,-4510,4867,-1992,3770,1031,6714,9721,-1399,-5297,-3545,-767,-2432,-8088,-6801,1689,7271,673,9178,7565,8263,-213,6693,843,940,9793,7536,-1742,266,9280,-402,8335,5091,-3019,-3904,-6956,-7393,1053,9830,-403,6191,7652,-5990,-7726,741,-7996,-3664,-5601,9598,6603,3714,8336,5228,-3757,7069,-371,-9984,2625,-5485,-14,8394,7757,4705,-5743,-3141,6589,8246,7689,5709,9201,9740,-5969,-3092,-5806,-1012,-7508,-9508,-9229,-6246,-5063,-8889,-4678,-7761,-4711,3076,-2699,224} ;
        int k = 45;
        int[] t= maxSlideWindow(nums,k);
        for (int i:t)
            System.out.println(i);
    }
}
