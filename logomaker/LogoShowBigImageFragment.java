package com.logomaster.logomaker;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bumptech.glide.Glide;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoShowBigImageFragment extends Fragment {
    private ImageView ivShowBigImage;
    private File logoFile;
    private Uri uri;
    public double abc1000 = 0.3132596426792785d;
    public int[] abc0 = new int[18];
    public int[] abc1001 = new int[13];
    public float abc1002 = 0.7673719f;
    public String[] abc1 = new String[15];
    public float abc1003 = 0.81561625f;
    public ArrayList<String> abc1004 = new ArrayList<>();
    public String[] abc2 = new String[16];
    public ArrayList<Integer> abc1005 = new ArrayList<>();

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[7] = 0;
        }
        ArrayList<String> arrayList = this.abc1004;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1004.remove(0);
        }
        ArrayList<String> arrayList2 = this.abc1004;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc0 != null) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.abc0;
                if (i >= iArr2.length) {
                    break;
                }
                iArr2[i] = 2;
                ArrayList<String> arrayList3 = this.abc1004;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    this.abc1004.remove(0);
                }
                this.abc1000 = Math.abs(this.abc1000);
                int[] iArr3 = this.abc1001;
                if (iArr3 != null) {
                    iArr3[1] = 0;
                }
                i++;
            }
            this.abc1002 += 0.60310286f;
            if (this.abc1001 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr4 = this.abc1001;
                    if (i2 >= (iArr4.length <= 3 ? iArr4.length : 3)) {
                        break;
                    }
                    iArr4[i2] = 5;
                    i2++;
                }
            }
            this.abc1000 = -this.abc1000;
        }
        if (this.abc1000 > 0.30566258743447683d) {
            this.abc1000 = 0.9174901455593844d;
        }
        this.abc1000 -= 0.21629048091022562d;
        if (this.abc1005.size() < 8) {
            this.abc1005.add(8);
        }
        requireActivity().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.logomaster.logomaker.LogoShowBigImageFragment.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                LogoShowBigImageFragment logoShowBigImageFragment;
                event.getTargetState();
                Lifecycle.State state = Lifecycle.State.CREATED;
                ArrayList<String> arrayList4 = LogoShowBigImageFragment.this.abc1004;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoShowBigImageFragment.this.abc1004.remove(0);
                }
                LogoShowBigImageFragment logoShowBigImageFragment2 = LogoShowBigImageFragment.this;
                if (logoShowBigImageFragment2.abc1004 == null) {
                    logoShowBigImageFragment2.abc1004 = new ArrayList<>();
                }
                if (LogoShowBigImageFragment.this.abc1005.size() > 9) {
                    LogoShowBigImageFragment.this.abc1005.add(3);
                }
                if (LogoShowBigImageFragment.this.abc1 != null) {
                    int i3 = 0;
                    while (true) {
                        logoShowBigImageFragment = LogoShowBigImageFragment.this;
                        String[] strArr = logoShowBigImageFragment.abc1;
                        if (i3 >= strArr.length) {
                            break;
                        }
                        strArr[i3] = "string" + i3;
                        ArrayList<Integer> arrayList5 = LogoShowBigImageFragment.this.abc1005;
                        if (arrayList5 == null && arrayList5.size() > 0) {
                            LogoShowBigImageFragment.this.abc1005.remove(0);
                        }
                        LogoShowBigImageFragment logoShowBigImageFragment3 = LogoShowBigImageFragment.this;
                        if (logoShowBigImageFragment3.abc1001 == null) {
                            logoShowBigImageFragment3.abc1001 = new int[10];
                        }
                        logoShowBigImageFragment3.abc1002 = ((double) logoShowBigImageFragment3.abc1002) > 0.46278042d ? 0.38565654f : 0.26754832f;
                        i3++;
                    }
                    logoShowBigImageFragment.abc1000 = logoShowBigImageFragment.abc1000 > 0.6788049850269242d ? 0.6255039995935481d : 0.07561460699936862d;
                    logoShowBigImageFragment.abc1003 = 0.16057694f;
                    logoShowBigImageFragment.abc1002 = 0.64860386f;
                }
                LogoShowBigImageFragment logoShowBigImageFragment4 = LogoShowBigImageFragment.this;
                float f = logoShowBigImageFragment4.abc1003 * 0.77344483f;
                logoShowBigImageFragment4.abc1003 = f;
                if (f > 0.18854189d) {
                    logoShowBigImageFragment4.abc1003 = 0.16660345f;
                }
                if (logoShowBigImageFragment4.abc1004 == null) {
                    logoShowBigImageFragment4.abc1004 = new ArrayList<>();
                }
            }
        });
        int[] iArr5 = this.abc1001;
        if (iArr5 != null) {
            iArr5[1] = 4;
        }
        this.abc1002 = 0.6051458f;
        ArrayList<Integer> arrayList4 = this.abc1005;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc1005.remove(0);
        }
        String[] strArr = this.abc1;
        if (strArr != null) {
            strArr[8] = null;
            if (this.abc1005.size() < 4) {
                this.abc1005.add(7);
            }
            this.abc1003 = 0.91904926f;
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
        }
        int[] iArr6 = this.abc1001;
        if (iArr6 != null) {
            iArr6[0] = 7;
        }
        ArrayList<String> arrayList5 = this.abc1004;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1002 < 0.43003416d) {
            this.abc1002 = 0.39010906f;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_logo_show_big_image, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.abc1002 = ((double) this.abc1002) < 0.6049994d ? 0.31929094f : 0.2502001f;
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[4] = 0;
        }
        if (iArr != null) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.abc1001;
                if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i] = 8;
                i++;
            }
        }
        String[] strArr = this.abc2;
        if (strArr != null) {
            strArr[5] = null;
            this.abc1000 = -(this.abc1000 - 0.25499808030094984d);
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
        }
        ArrayList<Integer> arrayList = this.abc1005;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1005.remove(0);
        }
        this.abc1002 -= 0.8447516f;
        if (this.abc1005.size() > 4) {
            this.abc1005.add(0);
        }
        setImage();
        if (this.abc1005.size() > 4) {
            this.abc1005.add(3);
        }
        int[] iArr3 = this.abc1001;
        if (iArr3 != null) {
            iArr3[6] = 4;
        }
        if (this.abc1004.size() < 7) {
            this.abc1004.add("wel");
        }
        if (this.abc0 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr4 = this.abc0;
                if (i2 >= iArr4.length) {
                    break;
                }
                iArr4[i2] = 9;
                this.abc1003 -= 0.19803888f;
                if (this.abc1004.size() < 0) {
                    this.abc1004.add("' ho");
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new int[10];
                }
                i2++;
            }
            ArrayList<Integer> arrayList2 = this.abc1005;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1005.remove(0);
            }
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            int[] iArr5 = this.abc1001;
            if (iArr5 != null) {
                iArr5[7] = 1;
            }
        }
        if (this.abc1003 > 0.5480715d) {
            this.abc1003 = 0.88355565f;
        }
        this.abc1003 -= 0.69465196f;
        int[] iArr6 = this.abc1001;
        if (iArr6 != null) {
            iArr6[5] = 0;
        }
    }

    public void setImage() {
        if (this.ivShowBigImage == null) {
            this.ivShowBigImage = (ImageView) getView().findViewById(R.id.iv_big_image);
            if (this.abc1005.size() < 8) {
                this.abc1005.add(1);
            }
            if (this.abc1005.size() < 4) {
                this.abc1005.add(5);
            }
            int[] iArr = this.abc1001;
            if (iArr != null) {
                iArr[1] = 0;
            }
            String[] strArr = this.abc2;
            if (strArr != null) {
                strArr[8] = "e.M";
                this.abc1003 = -this.abc1003;
                ArrayList<String> arrayList = this.abc1004;
                if (arrayList != null && arrayList.size() > 0) {
                    this.abc1004.remove(0);
                }
                ArrayList<String> arrayList2 = this.abc1004;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.abc1004.remove(0);
                }
            }
            if (this.abc1003 > 0.33115023d) {
                this.abc1003 = 0.9269334f;
            }
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            this.abc1000 = 0.4512041948170058d;
        }
        this.abc1003 = 0.10399866f;
        float f = ((double) 0.10399866f) > 0.20105904d ? 0.90843225f : 0.64830816f;
        this.abc1003 = f;
        if (this.abc1000 > 0.6860490457743942d) {
            this.abc1000 = 0.3179879356955241d;
        }
        if (this.abc0 == null) {
            this.abc0 = new int[10];
            if (f < 0.341514d) {
                this.abc1003 = 0.658713f;
            }
            this.abc1000 = -this.abc1000;
            if (this.abc1003 > 0.7304159d) {
                this.abc1003 = 0.5615368f;
            }
        }
        int[] iArr2 = this.abc1001;
        if (iArr2 != null) {
            iArr2[1] = 6;
        }
        if (iArr2 != null) {
            iArr2[6] = 8;
        }
        this.abc1002 = 0.043200314f;
        if (this.logoFile == null) {
            Glide.m18504u(this).m1887p(this.uri).m2170p0(this.ivShowBigImage);
            this.abc1003 = 0.9337611f;
            this.abc1000 -= 0.47270529420727603d;
            ArrayList<Integer> arrayList3 = this.abc1005;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1005.remove(0);
            }
            if (this.abc0 != null) {
                int i = 0;
                while (true) {
                    int[] iArr3 = this.abc0;
                    if (i >= iArr3.length) {
                        break;
                    }
                    iArr3[i] = 9;
                    this.abc1000 = 0.46685104034900815d;
                    ArrayList<String> arrayList4 = this.abc1004;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        this.abc1004.remove(0);
                    }
                    if (this.abc1005 == null) {
                        this.abc1005 = new ArrayList<>();
                    }
                    i++;
                }
                this.abc1003 = 0.75982535f;
                this.abc1000 = 0.4958767305027878d;
            }
            if (this.abc1005.size() > 7) {
                this.abc1005.add(9);
            }
            if (this.abc1005.size() > 8) {
                this.abc1005.add(3);
            }
            ArrayList<Integer> arrayList5 = this.abc1005;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1005.remove(0);
            }
        } else {
            Glide.m18504u(this).m1886q(this.logoFile).m2170p0(this.ivShowBigImage);
            this.abc1000 -= 0.11761950949625d;
            this.abc1002 = 0.90047956f;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            if (this.abc2 == null) {
                this.abc2 = new String[10];
                ArrayList<Integer> arrayList6 = this.abc1005;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    this.abc1005.remove(0);
                }
                this.abc1002 = 0.802465f;
                if (0.802465f < 0.77672416d) {
                    this.abc1002 = 0.07287663f;
                }
            }
            this.abc1000 *= 0.43274051080353293d;
            if (this.abc1002 < 0.9298787d) {
                this.abc1002 = 0.4068396f;
            }
            ArrayList<Integer> arrayList7 = this.abc1005;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.abc1005.remove(0);
            }
        }
        if (this.abc1002 > 0.9381229d) {
            this.abc1002 = 0.17069072f;
        }
        ArrayList<String> arrayList8 = this.abc1004;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1005.size() < 0) {
            this.abc1005.add(7);
        }
        String[] strArr2 = this.abc2;
        if (strArr2 != null) {
            strArr2[8] = " 800评";
            if (this.abc1004.size() > 9) {
                this.abc1004.add("ing stu");
            }
            ArrayList<Integer> arrayList9 = this.abc1005;
            if (arrayList9 == null && arrayList9.size() > 0) {
                this.abc1005.remove(0);
            }
            this.abc1002 = 0.98019916f;
        }
        this.abc1002 = Math.abs(this.abc1002);
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
    }

    public void setLogoFile(File file) {
        this.logoFile = file;
        float f = this.abc1002 * 0.68634975f;
        this.abc1002 = f;
        if (f < 0.66861016d) {
            this.abc1002 = 0.6894905f;
        }
        this.abc1003 = ((double) this.abc1003) < 0.36801136d ? 0.123461425f : 0.37298095f;
        int[] iArr = this.abc0;
        if (iArr != null) {
            iArr[1] = 0;
            this.abc1003 = 0.48289323f;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            this.abc1002 -= 0.3042562f;
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        this.abc1002 = 0.57634574f;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
        this.abc1002 = ((double) this.abc1002) < 0.21731728d ? 0.12154025f : 0.81125605f;
        this.abc1003 = ((double) this.abc1003) < 0.9050751d ? 0.28302914f : 0.2877736f;
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        String[] strArr = this.abc1;
        if (strArr != null) {
            strArr[6] = null;
            if (this.abc1004.size() < 3) {
                this.abc1004.add("at");
            }
            this.abc1000 = 0.47385668543732606d;
            if (this.abc1001 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = this.abc1001;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 9;
                    i++;
                }
            }
        }
        this.abc1000 = -this.abc1000;
        int[] iArr2 = this.abc1001;
        if (iArr2 != null) {
            iArr2[2] = 0;
        }
        this.abc1003 = Math.abs(this.abc1003);
    }
}
