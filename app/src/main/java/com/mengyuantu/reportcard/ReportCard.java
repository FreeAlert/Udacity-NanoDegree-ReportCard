package com.mengyuantu.reportcard;

/**
 * Created by mengyuan on 9/29/16.
 */
public class ReportCard {
    private String mSubjectName;
    private String mGrade;
    public ReportCard(String SubjectName, String Grade)
    {
        mSubjectName = SubjectName;
        mGrade = Grade;

    }
    public String getSubjectName() {
        return mSubjectName;
    }
    public String getGrade(){
        return mGrade;
    }
    @Override
    public String toString() {
        return "You got " + mGrade+ "\n in "+ mSubjectName ;
    }
}
