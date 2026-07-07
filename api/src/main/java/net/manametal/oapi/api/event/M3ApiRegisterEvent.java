package net.manametal.oapi.api.event;

import cpw.mods.fml.common.eventhandler.Event;

public class M3ApiRegisterEvent extends Event {
  /**
   * 当 M3OpenAPI 数据准备注册期间，会向 EventBus 推送注册事件。此事件将会早于 {@link net.manametal.oapi.api.anno.M3ApiPoint} 被广播。
   *
   * @see net.manametal.oapi.api.register.Registries
   * @see net.manametal.oapi.api.anno.M3ApiPoint
   */
  public static class Start {
  }

  /**
   * 当全部数据注册完毕后推送。此事件意味着可以调用 M3 相关数据。
   *
   * 此事件意味着 API 生命周期已经结束，并且数据会被销毁。
   */
  public static class Stop {
  }
}
