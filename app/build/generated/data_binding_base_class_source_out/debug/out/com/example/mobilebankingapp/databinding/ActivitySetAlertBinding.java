// Generated by view binder compiler. Do not edit!
package com.example.mobilebankingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mobilebankingapp.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySetAlertBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView MonthlyEpensesLimitCatagoriesTV;

  @NonNull
  public final TextView MonthlyEpensesLimitTV;

  @NonNull
  public final TextInputLayout MontlyCategoryExpenseIT;

  @NonNull
  public final TextInputLayout MontlyExpenseIT;

  @NonNull
  public final AutoCompleteTextView categorySetAlert;

  @NonNull
  public final TextInputLayout ddbCategory;

  @NonNull
  public final RelativeLayout main;

  @NonNull
  public final EditText monthyCategoryExpensesLimitET;

  @NonNull
  public final EditText monthyExpensesLimitET;

  @NonNull
  public final TextView pageTitleAlertTV;

  @NonNull
  public final Button saveAlertBtn;

  @NonNull
  public final ImageButton toolbarBackBtn;

  @NonNull
  public final RelativeLayout toolbarRl;

  private ActivitySetAlertBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView MonthlyEpensesLimitCatagoriesTV, @NonNull TextView MonthlyEpensesLimitTV,
      @NonNull TextInputLayout MontlyCategoryExpenseIT, @NonNull TextInputLayout MontlyExpenseIT,
      @NonNull AutoCompleteTextView categorySetAlert, @NonNull TextInputLayout ddbCategory,
      @NonNull RelativeLayout main, @NonNull EditText monthyCategoryExpensesLimitET,
      @NonNull EditText monthyExpensesLimitET, @NonNull TextView pageTitleAlertTV,
      @NonNull Button saveAlertBtn, @NonNull ImageButton toolbarBackBtn,
      @NonNull RelativeLayout toolbarRl) {
    this.rootView = rootView;
    this.MonthlyEpensesLimitCatagoriesTV = MonthlyEpensesLimitCatagoriesTV;
    this.MonthlyEpensesLimitTV = MonthlyEpensesLimitTV;
    this.MontlyCategoryExpenseIT = MontlyCategoryExpenseIT;
    this.MontlyExpenseIT = MontlyExpenseIT;
    this.categorySetAlert = categorySetAlert;
    this.ddbCategory = ddbCategory;
    this.main = main;
    this.monthyCategoryExpensesLimitET = monthyCategoryExpensesLimitET;
    this.monthyExpensesLimitET = monthyExpensesLimitET;
    this.pageTitleAlertTV = pageTitleAlertTV;
    this.saveAlertBtn = saveAlertBtn;
    this.toolbarBackBtn = toolbarBackBtn;
    this.toolbarRl = toolbarRl;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySetAlertBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySetAlertBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_set_alert, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySetAlertBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.MonthlyEpensesLimitCatagoriesTV;
      TextView MonthlyEpensesLimitCatagoriesTV = ViewBindings.findChildViewById(rootView, id);
      if (MonthlyEpensesLimitCatagoriesTV == null) {
        break missingId;
      }

      id = R.id.MonthlyEpensesLimitTV;
      TextView MonthlyEpensesLimitTV = ViewBindings.findChildViewById(rootView, id);
      if (MonthlyEpensesLimitTV == null) {
        break missingId;
      }

      id = R.id.MontlyCategoryExpenseIT;
      TextInputLayout MontlyCategoryExpenseIT = ViewBindings.findChildViewById(rootView, id);
      if (MontlyCategoryExpenseIT == null) {
        break missingId;
      }

      id = R.id.MontlyExpenseIT;
      TextInputLayout MontlyExpenseIT = ViewBindings.findChildViewById(rootView, id);
      if (MontlyExpenseIT == null) {
        break missingId;
      }

      id = R.id.categorySetAlert;
      AutoCompleteTextView categorySetAlert = ViewBindings.findChildViewById(rootView, id);
      if (categorySetAlert == null) {
        break missingId;
      }

      id = R.id.ddbCategory;
      TextInputLayout ddbCategory = ViewBindings.findChildViewById(rootView, id);
      if (ddbCategory == null) {
        break missingId;
      }

      RelativeLayout main = (RelativeLayout) rootView;

      id = R.id.monthyCategoryExpensesLimitET;
      EditText monthyCategoryExpensesLimitET = ViewBindings.findChildViewById(rootView, id);
      if (monthyCategoryExpensesLimitET == null) {
        break missingId;
      }

      id = R.id.monthyExpensesLimitET;
      EditText monthyExpensesLimitET = ViewBindings.findChildViewById(rootView, id);
      if (monthyExpensesLimitET == null) {
        break missingId;
      }

      id = R.id.pageTitleAlertTV;
      TextView pageTitleAlertTV = ViewBindings.findChildViewById(rootView, id);
      if (pageTitleAlertTV == null) {
        break missingId;
      }

      id = R.id.saveAlertBtn;
      Button saveAlertBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveAlertBtn == null) {
        break missingId;
      }

      id = R.id.toolbarBackBtn;
      ImageButton toolbarBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (toolbarBackBtn == null) {
        break missingId;
      }

      id = R.id.toolbarRl;
      RelativeLayout toolbarRl = ViewBindings.findChildViewById(rootView, id);
      if (toolbarRl == null) {
        break missingId;
      }

      return new ActivitySetAlertBinding((RelativeLayout) rootView, MonthlyEpensesLimitCatagoriesTV,
          MonthlyEpensesLimitTV, MontlyCategoryExpenseIT, MontlyExpenseIT, categorySetAlert,
          ddbCategory, main, monthyCategoryExpensesLimitET, monthyExpensesLimitET, pageTitleAlertTV,
          saveAlertBtn, toolbarBackBtn, toolbarRl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
