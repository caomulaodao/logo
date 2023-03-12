package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.logomaster.logomaker.R;

/* loaded from: classes3.dex */
public abstract class ActivityLogoSaveSuccessBinding extends ViewDataBinding {
    @NonNull
    public final ImageView ivContent;
    @NonNull
    public final ImageView ivShare;
    @NonNull
    public final RelativeLayout rlBack;
    @NonNull
    public final RelativeLayout rlSelectItem;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final TextView tvMakeNew;

    public ActivityLogoSaveSuccessBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, Toolbar toolbar, TextView textView) {
        super(obj, view, i);
        this.ivContent = imageView;
        this.ivShare = imageView2;
        this.rlBack = relativeLayout;
        this.rlSelectItem = relativeLayout2;
        this.toolbar = toolbar;
        this.tvMakeNew = textView;
    }

    public static ActivityLogoSaveSuccessBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityLogoSaveSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityLogoSaveSuccessBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityLogoSaveSuccessBinding) ViewDataBinding.bind(obj, view, R.layout.activity_logo_save_success);
    }

    @NonNull
    @Deprecated
    public static ActivityLogoSaveSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityLogoSaveSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_save_success, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityLogoSaveSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityLogoSaveSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityLogoSaveSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_save_success, null, false, obj);
    }
}
