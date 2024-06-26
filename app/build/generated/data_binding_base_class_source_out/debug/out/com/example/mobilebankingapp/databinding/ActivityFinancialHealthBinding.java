// Generated by view binder compiler. Do not edit!
package com.example.mobilebankingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mobilebankingapp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFinancialHealthBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView BriefText;

  @NonNull
  public final BarChart barChart;

  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final TextView financialStatusId;

  @NonNull
  public final TextView financilaConditonTV;

  @NonNull
  public final RelativeLayout layoutBarChart;

  @NonNull
  public final RelativeLayout main;

  @NonNull
  public final TextView pageTitleAlertTV;

  @NonNull
  public final TextView title1;

  @NonNull
  public final ImageButton toolbarBackBtn;

  @NonNull
  public final RelativeLayout toolbarRl;

  private ActivityFinancialHealthBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView BriefText, @NonNull BarChart barChart, @NonNull MaterialCardView card,
      @NonNull TextView financialStatusId, @NonNull TextView financilaConditonTV,
      @NonNull RelativeLayout layoutBarChart, @NonNull RelativeLayout main,
      @NonNull TextView pageTitleAlertTV, @NonNull TextView title1,
      @NonNull ImageButton toolbarBackBtn, @NonNull RelativeLayout toolbarRl) {
    this.rootView = rootView;
    this.BriefText = BriefText;
    this.barChart = barChart;
    this.card = card;
    this.financialStatusId = financialStatusId;
    this.financilaConditonTV = financilaConditonTV;
    this.layoutBarChart = layoutBarChart;
    this.main = main;
    this.pageTitleAlertTV = pageTitleAlertTV;
    this.title1 = title1;
    this.toolbarBackBtn = toolbarBackBtn;
    this.toolbarRl = toolbarRl;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFinancialHealthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFinancialHealthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_financial_health, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFinancialHealthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BriefText;
      TextView BriefText = ViewBindings.findChildViewById(rootView, id);
      if (BriefText == null) {
        break missingId;
      }

      id = R.id.barChart;
      BarChart barChart = ViewBindings.findChildViewById(rootView, id);
      if (barChart == null) {
        break missingId;
      }

      id = R.id.card;
      MaterialCardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.financialStatusId;
      TextView financialStatusId = ViewBindings.findChildViewById(rootView, id);
      if (financialStatusId == null) {
        break missingId;
      }

      id = R.id.financilaConditonTV;
      TextView financilaConditonTV = ViewBindings.findChildViewById(rootView, id);
      if (financilaConditonTV == null) {
        break missingId;
      }

      id = R.id.layoutBarChart;
      RelativeLayout layoutBarChart = ViewBindings.findChildViewById(rootView, id);
      if (layoutBarChart == null) {
        break missingId;
      }

      RelativeLayout main = (RelativeLayout) rootView;

      id = R.id.pageTitleAlertTV;
      TextView pageTitleAlertTV = ViewBindings.findChildViewById(rootView, id);
      if (pageTitleAlertTV == null) {
        break missingId;
      }

      id = R.id.title1;
      TextView title1 = ViewBindings.findChildViewById(rootView, id);
      if (title1 == null) {
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

      return new ActivityFinancialHealthBinding((RelativeLayout) rootView, BriefText, barChart,
          card, financialStatusId, financilaConditonTV, layoutBarChart, main, pageTitleAlertTV,
          title1, toolbarBackBtn, toolbarRl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
