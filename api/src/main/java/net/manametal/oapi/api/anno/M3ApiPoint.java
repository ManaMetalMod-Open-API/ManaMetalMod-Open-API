package net.manametal.oapi.api.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * M3OpenAPI 载入口，采用此注解将一定能给在注册期内完成 API 注册。
 *
 * @see net.manametal.oapi.api.event.M3ApiRegisterEvent
 * @see net.manametal.oapi.api.register.Registries
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface M3ApiPoint {
}
