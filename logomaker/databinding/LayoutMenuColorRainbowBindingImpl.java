package com.logomaster.logomaker.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import com.logomaster.logomaker.view.LogoColorSaturationView;
import com.logomaster.logomaker.view.LogoRainbowView;

/* loaded from: classes3.dex */
public class LayoutMenuColorRainbowBindingImpl extends LayoutMenuColorRainbowBinding {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener etCurrentColorandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: com.logomaster.logomaker.databinding.LayoutMenuColorRainbowBindingImpl$a */
    /* loaded from: classes3.dex */
    public class C9655a implements InverseBindingListener {
        public C9655a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(LayoutMenuColorRainbowBindingImpl.this.etCurrentColor);
            LogoCreateVM logoCreateVM = LayoutMenuColorRainbowBindingImpl.this.mViewModel;
            if (logoCreateVM != null) {
                MutableLiveData<String> currentColor = logoCreateVM.getCurrentColor();
                if (currentColor != null) {
                    currentColor.setValue(textString);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_cancel, 2);
        sparseIntArray.put(R.id.iv_done, 3);
        sparseIntArray.put(R.id.lrv_color, 4);
        sparseIntArray.put(R.id.lcsv_color, 5);
    }

    public LayoutMenuColorRainbowBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelCurrentColor(MutableLiveData<String> mutableLiveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            com.logomaster.logomaker.vm.LogoCreateVM r4 = r8.mViewModel
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L19
            androidx.lifecycle.MutableLiveData r4 = r4.getCurrentColor()
            goto L1a
        L19:
            r4 = r6
        L1a:
            r7 = 0
            r8.updateLiveDataRegistration(r7, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            goto L28
        L27:
            r4 = r6
        L28:
            if (r5 == 0) goto L2f
            android.widget.EditText r5 = r8.etCurrentColor
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r4)
        L2f:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3d
            android.widget.EditText r0 = r8.etCurrentColor
            androidx.databinding.InverseBindingListener r1 = r8.etCurrentColorandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r0, r6, r6, r6, r1)
        L3d:
            return
        L3e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.databinding.LayoutMenuColorRainbowBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeViewModelCurrentColor((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 == i) {
            setViewModel((LogoCreateVM) obj);
            return true;
        }
        return false;
    }

    @Override // com.logomaster.logomaker.databinding.LayoutMenuColorRainbowBinding
    public void setViewModel(@Nullable LogoCreateVM logoCreateVM) {
        this.mViewModel = logoCreateVM;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    private LayoutMenuColorRainbowBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (CardView) objArr[0], (EditText) objArr[1], (ImageView) objArr[2], (ImageView) objArr[3], (LogoColorSaturationView) objArr[5], (LogoRainbowView) objArr[4]);
        this.etCurrentColorandroidTextAttrChanged = new C9655a();
        this.mDirtyFlags = -1L;
        this.cvImage.setTag(null);
        this.etCurrentColor.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
