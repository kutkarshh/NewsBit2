// Generated by view binder compiler. Do not edit!
package com.example.android.newsbit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.android.newsbit.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout buttonLl;

  @NonNull
  public final LinearLayout googleLoginBtn;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ImageView logoImg;

  @NonNull
  public final TextView otpMsg;

  @NonNull
  public final Button otpResend;

  @NonNull
  public final TextInputLayout otpTextView;

  @NonNull
  public final TextInputEditText otpTxtNum;

  @NonNull
  public final TextInputLayout phoneNum;

  @NonNull
  public final TextInputEditText phoneNum1;

  @NonNull
  public final TextView txtSlogan;

  @NonNull
  public final TextView txtSlogan2;

  @NonNull
  public final AppCompatButton verifyBtn;

  @NonNull
  public final Button verifyOTPBtn;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout buttonLl,
      @NonNull LinearLayout googleLoginBtn, @NonNull LinearLayout linearLayout,
      @NonNull ImageView logoImg, @NonNull TextView otpMsg, @NonNull Button otpResend,
      @NonNull TextInputLayout otpTextView, @NonNull TextInputEditText otpTxtNum,
      @NonNull TextInputLayout phoneNum, @NonNull TextInputEditText phoneNum1,
      @NonNull TextView txtSlogan, @NonNull TextView txtSlogan2, @NonNull AppCompatButton verifyBtn,
      @NonNull Button verifyOTPBtn) {
    this.rootView = rootView;
    this.buttonLl = buttonLl;
    this.googleLoginBtn = googleLoginBtn;
    this.linearLayout = linearLayout;
    this.logoImg = logoImg;
    this.otpMsg = otpMsg;
    this.otpResend = otpResend;
    this.otpTextView = otpTextView;
    this.otpTxtNum = otpTxtNum;
    this.phoneNum = phoneNum;
    this.phoneNum1 = phoneNum1;
    this.txtSlogan = txtSlogan;
    this.txtSlogan2 = txtSlogan2;
    this.verifyBtn = verifyBtn;
    this.verifyOTPBtn = verifyOTPBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_ll;
      LinearLayout buttonLl = rootView.findViewById(id);
      if (buttonLl == null) {
        break missingId;
      }

      id = R.id.google_login_btn;
      LinearLayout googleLoginBtn = rootView.findViewById(id);
      if (googleLoginBtn == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = rootView.findViewById(id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.logo_img;
      ImageView logoImg = rootView.findViewById(id);
      if (logoImg == null) {
        break missingId;
      }

      id = R.id.otp_msg;
      TextView otpMsg = rootView.findViewById(id);
      if (otpMsg == null) {
        break missingId;
      }

      id = R.id.otp_resend;
      Button otpResend = rootView.findViewById(id);
      if (otpResend == null) {
        break missingId;
      }

      id = R.id.otp_textView;
      TextInputLayout otpTextView = rootView.findViewById(id);
      if (otpTextView == null) {
        break missingId;
      }

      id = R.id.otp_txtNum;
      TextInputEditText otpTxtNum = rootView.findViewById(id);
      if (otpTxtNum == null) {
        break missingId;
      }

      id = R.id.phone_num;
      TextInputLayout phoneNum = rootView.findViewById(id);
      if (phoneNum == null) {
        break missingId;
      }

      id = R.id.phoneNum;
      TextInputEditText phoneNum1 = rootView.findViewById(id);
      if (phoneNum1 == null) {
        break missingId;
      }

      id = R.id.txtSlogan;
      TextView txtSlogan = rootView.findViewById(id);
      if (txtSlogan == null) {
        break missingId;
      }

      id = R.id.txtSlogan2;
      TextView txtSlogan2 = rootView.findViewById(id);
      if (txtSlogan2 == null) {
        break missingId;
      }

      id = R.id.verifyBtn;
      AppCompatButton verifyBtn = rootView.findViewById(id);
      if (verifyBtn == null) {
        break missingId;
      }

      id = R.id.verifyOTPBtn;
      Button verifyOTPBtn = rootView.findViewById(id);
      if (verifyOTPBtn == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, buttonLl, googleLoginBtn,
          linearLayout, logoImg, otpMsg, otpResend, otpTextView, otpTxtNum, phoneNum, phoneNum1,
          txtSlogan, txtSlogan2, verifyBtn, verifyOTPBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}