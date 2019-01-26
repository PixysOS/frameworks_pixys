package pixys.support.lottie.model.animatable;

import android.graphics.Path;

import pixys.support.lottie.value.Keyframe;
import pixys.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import pixys.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import pixys.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
