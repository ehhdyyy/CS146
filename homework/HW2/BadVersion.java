package homework.HW2;

public class BadVersion{

    public int firstBadVersion(int n){
        
        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isBadVersion(mid) == true && isBadVersion(mid - 1) == false){
                return mid;
            }
            else if (isBadVersion(mid) == true){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }


}