// Generated by view binder compiler. Do not edit!
package com.example.android.newsbit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.android.newsbit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBookmarkBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout bookmarkNotfound;

  @NonNull
  public final RecyclerView bookmarkedNewsItemView;

  @NonNull
  public final ImageView imageView;

  private FragmentBookmarkBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout bookmarkNotfound, @NonNull RecyclerView bookmarkedNewsItemView,
      @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.bookmarkNotfound = bookmarkNotfound;
    this.bookmarkedNewsItemView = bookmarkedNewsItemView;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBookmarkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBookmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_bookmark, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBookmarkBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookmark_notfound;
      ConstraintLayout bookmarkNotfound = rootView.findViewById(id);
      if (bookmarkNotfound == null) {
        break missingId;
      }

      id = R.id.bookmarkedNewsItemView;
      RecyclerView bookmarkedNewsItemView = rootView.findViewById(id);
      if (bookmarkedNewsItemView == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      return new FragmentBookmarkBinding((ConstraintLayout) rootView, bookmarkNotfound,
          bookmarkedNewsItemView, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
