package pixys.support.lottie.model.animatable;

import pixys.support.lottie.value.Keyframe;
import pixys.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import pixys.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import pixys.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
