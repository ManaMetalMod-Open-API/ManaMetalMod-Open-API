package net.manametal.oapi.api.register;

import javax.annotation.CheckForNull;
import net.manametal.oapi.api.api.IM3Recipe;

public class Registries {
  /**
   * 注册数据单例对象，在窗口期结束后会被回收。
   *
   * @see net.manametal.oapi.api.anno.M3ApiPoint
   * @see net.manametal.oapi.api.event.M3ApiRegisterEvent
   */
  @CheckForNull
  public static Registries INSTANCE = new Registries();
  
  public static final ObjectRegister<IM3Recipe> MANA_CRAFT_TABLE_RECIPES = new ObjectRegister<>();
  
  
  public static void clean() {
    INSTANCE = null;
  }
}
