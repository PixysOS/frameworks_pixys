package pixys.support.lottie.model.content;


import android.support.annotation.Nullable;

import pixys.support.lottie.LottieDrawable;
import pixys.support.lottie.animation.content.Content;
import pixys.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
