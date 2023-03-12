package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.logomaster.logomaker.R;

/* loaded from: classes3.dex */
public abstract class ActivityLogoShowBigImageBinding extends ViewDataBinding {
    @NonNull
    public final ImageView ivBigImage;
    @NonNull
    public final LinearLayout llMain;
    @NonNull
    public final RelativeLayout rlBack;
    @NonNull
    public final RelativeLayout rlSelectItem;
    @NonNull
    public final View statusView;
    @NonNull
    public final Toolbar toolbar;

    public ActivityLogoShowBigImageBinding(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, View view2, Toolbar toolbar) {
        super(obj, view, i);
        this.ivBigImage = imageView;
        this.llMain = linearLayout;
        this.rlBack = relativeLayout;
        this.rlSelectItem = relativeLayout2;
        this.statusView = view2;
        this.toolbar = toolbar;
    }

    public static ActivityLogoShowBigImageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityLogoShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityLogoShowBigImageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityLogoShowBigImageBinding) ViewDataBinding.bind(obj, view, R.layout.activity_logo_show_big_image);
    }

    @NonNull
    @Deprecated
    public static ActivityLogoShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityLogoShowBigImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_show_big_image, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityLogoShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityLogoShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityLogoShowBigImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_show_big_image, null, false, obj);
    }
}
