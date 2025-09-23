class Solution {
    public int compareVersion(String version1, String version2) {
        String ar1[]=version1.split("\\.");
        String ar2[]=version2.split("\\.");
        // System.out.println(Arrays.toString(version1.split(".")));
        // System.out.println(Arrays.toString(ar2));
        int i=0,j=0;
        while(i<ar1.length && j<ar2.length)
        {
            int v1=Integer.parseInt(ar1[i]);
            int v2=Integer.parseInt(ar2[j]);
            // System.out.println(v1+" "+v2);
            if(v1<v2)
            return -1;
            if(v1>v2)
            return 1;
            i+=1;
            j+=1;
        }
        if(i<ar1.length)
        {
            while(i<ar1.length)
            {
                int v1=Integer.parseInt(ar1[i]);
                if(v1>0)
                return 1;
                i+=1;
            }
        }
        if(j<ar2.length)
        {
            while(j<ar2.length)
            {
                int v1=Integer.parseInt(ar2[j]);
                if(v1>0)
                return -1;
                j+=1;
            }
        }
        return 0;
    }
}