// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.touchizen.drawerwithbottomnavigation.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAutocabvisitorBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button AddData;

  @NonNull
  public final EditText Time;

  @NonNull
  public final CardView autocabvisitor;

  @NonNull
  public final EditText cabDriverName;

  @NonNull
  public final EditText companyName;

  @NonNull
  public final EditText date;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final EditText mobileNumber;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final Spinner simpleSpinner;

  @NonNull
  public final Toolbar toolbarSearch;

  @NonNull
  public final TextView validTill;

  @NonNull
  public final EditText vehicleNo;

  private ActivityAutocabvisitorBinding(@NonNull RelativeLayout rootView, @NonNull Button AddData,
      @NonNull EditText Time, @NonNull CardView autocabvisitor, @NonNull EditText cabDriverName,
      @NonNull EditText companyName, @NonNull EditText date, @NonNull AppBarLayout layoutmain,
      @NonNull EditText mobileNumber, @NonNull CircleImageView profileImage,
      @NonNull Spinner simpleSpinner, @NonNull Toolbar toolbarSearch, @NonNull TextView validTill,
      @NonNull EditText vehicleNo) {
    this.rootView = rootView;
    this.AddData = AddData;
    this.Time = Time;
    this.autocabvisitor = autocabvisitor;
    this.cabDriverName = cabDriverName;
    this.companyName = companyName;
    this.date = date;
    this.layoutmain = layoutmain;
    this.mobileNumber = mobileNumber;
    this.profileImage = profileImage;
    this.simpleSpinner = simpleSpinner;
    this.toolbarSearch = toolbarSearch;
    this.validTill = validTill;
    this.vehicleNo = vehicleNo;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAutocabvisitorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAutocabvisitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_autocabvisitor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAutocabvisitorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Add_data;
      Button AddData = rootView.findViewById(id);
      if (AddData == null) {
        break missingId;
      }

      id = R.id.Time;
      EditText Time = rootView.findViewById(id);
      if (Time == null) {
        break missingId;
      }

      id = R.id.autocabvisitor;
      CardView autocabvisitor = rootView.findViewById(id);
      if (autocabvisitor == null) {
        break missingId;
      }

      id = R.id.cab_driver_name;
      EditText cabDriverName = rootView.findViewById(id);
      if (cabDriverName == null) {
        break missingId;
      }

      id = R.id.company_name;
      EditText companyName = rootView.findViewById(id);
      if (companyName == null) {
        break missingId;
      }

      id = R.id.date;
      EditText date = rootView.findViewById(id);
      if (date == null) {
        break missingId;
      }

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.mobile_number;
      EditText mobileNumber = rootView.findViewById(id);
      if (mobileNumber == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.simpleSpinner;
      Spinner simpleSpinner = rootView.findViewById(id);
      if (simpleSpinner == null) {
        break missingId;
      }

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      id = R.id.valid_till;
      TextView validTill = rootView.findViewById(id);
      if (validTill == null) {
        break missingId;
      }

      id = R.id.vehicle_no;
      EditText vehicleNo = rootView.findViewById(id);
      if (vehicleNo == null) {
        break missingId;
      }

      return new ActivityAutocabvisitorBinding((RelativeLayout) rootView, AddData, Time,
          autocabvisitor, cabDriverName, companyName, date, layoutmain, mobileNumber, profileImage,
          simpleSpinner, toolbarSearch, validTill, vehicleNo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
