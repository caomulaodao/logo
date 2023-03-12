package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;

/* loaded from: classes3.dex */
public abstract class ActivityLogoMyLogoBinding extends ViewDataBinding {
    @NonNull
    public final ImageView ivDelete;
    @NonNull
    public final ImageView ivNoData;
    @NonNull
    public final ImageView ivSelect;
    @NonNull
    public final RelativeLayout rlBack;
    @NonNull
    public final RelativeLayout rlDelete;
    @NonNull
    public final RelativeLayout rlFragment;
    @NonNull
    public final RelativeLayout rlSelectAll;
    @NonNull
    public final RelativeLayout rlSelectItem;
    @NonNull
    public final RecyclerView rvMyLogo;
    @NonNull
    public final View statusView;
    @NonNull
    public final Toolbar toolbar;

    public ActivityLogoMyLogoBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RecyclerView recyclerView, View view2, Toolbar toolbar) {
        super(obj, view, i);
        this.ivDelete = imageView;
        this.ivNoData = imageView2;
        this.ivSelect = imageView3;
        this.rlBack = relativeLayout;
        this.rlDelete = relativeLayout2;
        this.rlFragment = relativeLayout3;
        this.rlSelectAll = relativeLayout4;
        this.rlSelectItem = relativeLayout5;
        this.rvMyLogo = recyclerView;
        this.statusView = view2;
        this.toolbar = toolbar;
    }

    public static ActivityLogoMyLogoBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityLogoMyLogoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityLogoMyLogoBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityLogoMyLogoBinding) ViewDataBinding.bind(obj, view, R.layout.activity_logo_my_logo);
    }

    @NonNull
    @Deprecated
    public static ActivityLogoMyLogoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityLogoMyLogoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_my_logo, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityLogoMyLogoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityLogoMyLogoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityLogoMyLogoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_my_logo, null, false, obj);
    }
}
