package com.shashank.sony.fancydialoglib;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.ref.WeakReference;

/**
 * Created by Shashank Singhal on 03/01/2018.
 */

public class FancyAlertDialog {

    private String title, message, positiveBtnText, negativeBtnText;
    @DrawableRes
    private int icon;
    @Visibility
    private int visibility;
    private Animation animation;
    private FancyAlertDialogListener pListener, nListener;
    @ColorInt
    private int pBtnColor, nBtnColor, bgColor;
    private boolean cancel;
    private Dialog dialog;

    private FancyAlertDialog(Builder builder) {
        this.title = builder.title;
        this.message = builder.message;
        this.icon = builder.icon;
        this.animation = builder.animation;
        this.visibility = builder.visibility;
        this.pListener = builder.pListener;
        this.nListener = builder.nListener;
        this.positiveBtnText = builder.positiveBtnText;
        this.negativeBtnText = builder.negativeBtnText;
        this.pBtnColor = builder.pBtnColor;
        this.nBtnColor = builder.nBtnColor;
        this.bgColor = builder.bgColor;
        this.cancel = builder.cancel;
        this.dialog = builder.dialog;
    }

    public FancyAlertDialog show() {
        dialog.show();
        return this;
    }

    public FancyAlertDialog dismiss() {
        dialog.dismiss();
        return this;
    }

    // region builder

    public static class Builder {

        private String title, message, positiveBtnText, negativeBtnText;
        @DrawableRes
        private int icon;
        @Visibility
        private int visibility;
        private Animation animation;
        private FancyAlertDialogListener pListener, nListener;
        @ColorInt
        private int pBtnColor, nBtnColor, bgColor;
        private boolean cancel;

        /**
         * Always have weak references of context in libraries to avoid memory leaks.
         **/
        private WeakReference<Context> context;
        private Dialog dialog;

        private Builder(Context context) {
            // use #with
            this.context = new WeakReference<>(context);
        }

        public static Builder with(@NonNull Context context) {
            return new Builder(context);
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBackgroundColor(@ColorInt int bgColor) {
            this.bgColor = bgColor;
            return this;
        }

        public Builder setBackgroundColorRes(@ColorRes int bgColor) {
            return setBackgroundColor(context.get().getResources().getColor(bgColor));
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setPositiveBtnText(String positiveBtnText) {
            this.positiveBtnText = positiveBtnText;
            return this;
        }

        public Builder setPositiveBtnBackground(@ColorInt int pBtnColor) {
            this.pBtnColor = pBtnColor;
            return this;
        }

        public Builder setPositiveBtnBackgroundRes(@ColorRes int pBtnColor) {
            return setPositiveBtnBackground(context.get().getResources().getColor(pBtnColor));
        }

        public Builder setNegativeBtnText(String negativeBtnText) {
            this.negativeBtnText = negativeBtnText;
            return this;
        }

        public Builder setNegativeBtnBackground(@ColorInt int nBtnColor) {
            this.nBtnColor = nBtnColor;
            return this;
        }

        public Builder setNegativeBtnBackgroundRes(@ColorRes int nBtnColor) {
            return setNegativeBtnBackground(context.get().getResources().getColor(nBtnColor));
        }

        //setIcon
        public Builder setIcon(@DrawableRes int icon, @Visibility int visibility) {
            this.icon = icon;
            this.visibility = visibility;
            return this;
        }

        public Builder setAnimation(Animation animation) {
            this.animation = animation;
            return this;
        }

        //set Positive listener
        public Builder onPositiveClicked(@Nullable FancyAlertDialogListener pListener) {
            this.pListener = pListener;
            return this;
        }

        //set Negative listener
        public Builder onNegativeClicked(@Nullable FancyAlertDialogListener nListener) {
            this.nListener = nListener;
            return this;
        }

        public Builder isCancellable(boolean cancel) {
            this.cancel = cancel;
            return this;
        }

        public FancyAlertDialog build() {
            TextView message1, title1;
            ImageView iconImg;
            Button nBtn, pBtn;
            View view;
            if (animation == Animation.POP)
                dialog = new Dialog(context.get(), R.style.PopTheme);
            else if (animation == Animation.SIDE)
                dialog = new Dialog(context.get(), R.style.SideTheme);
            else if (animation == Animation.SLIDE)
                dialog = new Dialog(context.get(), R.style.SlideTheme);
            else
                dialog = new Dialog(context.get());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(cancel);
            dialog.setContentView(R.layout.fancyalertdialog);

            //getting resources
            view = dialog.findViewById(R.id.background);
            title1 = dialog.findViewById(R.id.title);
            message1 = dialog.findViewById(R.id.message);
            iconImg = dialog.findViewById(R.id.icon);
            nBtn = dialog.findViewById(R.id.negativeBtn);
            pBtn = dialog.findViewById(R.id.positiveBtn);
            title1.setText(title);
            message1.setText(message);
            if (positiveBtnText != null)
                pBtn.setText(positiveBtnText);
            if (pBtnColor != 0) {
                GradientDrawable bgShape = (GradientDrawable) pBtn.getBackground();
                bgShape.setColor(pBtnColor);
            }
            if (nBtnColor != 0) {
                GradientDrawable bgShape = (GradientDrawable) nBtn.getBackground();
                bgShape.setColor(nBtnColor);
            }
            if (negativeBtnText != null)
                nBtn.setText(negativeBtnText);
            iconImg.setImageResource(icon);
            iconImg.setVisibility(visibility);
            if (bgColor != 0)
                view.setBackgroundColor(bgColor);
            if (pListener != null) {
                pBtn.setOnClickListener(v -> {
                    pListener.onClick(dialog);
                    dialog.dismiss();
                });
            } else {
                pBtn.setOnClickListener(v -> dialog.dismiss());
            }

            if (nListener != null) {
                nBtn.setVisibility(View.VISIBLE);
                nBtn.setOnClickListener(v -> {
                    nListener.onClick(dialog);
                    dialog.dismiss();
                });
            }

            // note: builder should only create an object and
            // leave the showing/dismissing of the dialog to library user
            // dialog.show();

            return new FancyAlertDialog(this);

        }
    }

    // endregion

}
