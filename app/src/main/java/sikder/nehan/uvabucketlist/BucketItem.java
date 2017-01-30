package sikder.nehan.uvabucketlist;

import java.util.ArrayList;
import java.util.Date;

public class BucketItem {
    private String mName, mDescription;
    private double mLatitude, mLongitude;
    private boolean mCompleted;
    private Date mCreatedDate;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public boolean isCompleted() {
        return mCompleted;
    }

    public void setCompleted(boolean completed) {
        mCompleted = completed;
    }

    public BucketItem(String name){
        mName = name;
        mDescription = "";
        mLatitude = 0.0;
        mLongitude = 0.0;
        mCompleted = false;
        mCreatedDate = new Date();
    }

    public static ArrayList createInitialBucketList(){
        ArrayList<BucketItem> list = new ArrayList<BucketItem>();
        list.add(new BucketItem("Register for graduation"));
        list.add(new BucketItem("Finish CS 4720"));
        return list;
    }
//    Need to implement compare to method

}
