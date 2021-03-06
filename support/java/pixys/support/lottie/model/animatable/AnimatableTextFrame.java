package pixys.support.lottie.model.animatable;

import pixys.support.lottie.value.Keyframe;
import pixys.support.lottie.animation.keyframe.TextKeyframeAnimation;
import pixys.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
