package com.mengyuantu.reportcard;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mengyuan on 9/29/16.
 */
public class ReportCardAdapter extends ArrayAdapter<ReportCard> {
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> reportCard) {
        super(context, 0, reportCard);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        ReportCard currentReportCard = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.subject_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        subjectTextView.setText(currentReportCard.getSubjectName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.subject_grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        gradeTextView.setText(currentReportCard.getGrade());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
