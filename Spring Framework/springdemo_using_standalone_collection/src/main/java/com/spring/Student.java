package com.spring;
import java.util.*;
public class Student {
    private List<String> friend;
    private Set<String> mobielNumber;
    private Map<String,String> cources;
    private Properties qualification;
    public List<String> getFriend() {
        return friend;
    }
    public void setFriend(List<String> friend) {
        this.friend = friend;
    }
    public Set<String> getMobielNumber() {
        return mobielNumber;
    }
    public void setMobielNumber(Set<String> mobielNumber) {
        this.mobielNumber = mobielNumber;
    }
    public Map<String, String> getCources() {
        return cources;
    }
    public void setCources(Map<String, String> cources) {
        this.cources = cources;
    }
    public Properties getQualification() {
        return qualification;
    }
    public void setQualification(Properties qualification) {
        this.qualification = qualification;
    }
    @Override
    public String toString() {
        return "Student [friend=" + friend + ", mobielNumber=" + mobielNumber + ", cources=" + cources
                + ", qualification=" + qualification + "]";
    }

    

}
