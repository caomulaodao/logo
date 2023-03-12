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
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;

/* loaded from: classes3.dex */
public abstract class ActivityLogoMyDesignBinding extends ViewDataBinding {
    @NonNull
    public final CardView cvMenu;
    @NonNull
    public final ImageView ivDelete;
    @NonNull
    public final ImageView ivNoData;
    @NonNull
    public final ImageView ivSelect;
    @NonNull
    public final LinearLayout llBlank;
    @NonNull
    public final LinearLayout llDelete;
    @NonNull
    public final LinearLayout llDuplicate;
    @NonNull
    public final LinearLayout llEdit;
    @NonNull
    public final LinearLayout llMenu;
    @NonNull
    public final LinearLayout llRename;
    @NonNull
    public final RelativeLayout rlBack;
    @NonNull
    public final RelativeLayout rlDelete;
    @NonNull
    public final RelativeLayout rlSelectAll;
    @NonNull
    public final RelativeLayout rlSelectItem;
    @NonNull
    public final RecyclerView rvMyDesign;
    @NonNull
    public final View statusView;
    @NonNull
    public final Toolbar toolbar;

    public ActivityLogoMyDesignBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RecyclerView recyclerView, View view2, Toolbar toolbar) {
        super(obj, view, i);
        this.cvMenu = cardView;
        this.ivDelete = imageView;
        this.ivNoData = imageView2;
        this.ivSelect = imageView3;
        this.llBlank = linearLayout;
        this.llDelete = linearLayout2;
        this.llDuplicate = linearLayout3;
        this.llEdit = linearLayout4;
        this.llMenu = linearLayout5;
        this.llRename = linearLayout6;
        this.rlBack = relativeLayout;
        this.rlDelete = relativeLayout2;
        this.rlSelectAll = relativeLayout3;
        this.rlSelectItem = relativeLayout4;
        this.rvMyDesign = recyclerView;
        this.statusView = view2;
        this.toolbar = toolbar;
    }

    public static ActivityLogoMyDesignBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityLogoMyDesignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityLogoMyDesignBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityLogoMyDesignBinding) ViewDataBinding.bind(obj, view, R.layout.activity_logo_my_design);
    }

    @NonNull
    @Deprecated
    public static ActivityLogoMyDesignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityLogoMyDesignBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_my_design, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityLogoMyDesignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityLogoMyDesignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityLogoMyDesignBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_my_design, null, false, obj);
    }
}
