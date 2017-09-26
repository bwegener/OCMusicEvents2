package edu.orangecoastcollege.cs273.ocmusicevents2;

/**
 * The MusicEvent class is a place holder for data corresponding to music events
 * occurring within Orange County, including title, date, day, time, location,
 * address and a corresponding image.
 *
 * @author Michael Paulding
 * @version 1.0
 */
public class MusicEvent {

    private String mTitle;
    private String mDate;
    private String mDay;
    private String mTime;
    private String mLocation;
    private String mAddress1;
    private String mAddress2;
    private String mImageName;

    /**
     * Gets the title of the artist
     * @return the title of the artist
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Sets the title of the artist
     * @param title sets the title of the artist
     */
    public void setTitle(String title) {
        mTitle = title;
    }

    /**
     * Gets the date of the concert
     * @return the date of the concert
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Sets the date of the concert
     * @param date sets the date of the concert
     */
    public void setDate(String date) {
        mDate = date;
    }

    /**
     * Gets the day of the concert
     * @return the day of the concert
     */
    public String getDay() {
        return mDay;
    }

    /**
     * Sets the day of the concert
     * @param day sets the day of the concert
     */
    public void setDay(String day) {
        mDay = day;
    }

    /**
     * Gets the time of the concert
     * @return the time of the concert
     */
    public String getTime() {
        return mTime;
    }

    /**
     * Sets the time of the concert
     * @param time sets the time of the concert
     */
    public void setTime(String time) {
        mTime = time;
    }

    /**
     * Gets the location of the concert
     * @return the location of the concert
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Sets the location of the concert
     * @param location sets the location of the concert
     */
    public void setLocation(String location) {
        mLocation = location;
    }

    /**
     * Gets the first line of the address of the concert
     * @return the first line of the address of the concert
     */
    public String getAddress1() {
        return mAddress1;
    }

    /**
     * Sets the first line of the address of the concert
     * @param address1 sets the first line of the address of the concert
     */
    public void setAddress1(String address1) {
        mAddress1 = address1;
    }

    /**
     * Gets the second line of the address of the concert
     * @return the second line of the address of the concert
     */
    public String getAddress2() {
        return mAddress2;
    }

    /**
     * Sets the second line of the address of the concert
     * @param address2 sets the second line of the address of the concert
     */
    public void setAddress2(String address2) {
        mAddress2 = address2;
    }

    /**
     * Gets the image name of the band that is playing the concert
     * @return the image name of the band
     */
    public String getImageName() {
        return mImageName;
    }

    /**
     * Sets the image name of the band playing the concert
     * @param imageName the image name of the band playing the concert
     */
    public void setImageName(String imageName) {
        mImageName = imageName;
    }
}
