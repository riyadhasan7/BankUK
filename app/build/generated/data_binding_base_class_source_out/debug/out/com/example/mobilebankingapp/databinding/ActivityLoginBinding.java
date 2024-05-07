// Generated by view binder compiler. Do not edit!
package com.example.mobilebankingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mobilebankingapp.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView LoginPageLogo;

  @NonNull
  public final EditText accNumEt;

  @NonNull
  public final TextInputLayout accNumTil;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final EditText emailEt;

  @NonNull
  public final TextInputLayout emailTil;

  @NonNull
  public final TextView forgotPasswordTv;

  @NonNull
  public final MaterialButton loginBtn;

  @NonNull
  public final TextView loginLabelTv;

  @NonNull
  public final MaterialButton noAccSignUpBtn;

  @NonNull
  public final TextView orLineTv;

  @NonNull
  public final EditText passwordEt;

  @NonNull
  public final TextInputLayout passwordTil;

  @NonNull
  public final RelativeLayout toolbarRl;

  @NonNull
  public final TextView toolbarTitleTv;

  private ActivityLoginBinding(@NonNull RelativeLayout rootView, @NonNull ImageView LoginPageLogo,
      @NonNull EditText accNumEt, @NonNull TextInputLayout accNumTil, @NonNull CardView cardView,
      @NonNull EditText emailEt, @NonNull TextInputLayout emailTil,
      @NonNull TextView forgotPasswordTv, @NonNull MaterialButton loginBtn,
      @NonNull TextView loginLabelTv, @NonNull MaterialButton noAccSignUpBtn,
      @NonNull TextView orLineTv, @NonNull EditText passwordEt,
      @NonNull TextInputLayout passwordTil, @NonNull RelativeLayout toolbarRl,
      @NonNull TextView toolbarTitleTv) {
    this.rootView = rootView;
    this.LoginPageLogo = LoginPageLogo;
    this.accNumEt = accNumEt;
    this.accNumTil = accNumTil;
    this.cardView = cardView;
    this.emailEt = emailEt;
    this.emailTil = emailTil;
    this.forgotPasswordTv = forgotPasswordTv;
    this.loginBtn = loginBtn;
    this.loginLabelTv = loginLabelTv;
    this.noAccSignUpBtn = noAccSignUpBtn;
    this.orLineTv = orLineTv;
    this.passwordEt = passwordEt;
    this.passwordTil = passwordTil;
    this.toolbarRl = toolbarRl;
    this.toolbarTitleTv = toolbarTitleTv;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LoginPageLogo;
      ImageView LoginPageLogo = ViewBindings.findChildViewById(rootView, id);
      if (LoginPageLogo == null) {
        break missingId;
      }

      id = R.id.accNumEt;
      EditText accNumEt = ViewBindings.findChildViewById(rootView, id);
      if (accNumEt == null) {
        break missingId;
      }

      id = R.id.accNumTil;
      TextInputLayout accNumTil = ViewBindings.findChildViewById(rootView, id);
      if (accNumTil == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.emailEt;
      EditText emailEt = ViewBindings.findChildViewById(rootView, id);
      if (emailEt == null) {
        break missingId;
      }

      id = R.id.emailTil;
      TextInputLayout emailTil = ViewBindings.findChildViewById(rootView, id);
      if (emailTil == null) {
        break missingId;
      }

      id = R.id.forgotPasswordTv;
      TextView forgotPasswordTv = ViewBindings.findChildViewById(rootView, id);
      if (forgotPasswordTv == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      MaterialButton loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.loginLabelTv;
      TextView loginLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (loginLabelTv == null) {
        break missingId;
      }

      id = R.id.noAccSignUpBtn;
      MaterialButton noAccSignUpBtn = ViewBindings.findChildViewById(rootView, id);
      if (noAccSignUpBtn == null) {
        break missingId;
      }

      id = R.id.orLineTv;
      TextView orLineTv = ViewBindings.findChildViewById(rootView, id);
      if (orLineTv == null) {
        break missingId;
      }

      id = R.id.passwordEt;
      EditText passwordEt = ViewBindings.findChildViewById(rootView, id);
      if (passwordEt == null) {
        break missingId;
      }

      id = R.id.passwordTil;
      TextInputLayout passwordTil = ViewBindings.findChildViewById(rootView, id);
      if (passwordTil == null) {
        break missingId;
      }

      id = R.id.toolbarRl;
      RelativeLayout toolbarRl = ViewBindings.findChildViewById(rootView, id);
      if (toolbarRl == null) {
        break missingId;
      }

      id = R.id.toolbarTitleTv;
      TextView toolbarTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTitleTv == null) {
        break missingId;
      }

      return new ActivityLoginBinding((RelativeLayout) rootView, LoginPageLogo, accNumEt, accNumTil,
          cardView, emailEt, emailTil, forgotPasswordTv, loginBtn, loginLabelTv, noAccSignUpBtn,
          orLineTv, passwordEt, passwordTil, toolbarRl, toolbarTitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}